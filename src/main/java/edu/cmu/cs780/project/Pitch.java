package edu.cmu.cs780.project;

/**
 * Enumerates the musical pitches, including enharmonic equivalents and pitches across various octaves.
 * This enum also includes a special 'REST' pitch to denote a musical rest.
 */
public enum Pitch {
    /** Represents the musical pitch 'C'. */
    C("C"), 

    /** Represents the musical pitch 'C#'. */
    C_SHARP("C#"),

    /** Represents the musical pitch 'Db'. */
    D_FLAT("Db"), 

    /** Represents the musical pitch 'D'. */
    D("D"), 

    /** Represents the musical pitch 'D#'. */
    D_SHARP("D#"), 

    /** Represents the musical pitch 'Eb'. */
    E_FLAT("Eb"), 

    /** Represents the musical pitch 'E'. */
    E("E"), 

    /** Represents the musical pitch 'F'. */
    F("F"), 

    /** Represents the musical pitch 'F#'. */
    F_SHARP("F#"),

    /** Represents the musical pitch 'Gb'. */
    G_FLAT("Gb"),

    /** Represents the musical pitch 'G'. */
    G("G"),

    /** Represents the musical pitch 'G#'. */
    G_SHARP("G#"),

    /** Represents the musical pitch 'Ab'. */
    A_FLAT("Ab"),

    /** Represents the musical pitch 'A'. */
    A("A"),

    /** Represents the musical pitch 'A#'. */
    A_SHARP("A#"),

    /** Represents the musical pitch 'Bb'. */
    B_FLAT("Bb"),

    /** Represents the musical pitch 'B'. */
    B("B"),

    /** Represents the musical pitch 'C1'. */
    C1("C1"),

    /** Represents the musical pitch 'C#1'. */
    C_SHARP1("C#1"),

    /** Represents the musical pitch 'Db1'. */
    D_FLAT1("Db1"),

    /** Represents the musical pitch 'D1'. */
    D1("D1"),

    /** Represents the musical pitch 'D#1'. */
    D_SHARP1("D#1"),

    /** Represents the musical pitch 'Eb1'. */
    E_FLAT1("Eb1"),

    /** Represents the musical pitch 'E1'. */
    E1("E1"),

    /** Represents the musical pitch 'F1'. */
    F1("F1"),

    /** Represents the musical pitch 'F#1'. */
    F_SHARP1("F#1"),

    /** Represents the musical pitch 'Gb1'. */
    G_FLAT1("Gb1"),

    /** Represents the musical pitch 'G1'. */
    G1("G1"),

    /** Represents the musical pitch 'G#1'. */
    G_SHARP1("G#1"),

    /** Represents the musical pitch 'Ab1'. */
    A_FLAT1("Ab1"),

    /** Represents the musical pitch 'A1'. */
    A1("A1"),

    /** Represents the musical pitch 'A#1'. */
    A_SHARP1("A#1"),

    /** Represents the musical pitch 'Bb1'. */
    B_FLAT1("Bb1"),

    /** Represents the musical pitch 'B1'. */
    B1("B1"),

    /** Represents the musical pitch 'C2'. */
    C2("C2"),

    /** Represents the musical pitch 'C#2'. */
    C_SHARP2("C#2"),

    /** Represents the musical pitch 'Db2'. */
    D_FLAT2("Db2"),

    /** Represents the musical pitch 'D2'. */
    D2("D2"),

    /** Represents the musical pitch 'D#2'. */
    D_SHARP2("D#2"),

    /** Represents the musical pitch 'Eb2'. */
    E_FLAT2("Eb2"),

    /** Represents the musical pitch 'E2'. */
    E2("E2"),

    /** Represents the musical pitch 'F2'. */
    F2("F2"),

    /** Represents the musical pitch 'F#2'. */
    F_SHARP2("F#2"),

    /** Represents the musical pitch 'Gb2'. */
    G_FLAT2("Gb2"),

    /** Represents the musical pitch 'G2'. */
    G2("G2"),

    /** Represents the musical pitch 'G#2'. */
    G_SHARP2("G#2"),

    /** Represents the musical pitch 'Ab2'. */
    A_FLAT2("Ab2"),

