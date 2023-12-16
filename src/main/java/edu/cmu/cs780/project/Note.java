package edu.cmu.cs780.project;

/**
 * Represents a musical note with a specified {@link Pitch}, {@link Duration}, and optional {@link Tie}.
 * This class encapsulates the properties of a note that can be used in musical compositions.
 */
class Note {
    /** 
     * The {@link Pitch} of the note. 
     */
    final Pitch pitch;

    /** 
     * The {@link Duration} of the note.
     */
    final Duration duration;

    /** 
     * The {@link Tie} of the note, which may be {@code null} if the note is not tied to the next.
     */
    final Tie tie;

    /**
     * Constructs a {@link Note} with a specified {@link Pitch} and {@link Duration}.
     * This constructor is used for creating a note without a {@link Tie}.
     *
     * @param pitch The {@link Pitch} of the note, cannot be {@code null}.
     * @param duration The duration of the note, cannot be {@code null}.
     */
    Note(Pitch pitch, Duration duration) {
        this.pitch = pitch;
        this.duration = duration;
        this.tie = null;
    }

    /**
     * Constructs a Note with a specified {@link Pitch}, {@link Duration}, and {@link Tie}.
     * This constructor is used for creating a note that is tied to another.
     *
     * @param pitch The {@link Pitch} of the note, cannot be {@code null}.
     * @param duration The {@link Duration} of the note, cannot be {@code null}.
     * @param tie The {@link Tie} of the note, can be {@code null} if the note is not tied.
     */
    Note(Pitch pitch, Duration duration, Tie tie) {
        this.pitch = pitch;
        this.duration = duration;
        this.tie = tie;
    }

    /**
     * Returns a {@link String} representation of the note in JFugue format.
     * The {@link String} includes the {@link Pitch}, {@link Duration}, and {@link Tie} (if present).
     * 
     * @return A {@link String} representation of the note.
     */
    @Override
    public String toString() {
        return this.pitch.getJFugueName() + " " + this.duration.getJFugueName() + " " + this.tie.getJFugueName();
    }

    /**
     * Returns the {@link String} representation of the note's {@link Pitch}.
     * 
     * @return The {@link Pitch} of the note in JFugue format.
     */
    public String getPitchRepr() {
        return this.pitch.getJFugueName();
    }

    /**
     * Returns the {@link String} representation of the note's {@link Duration}.
     * 
     * @return The {@link Duration} of the note in JFugue format.
     */
    public String getDurationRepr() {
        return this.duration.getJFugueName();
    }

    /**
     * Returns the {@link String} representation of the note's {@link Tie}, if present.
     * 
     * @return The {@link Tie} of the note in JFugue format, or {@code null} if the note is not tied.
     */
    public String getTieRepr() {
        if (this.tie != null) {
            return this.tie.getJFugueName();
        }
        return null;
    }

    /**
     * Returns the numeric value of the note's {@link Duration}.
     * 
     * @return The {@link Duration} value of the note.
     */
    double getDurationValue() {
        return this.duration.getDurationValue();
    }

    /**
     * Returns the {@link Tie} object of the note, if present.
     * 
     * @return The {@link Tie} of the note, or {@code null} if the note is not tied.
     */
    Tie getTie() {
        return this.tie;
    }
}
