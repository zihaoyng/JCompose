package edu.cmu.cs780.project;

/**
 * The {@link Instrument} enum represents various musical instruments.
 * This enumeration covers a wide range of instruments including pianos, strings, brass, woodwinds, and various types of synthesizers and sound effects.
 */
public enum Instrument {
    /** Represents the 'Piano' instrument. */
    PIANO("PIANO"),

    /** Represents the 'Bright Acoustic' piano instrument. */
    BRIGHT_ACOUSTIC("BRIGHT_ACOUSTIC"),

    /** Represents the 'Electric Grand' piano instrument. */
    ELECTRIC_GRAND("ELECTRIC_GRAND"),

    /** Represents the 'Honkey Tonk' piano instrument. */
    HONKEY_TONK("HONKEY_TONK"),

    /** Represents the 'Electric Piano' instrument. */
    ELECTRIC_PIANO("ELECTRIC_PIANO"),

    /** Represents the 'Electric Piano 2' instrument. */
    ELECTRIC_PIANO_2("ELECTRIC_PIANO_2"),

    /** Represents the 'Harpsichord' instrument. */
    HARPSICHORD("HARPSICHORD"),

    /** Represents the 'Clavinet' instrument. */
    CLAVINET("CLAVINET"),

    /** Represents the 'Celesta' instrument. */
    CELESTA("CELESTA"),

    /** Represents the 'Glockenspiel' instrument. */
    GLOCKENSPIEL("GLOCKENSPIEL"),

    /** Represents the 'Music Box' instrument. */
    MUSIC_BOX("MUSIC_BOX"),

    /** Represents the 'Vibraphone' instrument. */
    VIBRAPHONE("VIBRAPHONE"),

    /** Represents the 'Marimba' instrument. */
    MARIMBA("MARIMBA"),

    /** Represents the 'Xylophone' instrument. */
    XYLOPHONE("XYLOPHONE"),

    /** Represents the 'Tubular Bells' instrument. */
    TUBULAR_BELLS("TUBULAR_BELLS"),

    /** Represents the 'Dulcimer' instrument. */
    DULCIMER("DULCIMER"),

    /** Represents the 'Drawbar Organ' instrument. */
    DRAWBAR_ORGAN("DRAWBAR_ORGAN"),

    /** Represents the 'Percussive Organ' instrument. */
    PERCUSSIVE_ORGAN("PERCUSSIVE_ORGAN"),

    /** Represents the 'Rock Organ' instrument. */
    ROCK_ORGAN("ROCK_ORGAN"),

    /** Represents the 'Church Organ' instrument. */
    CHURCH_ORGAN("CHURCH_ORGAN"),

    /** Represents the 'Reed Organ' instrument. */
    REED_ORGAN("REED_ORGAN"),

    /** Represents the 'Accordian' instrument. */
    ACCORDIAN("ACCORDIAN"),

    /** Represents the 'Harmonica' instrument. */
    HARMONICA("HARMONICA"),

    /** Represents the 'Tango Accordian' instrument. */
    TANGO_ACCORDIAN("TANGO_ACCORDIAN"),

    /** Represents the 'Guitar' instrument. */
    GUITAR("GUITAR"),

    /** Represents the 'Steel String Guitar' instrument. */
    STEEL_STRING_GUITAR("STEEL_STRING_GUITAR"),

    /** Represents the 'Electric Jazz Guitar' instrument. */
    ELECTRIC_JAZZ_GUITAR("ELECTRIC_JAZZ_GUITAR"),

    /** Represents the 'Electric Clean Guitar' instrument. */
    ELECTRIC_CLEAN_GUITAR("ELECTRIC_CLEAN_GUITAR"),

    /** Represents the 'Electric Muted Guitar' instrument. */
    ELECTRIC_MUTED_GUITAR("ELECTRIC_MUTED_GUITAR"),

    /** Represents the 'Overdriven Guitar' instrument. */
    OVERDRIVEN_GUITAR("OVERDRIVEN_GUITAR"),

    /** Represents the 'Distortion Guitar' instrument. */
    DISTORTION_GUITAR("DISTORTION_GUITAR"),

    /** Represents the 'Guitar Harmonics' instrument. */
    GUITAR_HARMONICS("GUITAR_HARMONICS"),

    /** Represents the 'Acoustic Bass' instrument. */
    ACOUSTIC_BASS("ACOUSTIC_BASS"),

    /** Represents the 'Electric Bass Finger' instrument. */
    ELECTRIC_BASS_FINGER("ELECTRIC_BASS_FINGER"),

    /** Represents the 'Electric Bass Pick' instrument. */
    ELECTRIC_BASS_PICK("ELECTRIC_BASS_PICK"),

    /** Represents the 'Fretless Bass' instrument. */
    FRETTLESS_BASS("FRETTLESS_BASS"),

    /** Represents the 'Slap Bass 1' instrument. */
    SLAP_BASS_1("SLAP_BASS_1"),

    /** Represents the 'Slap Bass 2' instrument. */
    SLAP_BASS_2("SLAP_BASS_2"),

