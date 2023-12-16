package edu.cmu.cs780.project;

/**
 * 
 * This class is for internal use.
 * 
 * Represents a custom {@link Chord} type, implementing the {@link ChordType} interface.
 * This class allows for the creation of custom {@link Chord}s with specified JFugue {@link String} representations,
 * enabling the incorporation of user-defined {@link Chord}s into musical compositions.
 */
public class CustomChordType implements ChordType{
    /** The JFugue {@link String} representation of the custom {@link Chord} type. */
    private final String jFugueName;

    /**
     * Constructs a {@link CustomChordType} instance with the specified JFugue {@link String} representation.
     * This representation is used to identify the {@link Chord} in JFugue library patterns.
     *
     * @param jFugueName The JFugue {@link String} representation of the custom {@link Chord} type.
     */
    CustomChordType(String jFugueName) {
        this.jFugueName = jFugueName;
    }

    /**
     * Retrieves the JFugue {@link String} representation of the custom {@link Chord} type.
     * This representation is used in JFugue library to identify the type of {@link Chord} in a music pattern.
     *
     * @return The JFugue {@link String} representation of the custom {@link Chord} type.
     */
    @Override
    public String getJFugueName() {
        return jFugueName;
    }
    
}
