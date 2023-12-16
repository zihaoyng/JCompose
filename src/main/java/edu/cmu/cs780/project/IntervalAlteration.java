package edu.cmu.cs780.project;

/**
 * Enumerates the types of interval alterations in musical notation.
 * This enum represents various modified intervals used in {@link Chord}s and melodies,
 * including flattened and sharpened degrees, as well as natural (unaltered) intervals.
 */
public enum IntervalAlteration {
    /** Represents a flatted fifth interval (diminished fifth). */
    FLATTED_5("b5"),

    /** Represents a sharpened fifth interval (augmented fifth). */
    SHARPENED_5("#5"),

    /** Represents a flatted second interval, also known as flatted ninth (b9). */
    FLATTED_2("b2"),

    /** Represents a sharpened second interval, also known as sharpened ninth (#9). */
    SHARPENED_2("#2"),

    /** Represents a flatted third interval. */
    FLATTED_3("b3"),

    /** Represents a sharpened third interval. */
    SHARPENED_3("#3"),

    /** Represents a flatted fourth interval. */
    FLATTED_4("b4"),

    /** Represents a sharpened fourth interval, also known as augmented fourth or #11. */
    SHARPENED_4("#4"),

    /** Represents a flatted sixth interval. */
    FLATTED_6("b6"),

    /** Represents a sharpened sixth interval, also known as sharpened thirteenth (#13). */
    SHARPENED_6("#6"),

    /** Represents a flatted seventh interval. */
    FLATTED_7("b7"),

    /** Represents a sharpened seventh interval. */
    SHARPENED_7("#7"),

    /** Represents a flatted ninth interval. */
    FLATTED_9("b9"),

    /** Represents a sharpened ninth interval. */
    SHARPENED_9("#9"),

    /** Represents a flatted eleventh interval. */
    FLATTED_11("b11"),

    /** Represents a sharpened eleventh interval, often functions similarly to a #4 or #11 in chords. */
    SHARPENED_11("#11"),

    /** Represents a flatted thirteenth interval. */
    FLATTED_13("b13"),

    /** Represents a sharpened thirteenth interval. */
    SHARPENED_13("#13"),

    /** Represents an unaltered first degree, also called the root or tonic. */
    NATURAL_1("1"),

    /** Represents an unaltered second degree. */
    NATURAL_2("2"),

    /** Represents an unaltered third degree. */
    NATURAL_3("3"),

    /** Represents an unaltered fourth degree. */
    NATURAL_4("4"),

    /** Represents an unaltered fifth degree. */
    NATURAL_5("5"),

    /** Represents an unaltered sixth degree. */
    NATURAL_6("6"),

    /** Represents an unaltered seventh degree. */
    NATURAL_7("7"),

    /** Represents an unaltered ninth degree. */
    NATURAL_9("9"),

    /** Represents an unaltered eleventh degree. */
    NATURAL_11("11"),

    /** Represents an unaltered thirteenth degree. */
    NATURAL_13("13");

    /** The JFugue {@link String} representation of the interval alteration. */
    private final String jFugueName;

    /**
     * Constructs an {@link IntervalAlteration} instance with the specified JFugue name.
     *
     * @param jFugueName The JFugue representation of the interval alteration.
     */
    IntervalAlteration(String jFugueName) {
        this.jFugueName = jFugueName;
    }

    /**
     * For internal use only.
     * 
     * Returns the JFugue {@link String} representation of the interval alteration.
     * 
     * @return The JFugue name of the interval alteration.
     */
    public String getJFugueName() {
        return jFugueName;
    }
}
