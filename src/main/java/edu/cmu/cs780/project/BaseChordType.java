package edu.cmu.cs780.project;

/**
 * Enumerates the basic types of {@link Chord}s in music.
 * This enum covers a variety of common {@link Chord} types, including major, minor, dominant, augmented, diminished,
 * suspended, and various extended {@link Chord}s.
 */
public enum BaseChordType implements ChordType{
    /** Major chord. */
    MAJOR("MAJ"),

    /** Major sixth chord. */
    MAJOR_6("MAJ6"),

    /** Major seventh chord. */
    MAJOR_7("MAJ7"),

    /** Major ninth chord. */
    MAJOR_9("MAJ9"),

    /** Added ninth chord. */
    ADDED_9("ADD9"),

    /** Major sixth/ninth chord. */
    SIX_NINE("MAJ6_9"),

    /** Major seven/six chord. */
    SEVEN_SIX("MAJ7_6"),

    /** Major thirteenth chord. */
    MAJOR_13("MAJ13"),

    /** Minor chord. */
    MINOR("MIN"),

    /** Minor sixth chord. */
    MINOR_6("MIN6"),

    /** Minor seventh chord. */
    MINOR_7("MIN7"),

    /** Minor ninth chord. */
    MINOR_9("MIN9"),

    /** Minor eleventh chord. */
    MINOR_11("MIN11"),

    /** Minor seven/eleven chord. */
    MINOR_7_11("MIN7_11"),

    /** Minor added ninth chord. */
    MINOR_ADDED_9("MINADD9"),

    /** Minor six/nine chord. */
    MINOR_6_9("MIN6_9"),

    /** Minor major seventh chord. */
    MINOR_MAJOR_7("MINMAJ7"),

    /** Minor major ninth chord. */
    MINOR_MAJOR_9("MINMAJ9"),

    /** Dominant seventh chord. */
    DOMINANT_7("DOM7"),

    /** Dominant seven/six chord. */
    DOMINANT_7_6("DOM7_6"),

    /** Dominant seven/eleven chord. */
    DOMINANT_7_11("DOM7_11"),

    /** Dominant seventh suspended chord. */
    DOMINANT_7_SUS("DOM7SUS"),

    /** Dominant seven/six suspended chord. */
    DOMINANT_7_6_SUS("DOM7_6SUS"),

    /** Dominant ninth chord. */
    DOMINANT_9("DOM9"),

    /** Dominant eleventh chord. */
    DOMINANT_11("DOM11"),

    /** Dominant thirteenth chord. */
    DOMINANT_13("DOM13"),

    /** Dominant thirteenth suspended chord. */
    DOMINANT_13_SUS("DOM13SUS"),

    /** Dominant seven/six/eleven chord. */
    DOMINANT_7_6_11("DOM7_6_11"),

    /** Augmented chord. */
    AUGMENTED("AUG"),

    /** Augmented seventh chord. */
    AUGMENTED_7("AUG7"),

    /** Diminished chord. */
    DIMINISHED("DIM"),

    /** Diminished seventh chord. */
    DIMINISHED_7("DIM7"),

    /** Suspended second chord. */
    SUSPENDED_2("SUS2"),

    /** Suspended fourth chord. */
    SUSPENDED_4("SUS4"),

    /** Represents a musical rest (no chord). */
    REST("")
    ;

    /** The JFugue {@link String} representation of the {@link Chord} type. */
    private final String jFugueName;

    /**
     * Constructs a {@link BaseChordType} instance with the specified JFugue name.
     *
     * @param jFugueName The JFugue {@link String} representation of the {@link Chord} type.
     */
    BaseChordType(String jFugueName) {
        this.jFugueName = jFugueName;
    }

    /**
     * For internal use only
     * Returns the JFugue {@link String} representation of the {@link Chord} type.
     * 
     * @return The JFugue {@link String} representation name of the {@link Chord} type.
     */
    @Override
    public String getJFugueName() {
        return jFugueName;
    }
}
