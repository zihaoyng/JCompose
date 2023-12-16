package edu.cmu.cs780.project;

class JCompose {

    static AccompanimentTrack generateAccompaniment(ChordTrack chordTrack, Pattern pattern) {
        if (pattern == BuiltInPattern.PLAIN) {
            // Logic to generate accompaniment based on the chord track and the pattern
            return new AccompanimentTrack(chordTrack.getBars(), chordTrack.getTimeSignature(), chordTrack.getInstrument());
        } else if (pattern == BuiltInPattern.ARPEGGIO) {
            throw new RuntimeException("Not implemented. Please come back later.");
        } else {
            throw new RuntimeException("Pattern for generating accompaniment is not recognized.");
        }
    }
        
        
}