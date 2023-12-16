package edu.cmu.cs780.project;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;

import org.jfugue.player.Player;
import org.jfugue.midi.MidiParserListener;
import org.jfugue.pattern.PatternProducer;
import org.staccato.StaccatoParser;

/**
 * The {@link Music} class represents a collection of musical {@link Track}s.
 * It allows for the creation, manipulation, and playback of these {@link Track}s,
 * as well as exporting them to various formats like MIDI and sheet music.
 */
class Music {
    /** A list of {@link Track}s. */
    private final List<Track> tracks;

    /** A list of {@link org.jfugue.pattern.Pattern}s. */
    private final List<org.jfugue.pattern.Pattern> patternList;

    /**
     * Constructs a new, empty {@link Music} object.
     * The default {@link Instrument} is set to be piano.
     */
    Music() {
        this.tracks = new ArrayList<>();
        this.patternList = new ArrayList<>();
    }

    /**
     * Constructs a new {@link Music} object with the specified initial {@link Track}s.
     * The default {@link Instrument} is set to be piano.
     * @param initialTracks An array of {@link Track} objects to be added to the music composition.
     */
    Music(Track... initialTracks) {
        this();
        for (Track track : initialTracks) {
            this.tracks.add(track);
        }

        for (int i=0; i < this.tracks.size(); i++) {
            Track track = this.tracks.get(i);
            track.validateTrack();

            this.patternList.add(
                new org.jfugue.pattern.Pattern(track.toJFugueString()).
                setVoice(i).setInstrument(track.getInstrument().getJFugueName())
            );
        }
    }

    /**
     * Plays the music.
     */
    public void play() {
        Player player = new Player();
        player.play(this.patternList.toArray(new org.jfugue.pattern.Pattern[0]));
    }

    /**
     * Adds a new {@link Track} to the music composition.
     *
     * @param track The {@link Track} object to be added.
     */
    void addTrack(Track track) {
        tracks.add(track);
    }

    /**
     * Converts the music composition to a MIDI file and saves it to the specified location.
     *
     * @param filePath The file path where the MIDI file will be saved.
     * @throws IOException If there is an error in writing the MIDI file.
     */
    void toMidi(String filePath) {
        // Logic to convert music to a MIDI file
        PatternProducer pp = (PatternProducer)(new org.jfugue.pattern.Pattern(
            this.patternList.toArray(new org.jfugue.pattern.Pattern[0])));

        StaccatoParser staccatoParser = new StaccatoParser();
        MidiParserListener midiParserListener = new MidiParserListener();
        staccatoParser.addParserListener(midiParserListener);

        staccatoParser.parse(pp);
        Sequence seq = midiParserListener.getSequence();

        File outputFile = new File(filePath);
        try {
            // Use MidiSystem to write the sequence to a file
            int bytesWritten = MidiSystem.write(seq, 1, outputFile);
            System.out.println("MIDI file saved: " + bytesWritten + " bytes written to " + filePath);
        } catch (IOException e) {
            System.err.println("Error writing MIDI file: " + e.getMessage());
        }
    }
}