    /** Represents the musical pitch 'A2'. */
    A2("A2"),

    /** Represents the musical pitch 'A#2'. */
    A_SHARP2("A#2"),

    /** Represents the musical pitch 'Bb2'. */
    B_FLAT2("Bb2"),

    /** Represents the musical pitch 'B2'. */
    B2("B2"),

    /** Represents the musical pitch 'C3'. */
    C3("C3"),

    /** Represents the musical pitch 'C#3'. */
    C_SHARP3("C#3"),

    /** Represents the musical pitch 'Db3'. */
    D_FLAT3("Db3"),

    /** Represents the musical pitch 'D3'. */
    D3("D3"),

    /** Represents the musical pitch 'D#3'. */
    D_SHARP3("D#3"),

    /** Represents the musical pitch 'Eb3'. */
    E_FLAT3("Eb3"),

    /** Represents the musical pitch 'E3'. */
    E3("E3"),

    /** Represents the musical pitch 'F3'. */
    F3("F3"),

    /** Represents the musical pitch 'F#3'. */
    F_SHARP3("F#3"),

    /** Represents the musical pitch 'Gb3'. */
    G_FLAT3("Gb3"),

    /** Represents the musical pitch 'G3'. */
    G3("G3"),

    /** Represents the musical pitch 'G#3'. */
    G_SHARP3("G#3"),

    /** Represents the musical pitch 'Ab3'. */
    A_FLAT3("Ab3"),

    /** Represents the musical pitch 'A3'. */
    A3("A3"),

    /** Represents the musical pitch 'A#3'. */
    A_SHARP3("A#3"),

    /** Represents the musical pitch 'Bb3'. */
    B_FLAT3("Bb3"),

    /** Represents the musical pitch 'B3'. */
    B3("B3"),

    /** Represents the musical pitch 'C4'. */
    C4("C4"),

    /** Represents the musical pitch 'C#4'. */
    C_SHARP4("C#4"),

    /** Represents the musical pitch 'Db4'. */
    D_FLAT4("Db4"),

    /** Represents the musical pitch 'D4'. */
    D4("D4"),

    /** Represents the musical pitch 'D#4'. */
    D_SHARP4("D#4"),

    /** Represents the musical pitch 'Eb4'. */
    E_FLAT4("Eb4"),

    /** Represents the musical pitch 'E4'. */
    E4("E4"),

    /** Represents the musical pitch 'F4'. */
    F4("F4"),

    /** Represents the musical pitch 'F#4'. */
    F_SHARP4("F#4"),

    /** Represents the musical pitch 'Gb4'. */
    G_FLAT4("Gb4"),

    /** Represents the musical pitch 'G4'. */
    G4("G4"),

    /** Represents the musical pitch 'G#4'. */
    G_SHARP4("G#4"),

    /** Represents the musical pitch 'Ab4'. */
    A_FLAT4("Ab4"),

    /** Represents the musical pitch 'A4'. */
    A4("A4"),

    /** Represents the musical pitch 'A#4'. */
    A_SHARP4("A#4"),

    /** Represents the musical pitch 'Bb4'. */
    B_FLAT4("Bb4"),

    /** Represents the musical pitch 'B4'. */
    B4("B4"),

    /** Represents the musical pitch 'C5', also known as middle C. */
    C5("C5"),

    /** Represents the musical pitch 'C#5'. */
    C_SHARP5("C#5"),

    /** Represents the musical pitch 'Db5'. */
    D_FLAT5("Db5"),

    /** Represents the musical pitch 'D5'. */
    D5("D5"),

    /** Represents the musical pitch 'D#5'. */
    D_SHARP5("D#5"),

    /** Represents the musical pitch 'Eb5'. */
    E_FLAT5("Eb5"),

    /** Represents the musical pitch 'E5'. */
    E5("E5"),

    /** Represents the musical pitch 'F5'. */
    F5("F5"),

    /** Represents the musical pitch 'F#5'. */
    F_SHARP5("F#5"),

    /** Represents the musical pitch 'Gb5'. */
    G_FLAT5("Gb5"),

    /** Represents the musical pitch 'G5'. */
    G5("G5"),

