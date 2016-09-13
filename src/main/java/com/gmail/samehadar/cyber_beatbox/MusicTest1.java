package com.gmail.samehadar.cyber_beatbox;

import javax.sound.midi.*;

/**
 * Created by User on 12.09.2016.
 */
public class MusicTest1 {
    public void play() {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();

            Sequence sequence = new Sequence(Sequence.PPQ, 4);

            Track track = sequence.createTrack();

            ShortMessage shortMessage = new ShortMessage();
            shortMessage.setMessage(144, 1, 44, 100);
            MidiEvent noteOn = new MidiEvent(shortMessage, 1);
            track.add(noteOn);

            ShortMessage shortMessage1 = new ShortMessage();
            shortMessage1.setMessage(128, 1, 44, 100);
            MidiEvent noteOff = new MidiEvent(shortMessage1, 16);
            track.add(noteOff);

            sequencer.setSequence(sequence);
            sequencer.start();
        } catch (MidiUnavailableException e) {
            System.out.println("Can't get sequencer");
        } catch (InvalidMidiDataException e) {
            System.out.println("Can't create sequence");
        }
        System.out.println("We get sequencer!");
    }

    public static void main(String[] args) {
        MusicTest1 test = new MusicTest1();
        test.play();
    }
}
