package edu.cmu.cs780.project;

/**
 * Enumerates the types of musical ties used in notation.
 * A {@link Tie} connects two {@link Note}s of the same pitch, indicating they should be played as a single {@link Note} with the {@link Duration} of both {@link Note}s combined.
 * The enum values represent the start, continuation, or end of a {@link Tie} in musical notation.
 * 
 * Examples:
 * Tie starts: Note(Pitch.A5, Duration.HALF, Tie.START);
 * Tie continues: Note(Pitch.A5, Duration.HALF, Tie.CONTINUE);
 * Tie ends: Note(Pitch.A5, Duration.HALF, Tie.END);
 * 
 * A tie continue or end must follow a tie start with the same pitch,
 * or a runtime exception will be thrown.
 * 
 */
public enum Tie {
    /** Represents the start of a {@link Tie}. */
    START("start"),

    /** Represents the continuation of a {@link Tie} across measures or other divisions. */
    CONTINUE("continue"),

    /** Represents the end of a {@link Tie}. */
    END("end");

    /** The JFugue {@link String} representation of the {@link Tie}. */
    private final String jFugueName;

    /**
     * Constructs a {@link Tie} instance with the specified JFugue name.
     *
     * @param jFugueName The JFugue representation of the {@link Tie}.
     */
    Tie(String jFugueName) {
        this.jFugueName = jFugueName;
    }

    /**
     * For internal use only.
     * 
     * Returns the JFugue {@link String} representation of the {@link Tie}.
     * 
     * @return The JFugue name of the {@link Tie}.
     */
    public String getJFugueName() {
        return jFugueName;
    }
}