    /** Represents the 'Synth Bass 1' instrument. */
    SYNTH_BASS_1("SYNTH_BASS_1"),

    /** Represents the 'Synth Bass 2' instrument. */
    SYNTH_BASS_2("SYNTH_BASS_2"),

    /** Represents the 'Violin' instrument. */
    VIOLIN("VIOLIN"),

    /** Represents the 'Viola' instrument. */
    VIOLA("VIOLA"),

    /** Represents the 'Cello' instrument. */
    CELLO("CELLO"),

    /** Represents the 'Contrabass' instrument. */
    CONTRABASS("CONTRABASS"),

    /** Represents the 'Tremolo Strings' instrument. */
    TREMOLO_STRINGS("TREMOLO_STRINGS"),

    /** Represents the 'Pizzicato Strings' instrument. */
    PIZZICATO_STRINGS("PIZZICATO_STRINGS"),

    /** Represents the 'Orchestral Strings' instrument. */
    ORCHESTRAL_STRINGS("ORCHESTRAL_STRINGS"),

    /** Represents the 'Timpani' instrument. */
    TIMPANI("TIMPANI"),

    /** Represents the 'String Ensemble 1' instrument. */
    STRING_ENSEMBLE_1("STRING_ENSEMBLE_1"),

    /** Represents the 'String Ensemble 2' instrument. */
    STRING_ENSEMBLE_2("STRING_ENSEMBLE_2"),

    /** Represents the 'Synth Strings 1' instrument. */
    SYNTH_STRINGS_1("SYNTH_STRINGS_1"),

    /** Represents the 'Synth Strings 2' instrument. */
    SYNTH_STRINGS_2("SYNTH_STRINGS_2"),

    /** Represents the 'Choir Aahs' instrument. */
    CHOIR_AAHS("CHOIR_AAHS"),

    /** Represents the 'Voice Oohs' instrument. */
    VOICE_OOHS("VOICE_OOHS"),

    /** Represents the 'Synth Voice' instrument. */
    SYNTH_VOICE("SYNTH_VOICE"),

    /** Represents the 'Orchestra Hit' instrument. */
    ORCHESTRA_HIT("ORCHESTRA_HIT"),

    /** Represents the 'Trumpet' instrument. */
    TRUMPET("TRUMPET"),

    /** Represents the 'Trombone' instrument. */
    TROMBONE("TROMBONE"),

    /** Represents the 'Tuba' instrument. */
    TUBA("TUBA"),

    /** Represents the 'Muted Trumpet' instrument. */
    MUTED_TRUMPET("MUTED_TRUMPET"),

    /** Represents the 'French Horn' instrument. */
    FRENCH_HORN("FRENCH_HORN"),

    /** Represents the 'Brass Section' instrument. */
    BRASS_SECTION("BRASS_SECTION"),

    /** Represents the 'Synth Brass 1' instrument. */
    SYNTH_BRASS_1("SYNTH_BRASS_1"),

    /** Represents the 'Synth Brass 2' instrument. */
    SYNTH_BRASS_2("SYNTH_BRASS_2"),

    /** Represents the 'Soprano Sax' instrument. */
    SOPRANO_SAX("SOPRANO_SAX"),

    /** Represents the 'Alto Sax' instrument. */
    ALTO_SAX("ALTO_SAX"),

    /** Represents the 'Tenor Sax' instrument. */
    TENOR_SAX("TENOR_SAX"),

    /** Represents the 'Baritone Sax' instrument. */
    BARITONE_SAX("BARITONE_SAX"),

    /** Represents the 'Oboe' instrument. */
    OBOE("OBOE"),

    /** Represents the 'English Horn' instrument. */
    ENGLISH_HORN("ENGLISH_HORN"),

    /** Represents the 'Bassoon' instrument. */
    BASSOON("BASSOON"),

    /** Represents the 'Clarinet' instrument. */
    CLARINET("CLARINET"),

    /** Represents the 'Piccolo' instrument. */
    PICCOLO("PICCOLO"),

    /** Represents the 'Flute' instrument. */
    FLUTE("FLUTE"),

    /** Represents the 'Recorder' instrument. */
    RECORDER("RECORDER"),

    /** Represents the 'Pan Flute' instrument. */
    PAN_FLUTE("PAN_FLUTE"),

    /** Represents the 'Blown Bottle' instrument. */
    BLOWN_BOTTLE("BLOWN_BOTTLE"),

    /** Represents the 'Shakuhachi' instrument. */
    SHAKUHACHI("SHAKUHACHI"),

    /** Represents the 'Whistle' instrument. */
    WHISTLE("WHISTLE"),

    /** Represents the 'Ocarina' instrument. */
    OCARINA("OCARINA"),

    /** Represents the 'Square' synth sound. */
    SQUARE("SQUARE"),

    /** Represents the 'Sawtooth' synth sound. */
    SAWTOOTH("SAWTOOTH"),

    /** Represents the 'Calliope' synth sound. */
    CALLIOPE("CALLIOPE"),

