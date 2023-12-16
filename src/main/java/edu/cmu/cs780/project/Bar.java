package edu.cmu.cs780.project;

import java.util.List;

/**
 * Represents a bar (or measure) in musical notation, containing a list of notes or musical elements.
 * This class is generic and can hold any type of object that represents a musical element,
 * making it versatile for different representations of {@link Note} or other musical constructs.
 *
 * @param <T> The type of musical element contained in this bar.
 */
public class Bar<T> {
    /** A list of musical elements of type T in this bar. */
    private List<T> notes;

    /**
     * Constructs a {@link Bar} with a specified list of musical elements.
     *
     * @param notes The list of musical elements to be contained in this bar.
     */
    Bar(List<T> notes) {
        this.notes = notes;
    }

    /**
     * Returns the list of musical elements in this bar.
     * 
     * @return A list of musical elements of type T.
     */
    public List<T> getNotes() {
        return notes;
    }
}
