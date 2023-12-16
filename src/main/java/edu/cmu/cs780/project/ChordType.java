package edu.cmu.cs780.project;

/**
 * For internal use.
 * Interface defining a {@link Chord} type for musical composition.
 * This interface requires implementing classes to provide a method for retrieving the JFugue string representation of the {@link Chord}.
 */
public interface ChordType {
    /**
     * For internal use only
     * 
     * Retrieves the JFugue {@link String} representation of the {@link Chord} type.
     * The JFugue {@link String} representation is used in JFugue library to identify the type of {@link Chord} in a music pattern.
     *
     * @return The JFugue {@link String} representation of the {@link Chord} type.
     */
    public String getJFugueName();
}