    /** Represents the 'Chiff' synth sound. */
    CHIFF("CHIFF"),

    /** Represents the 'Charang' synth sound. */
    CHARANG("CHARANG"),

    /** Represents the 'Voice' synth sound. */
    VOICE("VOICE"),

    /** Represents the 'Fifths' synth sound. */
    FIFTHS("FIFTHS"),

    /** Represents the 'Bass Lead' synth sound. */
    BASS_LEAD("BASS_LEAD"),

    /** Represents the 'New Age' synth sound. */
    NEW_AGE("NEW_AGE"),

    /** Represents the 'Warm' synth sound. */
    WARM("WARM"),

    /** Represents the 'Poly Synth' synth sound. */
    POLY_SYNTH("POLY_SYNTH"),

    /** Represents the 'Choir' synth sound. */
    CHOIR("CHOIR"),

    /** Represents the 'Bowed' synth sound. */
    BOWED("BOWED"),

    /** Represents the 'Metallic' synth sound. */
    METALLIC("METALLIC"),

    /** Represents the 'Halo' synth sound. */
    HALO("HALO"),

    /** Represents the 'Sweep' synth sound. */
    SWEEP("SWEEP"),

    /** Represents the 'Rain' sound effect. */
    RAIN("RAIN"),

    /** Represents the 'Soundtrack' sound effect. */
    SOUNDTRACK("SOUNDTRACK"),

    /** Represents the 'Crystal' sound effect. */
    CRYSTAL("CRYSTAL"),

    /** Represents the 'Atmosphere' sound effect. */
    ATMOSPHERE("ATMOSPHERE"),

    /** Represents the 'Brightness' sound effect. */
    BRIGHTNESS("BRIGHTNESS"),

    /** Represents the 'Goblins' sound effect. */
    GOBLINS("GOBLINS"),

    /** Represents the 'Echoes' sound effect. */
    ECHOES("ECHOES"),

    /** Represents the 'Sci-Fi' sound effect. */
    SCI_FI("SCI_FI"),

    /** Represents the 'Sitar' instrument. */
    SITAR("SITAR"),

    /** Represents the 'Banjo' instrument. */
    BANJO("BANJO"),

    /** Represents the 'Shamisen' instrument. */
    SHAMISEN("SHAMISEN"),

    /** Represents the 'Koto' instrument. */
    KOTO("KOTO"),

    /** Represents the 'Kalimba' instrument. */
    KALIMBA("KALIMBA"),

    /** Represents the 'Bagpipe' instrument. */
    BAGPIPE("BAGPIPE"),

    /** Represents the 'Fiddle' instrument. */
    FIDDLE("FIDDLE"),

    /** Represents the 'Shanai' instrument. */
    SHANAI("SHANAI"),

    /** Represents the 'Tinkle Bell' sound effect. */
    TINKLE_BELL("TINKLE_BELL"),

    /** Represents the 'Agogo' sound effect. */
    AGOGO("AGOGO"),

    /** Represents the 'Steel Drums' instrument. */
    STEEL_DRUMS("STEEL_DRUMS"),

    /** Represents the 'Woodblock' sound effect. */
    WOODBLOCK("WOODBLOCK"),

    /** Represents the 'Taiko Drum' instrument. */
    TAIKO_DRUM("TAIKO_DRUM"),

    /** Represents the 'Melodic Drum' sound effect. */
    MELODIC_DRUM("MELODIC_DRUM"),

    /** Represents the 'Synth Drum' sound effect. */
    SYNTH_DRUM("SYNTH_DRUM"),

    /** Represents the 'Reverse Cymbal' sound effect. */
    REVERSE_CYMBAL("REVERSE_CYMBAL"),

    /** Represents the 'Guitar Fret Noise' sound effect. */
    GUITAR_FRET_NOISE("GUITAR_FRET_NOISE"),

    /** Represents the 'Breath Noise' sound effect. */
    BREATH_NOISE("BREATH_NOISE"),

    /** Represents the 'Seashore' sound effect. */
    SEASHORE("SEASHORE"),

    /** Represents the 'Bird Tweet' sound effect. */
    BIRD_TWEET("BIRD_TWEET"),

    /** Represents the 'Telephone Ring' sound effect. */
    TELEPHONE_RING("TELEPHONE_RING"),

    /** Represents the 'Helicopter' sound effect. */
    HELICOPTER("HELICOPTER"),

    /** Represents the 'Applause' sound effect. */
    APPLAUSE("APPLAUSE"),

    /** Represents the 'Gunshot' sound effect. */
    GUNSHOT("GUNSHOT");

    /** The name of the instrument. */
    private final String jFugueName;

    /**
     * Constructs an {@link Instrument} instance with the specified name.
     *
     * @param name The name of the instrument.
     */
    Instrument(String name) {
        this.jFugueName = name;
    }

    /**
     * For internal use only
     * 
     * Returns the name of the instrument.
     * 
     * @return The name of the instrument.
     */
    public String getJFugueName() {
        return this.jFugueName;
    }
}
