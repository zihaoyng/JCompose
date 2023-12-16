package edu.cmu.cs780.project;

/**
 * Interface representing a musical track.
 * A track can be thought of as a single component or layer in a musical composition,
 * containing its own sequence of musical elements.
 */
interface Track {
    /**
     * Plays the musical elements contained within this track.
     * This method should initiate the playback of the track's content.
     */
    void play();

    /**
     * Converts the track's musical content into a JFugue-compatible {@link String} format.
     * This {@link String} representation can be used for various purposes, such as saving the track
     * in a format that can be interpreted by JFugue or other music processing tools.
     *
     * @return A {@link String} representing the track in JFugue format.
     */
    String toJFugueString();

    /**
     * Validates the contents of the track.
     * This method should check for any inconsistencies or errors in the track's musical elements, ensuring that it is ready for playback or processing.
     */
    void validateTrack();

    /**
     * Retrieves the instrument associated with this track.
     * 
     * @return The {@link Instrument} enum constant representing the instrument used in this track.
     */
    Instrument getInstrument();

    /**
     * Retrieves the time signature associated with this track.
     * 
     * @return The {@link TimeSignature} enum constant representing the time signature used in this track.
     */
    TimeSignature getTimeSignature();


}
