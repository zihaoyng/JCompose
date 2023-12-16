package edu.cmu.cs780.project;

/**
 * Enum representing musical note durations. This enum covers a comprehensive range of durations including 
 * whole, half, quarter, eighth, sixteenth, thirty-second, sixty-fourth, and one-twenty-eighth notes,
 * as well as their dotted counterparts, which are one and a half times longer than their respective standard durations.
 *
 * <p>Each enum constant is associated with one key attributes:</p>
 * <ul>
 * <li>{@code durationValue}: The duration of the note as a fraction of a whole note.</li>
 * </ul>
 */
public enum Duration {
    WHOLE("w", 4.0),
    HALF("h", 2.0),
    QUARTER("q", 1.0),
    EIGHTH("i", 0.5),
    SIXTEENTH("s", 0.25),
    THIRTY_SECOND("t", 0.125),
    SIXTY_FOURTH("x", 0.0625),
    ONE_TWENTY_EIGHTH("o", 0.03125),
    DOTTED_WHOLE("w.", 6.0),
    DOTTED_HALF("h.", 3.0),
    DOTTED_QUARTER("q.", 1.5),
    DOTTED_EIGHTH("i.", 0.75),
    DOTTED_SIXTEENTH("s.", 0.375),
    DOTTED_THIRTY_SECOND("t.", 0.1875),
    DOTTED_SIXTY_FOURTH("x.", 0.09375),
    DOTTED_ONE_TWENTY_EIGHTH("o.", 0.046875);

    /** The JFugue {@link String} representation of the duration. */
    private final String jFugueName;

    /** The fractional value of the duration. */
    private final double durationValue;

    /**
     * Constructs a new {@link Duration} enum constant.
     *
     * @param jFugueName The JFugue notation name in {@link String} for the duration.
     * @param durationValue The fractional value of the duration relative to a whole note.
     */
    Duration(String jFugueName, double durationValue) {
        this.jFugueName = jFugueName;
        this.durationValue = durationValue;
    }

    /**
     * For internal use only.
     * 
     * Returns the JFugue notation name in {@link String} for this duration.
     *
     * @return The JFugue notation name in {@link String}.
     */
    public String getJFugueName() {
        return jFugueName;
    }

    /**
     * Returns the fractional value of this duration relative to a whole note.
     *
     * @return The numeric duration value.
     */
    public double getDurationValue() {
        return durationValue;
    }
}
