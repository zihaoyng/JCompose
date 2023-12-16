package edu.cmu.cs780.project;

/**
 * Represents a musical {@link Chord} with an associated {@link Duration}.
 * This class combines a {@link Chord} object with a {@link Duration} object,
 * allowing for the representation of {@link Chord}s in a musical composition with specific time values.
 */
class ChordWithDuration {
    /** The musical {@link Chord}. */
    final Chord chord;
    /** The {@link Duration} of the {@link Chord}. */
    final Duration duration;

    /**
     * Constructs a {@link ChordWithDuration} instance with a specified {@link Chord} and its {@link Duration}.
     *
     * @param chord The {@link Chord} object representing the musical {@link Chord}.
     * @param duration The {@link Duration} object representing the time value of the {@link Chord}.
     */
    ChordWithDuration(Chord chord, Duration duration) {
        this.chord = chord;
        this.duration = duration;
    }

    /**
     * Returns a {@link String} representation of the {@link Chord}.
     * This may involve the {@link Chord}'s name, its notes, or any other characteristic representation.
     *
     * @return A {@link String} representing the {@link Chord}.
     */
    String getChordRepr() {
        return this.chord.toString();
    }

    /**
     * Returns the JFugue {@link String} representation of the {@link Chord}'s {@link Duration}.
     * 
     * @return A {@link String} representing the {@link Duration} representation in JFugue format.
     */
    String getDurationRepr() {
        return this.duration.getJFugueName();
    }

    /**
     * Returns the numeric value of the {@link Chord}'s {@link Duration}.
     * This value is typically used for calculations or logical operations in music processing.
     *
     * @return The {@link Duration} numeric value of the {@link Chord}.
     */
    double getDurationValue() {
        return this.duration.getDurationValue();
    }
}
