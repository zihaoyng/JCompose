package edu.cmu.cs780.project;

import java.util.ArrayList;
import java.util.List;
import org.jfugue.player.Player;

/**
 * A final class representing a {@link Track} of chords in a musical composition.
 * This class implements the {@link Track} interface and manages a sequence of musical {@link Bar}s,
 * each containing chords with their associated {@link Duration}s as {@link ChordWithDuration}. It also maintains a {@link TimeSignature} for the track.
 */
final class ChordTrack implements Track {
    /** A list of {@link Bar}s, each containing a sequence of {@link ChordWithDuration} objects. */
    private final List<Bar<ChordWithDuration>> bars;

    /** The {@link TimeSignature} of the {@link ChordTrack}. */
    private final TimeSignature timeSignature;

    /** The {@link Instrument} used in this track. */
    private final Instrument instrument;

    /**
     * Constructs a {@link ChordTrack} with a default {@link TimeSignature} of 4/4.
     * Initializes an empty list of {@link Bar}s.
     * The default time signature is set to 4/4.
     * The default instrument is set to piano.
     */
    ChordTrack() {
        this.bars = new ArrayList<>();
        this.timeSignature = TimeSignature.FOUR_FOUR;
        this.instrument = Instrument.PIANO;
    }

    /**
     * Constructs a {@link ChordTrack} with the specified {@link TimeSignature}.
     * Initializes an empty list of {@link Bar}s.
     * The default instrument is set to piano.
     *
     * @param timeSignature The specified {@link TimeSignature} for the track.
     */
    ChordTrack(TimeSignature timeSignature) {
        this.bars = new ArrayList<>();
        this.timeSignature = timeSignature;
        this.instrument = Instrument.PIANO;
    }

    /**
     * Constructs a {@link ChordTrack} with the specified {@link Instrument}.
     * Initializes an empty list of {@link Bar}s.
     * The default time signature is set to 4/4.
     *
     * @param instrument The {@link Instrument} used in the track.
     */
    ChordTrack(Instrument instrument) {
        this.bars = new ArrayList<>();
        this.timeSignature = TimeSignature.FOUR_FOUR;
        this.instrument = instrument;
    }

    /**
     * Constructs a {@link ChordTrack} with a specified {@link TimeSignature} and {@link Instrument}.
     * Initializes an empty list of {@link Bar}s.
     *
     * @param timeSignature The {@link TimeSignature} of the track.
     * @param instrument    The {@link Instrument} used in the track.
     */
    ChordTrack(TimeSignature timeSignature, Instrument instrument) {
        this.bars = new ArrayList<>();
        this.timeSignature = timeSignature;
        this.instrument = instrument;
    }

    /**
     * Private constructor for internal use.
     * Constructs a {@link ChordTrack} with a predefined list of {@link Bar}s and a specified {@link TimeSignature}.
     *
     * @param bars          The list of {@link Bar} objects containing {@link Note} objects.
     * @param timeSignature The {@link TimeSignature} of the track.
     * @param instrument    The {@link Instrument} used in the track.
     */
    private ChordTrack(List<Bar<ChordWithDuration>> bars, TimeSignature timeSignature, Instrument instrument) {
        this.bars = new ArrayList<>(bars);
        this.timeSignature = timeSignature;
        this.instrument = instrument;
    }

    /**
     * Validates the total {@link Duration} of the {@link ChordWithDuration}s in a {@link Bar}.
     * Ensures that the total {@link Duration} of {@link ChordWithDuration}s in a {@link Bar} matches the {@link TimeSignature}'s measure {@link Duration}.
     *
     * @param newChords The list of {@link ChordWithDuration} to validate.
     * @return {@code true} if the {@link Bar}'s {@link Duration} is valid, otherwise throws an IllegalArgumentException.
     * @throws IllegalArgumentException If the {@link Bar}'s total {@link Duration} does not match the {@link TimeSignature}'s measure {@link Duration}.
     */
    private boolean isValidBar(List<ChordWithDuration> newChords) {
        double duration = 0;
        for (ChordWithDuration c : newChords) {
            duration += c.getDurationValue();
        }
        if (Math.abs(duration - this.timeSignature.getMeasureDuration()) > 1e-5) {
            throw new IllegalArgumentException("ChordTrack has oversized bar(s)");
        }
        return true;
    }

    /**
     * Adds a new {@link Bar} of {@link ChordWithDuration} to the track.
     * A {@link ChordWithDuration} consists of a {@link Chord} and {@link Duration}
     * The notes input should saisfy the total beats specified the {@link TimeSignature}
     * in the track. Otherwise, a runtime exception will be thrown
     * 
     * @param newChords The list of {@link ChordWithDuration} to add as a new {@link Bar}.
     * @return A new {@link ChordTrack} instance with the added {@link Bar}.
     * 
     * ChordTrack c = new ChordTrack(Instrument.ALTO_SAX);
     * c = c.addBar(
     *  // A Minor 7 (5th note half step down)
     *  Arrays.asList(
     *      new ChordWithDuration(
     *          new Chord(Pitch.A3, BaseChordType.MINOR_7).alter(IntervalAlteration.FLATTED_5), 
     *          Duration.WHOLE)
     *  )
     * );
     */
    ChordTrack addBar(List<ChordWithDuration> newChords) {
        isValidBar(newChords);
        List<Bar<ChordWithDuration>> updatedChords = new ArrayList<>(this.bars);
        updatedChords.add(new Bar<ChordWithDuration>(newChords));
        return new ChordTrack(updatedChords, this.timeSignature, this.instrument);
    }

    /**
     * Appends another {@link ChordTrack} to this track.
     * Combines the bars from the specified {@link ChordTrack} to the end of this track.
     *
     * @param other The {@link ChordTrack} to append.
     * @return A new {@link ChordTrack} instance representing the combined track.
     */
    ChordTrack append(ChordTrack other) {
        List<Bar<ChordWithDuration>> combinedChords = new ArrayList<>(this.bars);
        combinedChords.addAll(other.bars);
        return new ChordTrack(combinedChords, this.timeSignature, this.instrument);
    }

    /**
     * Retrieves the list of {@link Bar} objects in this {@link ChordTrack}.
     * 
     * @return A list of {@link Bar} objects containing {@link ChordWithDuration} objects.
     */
    List<Bar<ChordWithDuration>> getBars() {
        return new ArrayList<>(this.bars);
    }

    /**
     * Plays the musical elements contained within this {@link ChordTrack}.
     */
    @Override
    public void play() {
        String s = this.toJFugueString();
        System.out.println(s);

        org.jfugue.pattern.Pattern p2 = new org.jfugue.pattern.Pattern(s).setVoice(1).setInstrument("Flute");
        Player player = new Player();
        player.play(p2);
    }

    /**
     * Converts the {@link ChordTrack}'s musical content into a JFugue-compatible {@link String} format.
     * This method should return a {@link String} representation of the {@link ChordTrack} suitable for JFugue.
     *
     * @return A {@link String} representing the {@link ChordTrack} in JFugue format.
     */
    @Override
    public String toJFugueString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TIME:").append(this.timeSignature.toString()).append(" ");
        // Implementation of play for MelodyTrack
        for (Bar<ChordWithDuration> bar : this.bars) {
            for (ChordWithDuration note : bar.getNotes()) {
                String noteString = note.getChordRepr() + note.getDurationRepr()+ " ";
                sb.append(noteString);
            }
            sb.append(" | ");
        }
        return sb.toString();
    }

    /**
     * Validates the contents of the {@link ChordTrack}.
     */
    @Override
    public void validateTrack() {}

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
