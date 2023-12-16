package edu.cmu.cs780.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import org.jfugue.player.Player;

/**
 * A final class representing a {@link MelodyTrack} in a musical composition.
 * This class implements the {@link Track} interface and manages a sequence of musical {@link Bar}s,
 * each containing a series of {@link Note}s. It also maintains a {@link TimeSignature} for the track.
 */
final class MelodyTrack implements Track {
    /** A list of {@link Bar}s, each containing a sequence of {@link Note} objects. */
    private final List<Bar<Note>> bars;

    /** The {@link TimeSignature} of the track. */
    private final TimeSignature timeSignature;

    /** The {@link Instrument} used in this track. */
    private final Instrument instrument;

    /**
     * Constructs a {@link MelodyTrack} with a default {@link TimeSignature} of 4/4.
     * Initializes an empty list of {@link Bar}s.
     * The default time signature is set to 4/4.
     * The default instrument is set to piano.
     */
    MelodyTrack() {
        this.bars = new ArrayList<>();
        this.timeSignature = TimeSignature.FOUR_FOUR;
        this.instrument = Instrument.PIANO;
    }

    /**
     * Constructs a {@link MelodyTrack} with the specified {@link TimeSignature}.
     * Initializes an empty list of {@link Bar}s.
     * The default instrument is set to piano.
     *
     * @param timeSignature The specified {@link TimeSignature} for the track.
     */
    MelodyTrack(TimeSignature timeSignature) {
        this.bars = new ArrayList<>();
        this.timeSignature = timeSignature;
        this.instrument = Instrument.PIANO;
    }

    /**
     * Constructs a {@link MelodyTrack} with a specified {@link TimeSignature} and {@link Instrument}.
     * Initializes an empty list of {@link Bar}s.
     * The default time signature is set to 4/4.
     *
     * @param instrument The {@link Instrument} used in the track.
     */
    MelodyTrack(Instrument instrument) {
        this.bars = new ArrayList<>();
        this.timeSignature = TimeSignature.FOUR_FOUR;
        this.instrument = instrument;
    }

    /**
     * Constructs a {@link MelodyTrack} with a specified {@link TimeSignature} and {@link Instrument}.
     * Initializes an empty list of {@link Bar}s.
     *
     * @param timeSignature The {@link TimeSignature} of the track.
     * @param instrument    The {@link Instrument} used in the track.
     */
    MelodyTrack(TimeSignature timeSignature, Instrument instrument) {
        this.bars = new ArrayList<>();
        this.timeSignature = timeSignature;
        this.instrument = instrument;
    }

    /**
     * Private constructor for internal use.
     * Constructs a {@link MelodyTrack} with a predefined list of {@link Bar}s and a specified {@link TimeSignature}.
     *
     * @param bars          The list of {@link Bar} objects containing {@link Note} objects.
     * @param timeSignature The {@link TimeSignature} of the track.
     * @param instrument    The {@link Instrument} used in the track.
     */
    private MelodyTrack(List<Bar<Note>> bars, TimeSignature timeSignature, Instrument instrument) {
        this.bars = new ArrayList<>(bars);
        this.timeSignature = timeSignature;
        this.instrument = instrument;
    }

    /**
     * Validates the total numeric duration of notes in a bar.
     * Ensures that the total numeric duration of notes in a bar matches the {@link TimeSignature}'s measure duration.
     *
     * @param notes The list of {@link Note} to validate.
     * @return {@code true} if the bar's duration is valid.
     * @throws IllegalArgumentException If the bar's total duration does not match the {@link TimeSignature}'s measure duration.
     */
    private boolean isValidBar(List<Note> notes) {
        double duration = 0;
        for (Note note : notes) {
            duration += note.getDurationValue();
        }
        if (Math.abs(duration - this.timeSignature.getMeasureDuration()) > 1e-5) {
            throw new IllegalArgumentException("MelodyTrack has oversized bar(s)");
        }
        return true;
    }

    /**
     * Adds a new {@link bar}, represented by a list of {@link Note}, to the track.
     * The notes input should saisfy the total beats specified the {@link TimeSignature}
     * in the track. Otherwise, a runtime exception will be thrown
     *
     * @param notes The list of {@link Note} to add as a new bar.
     * @return A new {@link MelodyTrack} instance with the added bar.
     * 
     * Example:
     * 
     * MelodyTrack m = new MelodyTrack(TimeSignature.FOUR_FOUR, Instrument.ACCORDIAN);
     * m = m.addBar(
     *  Arrays.asList(
     *      new Note(Pitch.REST, Duration.QUARTER),
     *      new Note(Pitch.G5, Duration.QUARTER),
     *      new Note(Pitch.A5, Duration.QUARTER),
     *      new Note(Pitch.B_FLAT5, Duration.QUARTER)
     *  )
     * );
     * 
     */
    MelodyTrack addBar(List<Note> notes) {
        isValidBar(notes);
        List<Bar<Note>> updatedBars = new ArrayList<>(this.bars);

        updatedBars.add(new Bar<Note>(notes));
        return new MelodyTrack(updatedBars, this.timeSignature, this.instrument);
    }