    /** Represents the musical pitch 'G#5'. */
    G_SHARP5("G#5"),

    /** Represents the musical pitch 'Ab5'. */
    A_FLAT5("Ab5"),

    /** Represents the musical pitch 'A5'. */
    A5("A5"),

    /** Represents the musical pitch 'A#5'. */
    A_SHARP5("A#5"),

    /** Represents the musical pitch 'Bb5'. */
    B_FLAT5("Bb5"),

    /** Represents the musical pitch 'B5'. */
    B5("B5"),

    /** Represents the musical pitch 'C6'. */
    C6("C6"),

    /** Represents the musical pitch 'C#6'. */
    C_SHARP6("C#6"),

    /** Represents the musical pitch 'Db6'. */
    D_FLAT6("Db6"),

    /** Represents the musical pitch 'D6'. */
    D6("D6"),

    /** Represents the musical pitch 'D#6'. */
    D_SHARP6("D#6"),

    /** Represents the musical pitch 'Eb6'. */
    E_FLAT6("Eb6"),

    /** Represents the musical pitch 'E6'. */
    E6("E6"),

    /** Represents the musical pitch 'F6'. */
    F6("F6"),

    /** Represents the musical pitch 'F#6'. */
    F_SHARP6("F#6"),

    /** Represents the musical pitch 'Gb6'. */
    G_FLAT6("Gb6"),

    /** Represents the musical pitch 'G6'. */
    G6("G6"),

    /** Represents the musical pitch 'G#6'. */
    G_SHARP6("G#6"),

    /** Represents the musical pitch 'Ab6'. */
    A_FLAT6("Ab6"),

    /** Represents the musical pitch 'A6'. */
    A6("A6"),

    /** Represents the musical pitch 'A#6'. */
    A_SHARP6("A#6"),

    /** Represents the musical pitch 'Bb6'. */
    B_FLAT6("Bb6"),

    /** Represents the musical pitch 'B6'. */
    B6("B6"),

    /** Represents the musical pitch 'C7'. */
    C7("C7"),

    /** Represents the musical pitch 'C#7'. */
    C_SHARP7("C#7"),

    /** Represents the musical pitch 'Db7'. */
    D_FLAT7("Db7"),

    /** Represents the musical pitch 'D7'. */
    D7("D7"),

    /** Represents the musical pitch 'D#7'. */
    D_SHARP7("D#7"),

    /** Represents the musical pitch 'Eb7'. */
    E_FLAT7("Eb7"),

    /** Represents the musical pitch 'E7'. */
    E7("E7"),

    /** Represents the musical pitch 'F7'. */
    F7("F7"),

    /** Represents the musical pitch 'F#7'. */
    F_SHARP7("F#7"),

    /** Represents the musical pitch 'Gb7'. */
    G_FLAT7("Gb7"),

    /** Represents the musical pitch 'G7'. */
    G7("G7"),

    /** Represents the musical pitch 'G#7'. */
    G_SHARP7("G#7"),

    /** Represents the musical pitch 'Ab7'. */
    A_FLAT7("Ab7"),

    /** Represents the musical pitch 'A7'. */
    A7("A7"),

    /** Represents the musical pitch 'A#7'. */
    A_SHARP7("A#7"),

    /** Represents the musical pitch 'Bb7'. */
    B_FLAT7("Bb7"),

    /** Represents the musical pitch 'B7'. */
    B7("B7"),

    /** Represents the musical pitch 'C8'. */
    C8("C8"),

    /** Represents the musical pitch 'C#8'. */
    C_SHARP8("C#8"),

    /** Represents the musical pitch 'Db8'. */
    D_FLAT8("Db8"),

    /** Represents the musical pitch 'D8'. */
    D8("D8"),

    /** Represents the musical pitch 'D#8'. */
    D_SHARP8("D#8"),

    /** Represents the musical pitch 'Eb8'. */
    E_FLAT8("Eb8"),

    /** Represents the musical pitch 'E8'. */
    E8("E8"),

    /** Represents the musical pitch 'F8'. */
    F8("F8"),

    /** Represents the musical pitch 'F#8'. */
    F_SHARP8("F#8"),

