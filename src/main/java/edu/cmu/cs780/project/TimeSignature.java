package edu.cmu.cs780.project;

/**
 * Enumerates common time signatures used in music.
 * Each time signature is represented by a combination of beats per measure and the note value that represents one beat.
 */
public enum TimeSignature {
    /** Time signature with two quarter beats per measure. */
    TWO_FOUR(2, 4),

    /** Time signature with three quarter beats per measure. */
    THREE_FOUR(3, 4),

    /** Time signature with four quarter beats per measure. */
    FOUR_FOUR(4, 4),

    /** Time signature with six eighth beats per measure. */
    SIX_EIGHT(6, 8),

    /** Time signature with three eighth beats per measure. */
    THREE_EIGHT(3, 8),

    /** Time signature with seven eighth beats per measure. */
    SEVEN_EIGHT(7, 8),

    /** Time signature with five quarter beats per measure. */
    FIVE_FOUR(5, 4);

    /** The number of beats in each measure. */
    private final int beats;

    /** The note value that represents one beat. */
    private final int beatType;

    /**
     * Constructs a {@link TimeSignature} with the specified number of beats and beat type.
     *
     * @param beats The number of beats in each measure.
     * @param beatType The note value that represents one beat.
     */
    TimeSignature(int beats, int beatType) {
        this.beats = beats;
        this.beatType = beatType;
    }

    /**
     * Returns the number of beats in the time signature.
     * 
     * @return The number of beats per measure.
     */
    public int getBeats() {
        return beats;
    }

    /**
     * Returns the note value that represents one beat in the time signature.
     * 
     * @return The beat type, typically represented as the lower number in time signature notation.
     */
    public int getBeatType() {
        return beatType;
    }

    /**
     * Calculates the duration of a measure in this time signature, in terms of whole notes.
     * 
     * @return The duration of a measure in whole note units.
     */
    public double getMeasureDuration() {
        return (double) this.beats / this.beatType * 4;
    }

    /**
     * Returns a {@link String} representation of the time signature.
     * 
     * @return The time signature in common musical notation (e.g., "4/4", "3/4").
     */
    @Override
    public String toString() {
        return beats + "/" + beatType;
    }
}
