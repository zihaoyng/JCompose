package edu.cmu.cs780.project;
import java.util.Arrays;
/**
 * Demo Client Code
 * 
 * 1. Create a melody track
 * 2. Create a chord track
 * 3. Generate accompaniment from chord Track
 * 4. Create a music with melody and chord track
 * 5. Export the music to midi
 * 6. Play the music
 */
public class App {
    public static void main(String[] args) {
        // 1. Create a melody track
        MelodyTrack m = new MelodyTrack(TimeSignature.FOUR_FOUR, Instrument.ACCORDIAN);
        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.REST, Duration.QUARTER),
                new Note(Pitch.G5, Duration.QUARTER),
                new Note(Pitch.A5, Duration.QUARTER),
                new Note(Pitch.B_FLAT5, Duration.QUARTER)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.E_FLAT6, Duration.WHOLE, Tie.START)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.E_FLAT6, Duration.QUARTER, Tie.END),
                new Note(Pitch.F5, Duration.QUARTER),
                new Note(Pitch.G5, Duration.QUARTER),
                new Note(Pitch.A5, Duration.QUARTER)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.D6, Duration.WHOLE, Tie.START)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.D6, Duration.QUARTER, Tie.END),
                new Note(Pitch.E_FLAT5, Duration.QUARTER),
                new Note(Pitch.F5, Duration.QUARTER),
                new Note(Pitch.G5, Duration.QUARTER)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.C6, Duration.WHOLE, Tie.START)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.C6, Duration.QUARTER, Tie.END),
                new Note(Pitch.D5, Duration.QUARTER),
                new Note(Pitch.E5, Duration.QUARTER),
                new Note(Pitch.F_SHARP5, Duration.QUARTER)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.B_FLAT5, Duration.WHOLE)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.REST, Duration.QUARTER),
                new Note(Pitch.G5, Duration.QUARTER),
                new Note(Pitch.A5, Duration.QUARTER),
                new Note(Pitch.B_FLAT5, Duration.QUARTER)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.E_FLAT6, Duration.WHOLE, Tie.START)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.E_FLAT6, Duration.QUARTER, Tie.END),
                new Note(Pitch.F5, Duration.QUARTER),
                new Note(Pitch.G5, Duration.QUARTER),
                new Note(Pitch.A5, Duration.QUARTER)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.D6, Duration.WHOLE, Tie.START)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.D6, Duration.QUARTER, Tie.END),
                new Note(Pitch.E_FLAT5, Duration.QUARTER),
                new Note(Pitch.F5, Duration.QUARTER),
                new Note(Pitch.G5, Duration.QUARTER)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.C6, Duration.WHOLE, Tie.START)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.C6, Duration.QUARTER, Tie.END),
                new Note(Pitch.A5, Duration.QUARTER),
                new Note(Pitch.C6, Duration.QUARTER),
                new Note(Pitch.B_FLAT5, Duration.QUARTER)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.G5, Duration.WHOLE)
            )
        );

        //

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.REST, Duration.HALF),
                new Note(Pitch.F_SHARP5, Duration.QUARTER),
                new Note(Pitch.G5, Duration.QUARTER)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.A5, Duration.QUARTER),
                new Note(Pitch.D5, Duration.QUARTER),
                new Note(Pitch.A5, Duration.HALF, Tie.START)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.A5, Duration.QUARTER, Tie.END),
                new Note(Pitch.A5, Duration.QUARTER),
                new Note(Pitch.G5, Duration.QUARTER),
                new Note(Pitch.A5, Duration.QUARTER)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.B_FLAT5, Duration.WHOLE, Tie.START)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.B_FLAT5, Duration.QUARTER, Tie.END),
                new Note(Pitch.B_FLAT5, Duration.QUARTER),
                new Note(Pitch.A5, Duration.QUARTER),
                new Note(Pitch.B_FLAT5, Duration.QUARTER)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.C6, Duration.WHOLE, Tie.START)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.C6, Duration.QUARTER, Tie.END),
                new Note(Pitch.F5, Duration.QUARTER),
                new Note(Pitch.F6, Duration.DOTTED_QUARTER),
                new Note(Pitch.E_FLAT6, Duration.EIGHTH)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.D6, Duration.WHOLE, Tie.START)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.D6, Duration.HALF, Tie.END),
                new Note(Pitch.C_SHARP6, Duration.QUARTER),
                new Note(Pitch.D6, Duration.QUARTER)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.E_FLAT6, Duration.QUARTER),
                new Note(Pitch.E_FLAT6, Duration.QUARTER),
                new Note(Pitch.C6, Duration.QUARTER),
                new Note(Pitch.C6, Duration.QUARTER)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.A5, Duration.DOTTED_HALF),
                new Note(Pitch.E_FLAT6, Duration.QUARTER)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.D6, Duration.HALF),
                new Note(Pitch.D6, Duration.HALF, Tie.START)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.D6, Duration.HALF, Tie.END),
                new Note(Pitch.G5, Duration.HALF)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.C6, Duration.DOTTED_HALF),
                new Note(Pitch.B_FLAT5, Duration.QUARTER)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.A5, Duration.HALF),
                new Note(Pitch.B_FLAT5, Duration.QUARTER),
                new Note(Pitch.D5, Duration.QUARTER)
            )
        );

        m = m.addBar(
            Arrays.asList(
                new Note(Pitch.G5, Duration.WHOLE)
            )
        );
        // m.play();

        // 2. Create a chord track
        ChordTrack c = new ChordTrack(Instrument.ALTO_SAX);
        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(
                    new Chord(Pitch.REST, BaseChordType.REST),
                    Duration.WHOLE
                )
            )
        );
        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(new Chord(Pitch.C4, BaseChordType.MINOR_7), Duration.WHOLE)
            )
        );
        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(new Chord(Pitch.F4, BaseChordType.DOMINANT_7), Duration.WHOLE)
            )
        );
        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(new Chord(Pitch.B_FLAT3, BaseChordType.MAJOR_7), Duration.WHOLE)
            )
        );

        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(new Chord(Pitch.E_FLAT4, BaseChordType.MAJOR_7), Duration.WHOLE)
            )
        );

        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(
                    new Chord(Pitch.A3, BaseChordType.MINOR_7).alter(IntervalAlteration.FLATTED_5), 
                    Duration.WHOLE)
            )
        );

        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(new Chord(Pitch.D4, BaseChordType.DOMINANT_7), Duration.WHOLE)
            )
        );

        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(new Chord(Pitch.G4, BaseChordType.MINOR_7), Duration.WHOLE)
            )
        );

        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(
                    new Chord(Pitch.REST, BaseChordType.REST),
                    Duration.WHOLE
                )
            )
        );
        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(new Chord(Pitch.C4, BaseChordType.MINOR_7), Duration.WHOLE)
            )
        );
        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(new Chord(Pitch.F4, BaseChordType.DOMINANT_7), Duration.WHOLE)
            )
        );
        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(new Chord(Pitch.B_FLAT3, BaseChordType.MAJOR_7), Duration.WHOLE)
            )
        );

        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(new Chord(Pitch.E_FLAT4, BaseChordType.MAJOR_7), Duration.WHOLE)
            )
        );

        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(
                    new Chord(Pitch.A3, BaseChordType.MINOR_7).alter(IntervalAlteration.FLATTED_5), 
                    Duration.WHOLE)
            )
        );

        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(new Chord(Pitch.D4, BaseChordType.DOMINANT_7), Duration.WHOLE)
            )
        );

        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(new Chord(Pitch.G4, BaseChordType.MINOR_7), Duration.HALF),
                new ChordWithDuration(
                    new Chord(Pitch.A3, BaseChordType.MINOR_7).alter(IntervalAlteration.FLATTED_5), 
                    Duration.HALF)
            )
        );

        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(new Chord(Pitch.G4, BaseChordType.MINOR_7), Duration.WHOLE)
            )
        );

        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(
                    new Chord(Pitch.A3, BaseChordType.MINOR_7).alter(IntervalAlteration.FLATTED_5), 
                    Duration.WHOLE)
            )
        );

        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(new Chord(Pitch.D4, BaseChordType.DOMINANT_7), Duration.WHOLE)
            )
        );

        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(new Chord(Pitch.G4, BaseChordType.MINOR_7), Duration.WHOLE)
            )
        );

        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(new Chord(Pitch.G4, BaseChordType.MINOR_7), Duration.WHOLE)
            )
        );

        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(new Chord(Pitch.C4, BaseChordType.MINOR_7), Duration.WHOLE)
            )
        );

        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(new Chord(Pitch.F4, BaseChordType.DOMINANT_7), Duration.WHOLE)
            )
        );
        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(new Chord(Pitch.B_FLAT3, BaseChordType.MAJOR_7), Duration.WHOLE)
            )
        );

        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(new Chord(Pitch.E_FLAT4, BaseChordType.MAJOR_7), Duration.WHOLE)
            )
        );

        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(
                    new Chord(Pitch.A3, BaseChordType.MINOR_7).alter(IntervalAlteration.FLATTED_5), 
                    Duration.WHOLE)
            )
        );

        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(new Chord(Pitch.D4, BaseChordType.DOMINANT_7), Duration.WHOLE)
            )
        );

        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(new Chord(Pitch.G4, BaseChordType.MINOR_7), Duration.WHOLE)
            )
        );

        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(new Chord(Pitch.F4, BaseChordType.MINOR_7), Duration.HALF),
                new ChordWithDuration(new Chord(Pitch.B_FLAT4, BaseChordType.DOMINANT_7), Duration.HALF)
            )
        );

        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(new Chord(Pitch.E_FLAT4, BaseChordType.MAJOR_7), Duration.WHOLE)
            )
        );

        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(
                    new Chord(Pitch.A3, BaseChordType.MINOR_7).alter(IntervalAlteration.FLATTED_5), 
                    Duration.HALF),
                new ChordWithDuration(
                    new Chord(Pitch.D4, BaseChordType.DOMINANT_7).alter(IntervalAlteration.SHARPENED_5), 
                    Duration.HALF)
            )
        );

        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(new Chord(Pitch.G4, BaseChordType.MINOR_7), Duration.WHOLE)
            )
        );

        c = c.addBar(
            Arrays.asList(
                new ChordWithDuration(new Chord(Pitch.G4, BaseChordType.DOMINANT_7), Duration.WHOLE)
            )
        );

        // 3. Generate accompaniment from chord Track
        AccompanimentTrack accompaniment = JCompose.generateAccompaniment(c, BuiltInPattern.PLAIN);

        // 4. Creare a music with melody and chord track
        Music music = new Music(accompaniment, m);

        // 5. Export the music to midi
        music.toMidi("./test.mid");

        // 6. Play the music
        music.play();
    }
}
