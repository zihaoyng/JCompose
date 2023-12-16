package edu.cmu.cs780.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;

/**
 * Represents a musical {@link Chord}, consisting of a {@link Pitch} for root note 
 * and a {@link ChordType}, for example, "Major 7"
 * This class allows for the creation and manipulation of {@link Chord}s, including chord alteration.
 * 
 * Examples: 
 * 
 * Chord(Pitch.A5, BaseChordType.MINOR_7): A minor 7 chord with root note A5
 * 
 * Chord(Pitch.A5, BaseChordType.MINOR_7).alter(IntervalAlteration.FLATTED_5): 
 * A minor 7 chord with root note A5, with 5th note half-step lowered.
 */
public class Chord {
    /** The root {@link Pitch} of the chord. */
    private Pitch pitch;

    /** The {@link ChordType} of the chord. */
    private ChordType chordType;

    /**
     * Constructs a {@link Chord} with a specified {@link Pitch} and {@link ChordType}.
     *
     * @param pitch The root {@link Pitch} of the chord.
     * @param chordType The {@link ChordType} of the chord.
     */
    public Chord(Pitch pitch, ChordType chordType) {
        this.pitch = pitch;
        this.chordType = chordType;
    }

    /**
     * Alters the {@link Chord} by applying specified {@link IntervalAlteration}.
     * This method allows for the customization of the {@link Chord} by modifying its intervals.
     * 
     * Example: Chord(Pitch.A5, BaseChordType.MINOR_7).alter(IntervalAlteration.FLATTED_5): 
     * A minor 7 chord with root note A5, with 5th note half-step lowered.
     * 
     * @param intervals The {@link IntervalAlteration} to apply to the {@link Chord}.
     * @return A new {@link Chord} instance with the applied alterations.
     * @throws RuntimeException If an unexpected error occurs during alteration.
     */
    public Chord alter(IntervalAlteration... intervals) {
        String chordStr = this.chordType.getJFugueName();
        String chordIntervalStr =  org.jfugue.theory.Chord.getIntervals(chordStr).toString();

        List<String> splittedIntervals = new ArrayList<>(Arrays.asList(chordIntervalStr.split(" ")));

        for (IntervalAlteration interval : intervals) {
            String baseDgreeString;
            java.util.regex.Pattern pattern = java.util.regex.Pattern.compile("[b#]?(\\d+)");
            Matcher matcher = pattern.matcher(interval.getJFugueName());
            if (matcher.find()) {
                    // Return the first group (the number)
                    baseDgreeString = matcher.group(1);
            } else {
                throw new RuntimeException("Unexpected Error in alter");
            }

            boolean found = false;
            for (int i=0; i <splittedIntervals.size(); i++) {
                String intervalStr = splittedIntervals.get(i);
                java.util.regex.Pattern pattern2 = java.util.regex.Pattern.compile("[b#]?" + baseDgreeString);
                Matcher matcher2 = pattern2.matcher(intervalStr);

                if (matcher2.find()) {
                    found = true;
                    splittedIntervals.set(i, interval.getJFugueName());
                }

            }

            if (found == false) {
                splittedIntervals.add(interval.getJFugueName());
            }
        }

        String newIntervalStr = String.join(" ", splittedIntervals);

        String newName = chordType.getJFugueName() + "%";

        // based on some experiements, if any of letters is lower case, JFugue will break
        String[] intervalNames = Arrays.stream(intervals)
                                     .map(IntervalAlteration::getJFugueName)
                                     .map(String::toUpperCase)
                                     .toArray(String[]::new);


        newName += String.join("%", intervalNames);

        // tested: add duplicate won't break
        org.jfugue.theory.Chord.addChord(newName, newIntervalStr);
        ChordType newChordType = new CustomChordType(newName);
        
        return new Chord(this.pitch, newChordType);
    }

    /**
     * Returns a {@link String} representation of the {@link Chord}.
     *
     * @return A {@link String} representation of the {@link Chord}.
     */
    @Override
    public String toString() {
        return this.pitch.getJFugueName() + this.chordType.getJFugueName();
    }
}