    /**
     * Adds a new {@link Bar} to the track.
     * Directly adds the specified {@link Bar} without validation.
     *
     * @param bar The {@link Bar} of {@link Note} to add.
     * @return A new {@link MelodyTrack} instance with the added {@link Bar}.
     */
    MelodyTrack addBar(Bar<Note> bar) {
        List<Bar<Note>> updatedBars = new ArrayList<>(this.bars);

        updatedBars.add(bar);
        return new MelodyTrack(updatedBars, this.timeSignature, this.instrument);
    }

    /**
     * Appends another {@link MelodyTrack} to this track.
     * Combines the {@link Bar}s from the specified {@link MelodyTrack} to the end of this track.
     *
     * @param other The {@link MelodyTrack} to append.
     * @return A new {@link MelodyTrack} instance representing the combined track.
     */
    MelodyTrack append(MelodyTrack other) {
        List<Bar<Note>> combinedBars = new ArrayList<>(this.bars);
        combinedBars.addAll(other.bars);
        return new MelodyTrack(combinedBars, timeSignature, this.instrument);
    }

    /**
     * Retrieves the list of {@link Bar}s in the track.
     * 
     * @return A list of {@link Bar} objects containing {@link Note} objects.
     */
    List<Bar<Note>> getBars() {
        return new ArrayList<>(this.bars);
    }

    /**
     * Plays the musical elements contained within this track.
     */
    @Override
    public void play() {
        validateTrack();
        String s = this.toJFugueString();
        System.out.println(s);

        org.jfugue.pattern.Pattern p2 = new org.jfugue.pattern.Pattern(s).setVoice(1).setInstrument("Flute");
        Player player = new Player();
        player.play(p2);
    }

    /**
     * Validates the contents of the track.
     * This method checks for any inconsistencies or errors in the track's musical elements.
     */
    @Override
    public void validateTrack() {
        validateTies();
    }

    /**
     * Validates the {@link Tie}s between {@link Note}s in the track.
     * Ensures that tied {@link Note}s are correctly sequenced and matched.
     * @throws RuntimeException If there is a mismatch in note ties.
     */
    private void validateTies() {
        Stack<Pitch> stack = new Stack<>(); 
        for (Bar<Note> bar : this.bars) {
            for (Note note : bar.getNotes()) {
                if (note.getTie() == Tie.START) {
                    if (!stack.isEmpty()) {
                        throw new RuntimeException("Error: MelodyTrack Tie Start Mismatch");
                    }
                    stack.push(note.pitch);
                } else if (note.getTie() == Tie.END) {
                    if (stack.isEmpty() || stack.peek() != note.pitch) {
                        throw new RuntimeException("Error: MelodyTrack Tie End Mismatch");
                    }
                    stack.pop();

                } else if (note.getTie() == Tie.CONTINUE) {
                    if (!stack.isEmpty() || stack.peek() != note.pitch) {
                        throw new RuntimeException("Error: MelodyTrack Tie Continue Mismatch");
                    }
                } else{ // null
                    if (!stack.isEmpty()) {
                        throw new RuntimeException("Error: MelodyTrack Tie Null Mismatch");
                    }
                }
            }
        }

        if (!stack.isEmpty()) {
            throw new RuntimeException("Error: MelodyTrack Tie Mismatch");
        }

    }

    /**
     * Converts the track's musical content into a JFugue-compatible {@link String} format.
     * This method should return a {@link String} representation of the track suitable for JFugue.
     *
     * @return A {@link String} representing the track in JFugue format.
     */
    @Override
    public String toJFugueString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TIME:").append(this.timeSignature.toString()).append(" ");
        // Implementation of play for MelodyTrack
        for (Bar<Note> bar : this.bars) {
            for (Note note : bar.getNotes()) {
                String noteString = "";
                if (note.getTieRepr() != null) {
                    switch (note.getTieRepr()) {
                        case "start":
                            noteString = note.getPitchRepr() + note.getDurationRepr() + "- ";
                            break;
                        case "continue":
                            noteString = note.getPitchRepr() + "-" + note.getDurationRepr() + "- ";
                            break; 
                        case "end":
                            noteString = note.getPitchRepr() + "-" + note.getDurationRepr() + " ";
                            break;
                    }
                } else {
                    noteString = note.getPitchRepr() + note.getDurationRepr() + " ";
                }
                sb.append(noteString);
            }
            sb.append(" | ");
        }
        return sb.toString();
    }

    /**
     * Retrieves the instrument associated with this track.
     * 
     * @return The {@link Instrument} enum constant representing the instrument used in this track.
     */
    @Override
    public Instrument getInstrument() {
        return this.instrument;
    }

    /**
     * Retrieves the time signature associated with this track.
     * 
     * @return The {@link TimeSignature} enum constant representing the time signature used in this track.
     */
    @Override
    public TimeSignature getTimeSignature() {
        return this.timeSignature;
    }
}