    /** Represents the musical pitch 'Gb8'. */
    G_FLAT8("Gb8"),

    /** Represents the musical pitch 'G8'. */
    G8("G8"),

    /** Represents the musical pitch 'G#8'. */
    G_SHARP8("G#8"),

    /** Represents the musical pitch 'Ab8'. */
    A_FLAT8("Ab8"),

    /** Represents the musical pitch 'A8'. */
    A8("A8"),

    /** Represents the musical pitch 'A#8'. */
    A_SHARP8("A#8"),

    /** Represents the musical pitch 'Bb8'. */
    B_FLAT8("Bb8"),

    /** Represents the musical pitch 'B8'. */
    B8("B8"),

    /** Represents the musical pitch 'C9'. */
    C9("C9"),

    /** Represents the musical pitch 'C#9'. */
    C_SHARP9("C#9"),

    /** Represents the musical pitch 'Db9'. */
    D_FLAT9("Db9"),

    /** Represents the musical pitch 'D9'. */
    D9("D9"),

    /** Represents the musical pitch 'D#9'. */
    D_SHARP9("D#9"),

    /** Represents the musical pitch 'Eb9'. */
    E_FLAT9("Eb9"),

    /** Represents the musical pitch 'E9'. */
    E9("E9"),

    /** Represents the musical pitch 'F9'. */
    F9("F9"),

    /** Represents the musical pitch 'F#9'. */
    F_SHARP9("F#9"),

    /** Represents the musical pitch 'Gb9'. */
    G_FLAT9("Gb9"),

    /** Represents the musical pitch 'G9'. */
    G9("G9"),

    /** Represents the musical pitch 'G#9'. */
    G_SHARP9("G#9"),

    /** Represents the musical pitch 'Ab9'. */
    A_FLAT9("Ab9"),

    /** Represents the musical pitch 'A9'. */
    A9("A9"),

    /** Represents the musical pitch 'A#9'. */
    A_SHARP9("A#9"),

    /** Represents the musical pitch 'Bb9'. */
    B_FLAT9("Bb9"),

    /** Represents the musical pitch 'B9'. */
    B9("B9"),

    /** Represents the musical pitch 'C10'. */
    C10("C10"),

    /** Represents the musical pitch 'C#10'. */
    C_SHARP10("C#10"),

    /** Represents the musical pitch 'Db10'. */
    D_FLAT10("Db10"),

    /** Represents the musical pitch 'D10'. */
    D10("D10"),

    /** Represents the musical pitch 'D#10'. */
    D_SHARP10("D#10"),

    /** Represents the musical pitch 'Eb10'. */
    E_FLAT10("Eb10"),

    /** Represents the musical pitch 'E10'. */
    E10("E10"),

    /** Represents the musical pitch 'F10'. */
    F10("F10"),

    /** Represents the musical pitch 'F#10'. */
    F_SHARP10("F#10"),

    /** Represents the musical pitch 'Gb10'. */
    G_FLAT10("Gb10"),

    /** Represents the musical pitch 'G10'. */
    G10("G10"),

    /** Represents the musical pitch 'G#10'. */
    G_SHARP10("G#10"),

    /** Represents the musical pitch 'Ab10'. */
    A_FLAT10("Ab10"),

    /** Represents the musical pitch 'A10'. */
    A10("A10"),

    /** Represents the musical pitch 'A#10'. */
    A_SHARP10("A#10"),

    /** Represents the musical pitch 'Bb10'. */
    B_FLAT10("Bb10"),

    /** Represents the musical pitch 'B10'. */
    B10("B10"),

    /** Represents a rest in the music (no pitch). */
    REST("R");

    /** The JFugue {@link String} representation of the pitch. */
    private final String jFugueName;

    /**
     * Constructs a Pitch instance with the specified JFugue name.
     *
     * @param jFugueName The JFugue representation of the pitch.
     */
    Pitch(String jFugueName) {
        this.jFugueName = jFugueName;
    }

    /**
     * For internal use only.
     * 
     * Returns the JFugue {@link String} representation of the pitch.
     * 
     * @return The JFugue name of the pitch.
     */
    public String getJFugueName() {
        return jFugueName;
    }
}
