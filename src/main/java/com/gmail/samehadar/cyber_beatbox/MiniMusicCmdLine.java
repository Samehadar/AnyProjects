package com.gmail.samehadar.cyber_beatbox;

import javax.sound.midi.*;

/**
 * Created by User on 12.09.2016.
 */
public class MiniMusicCmdLine {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Need 2 params");
        } else {
            MiniMusicCmdLine mini = new MiniMusicCmdLine();
            Integer instrument = Integer.parseInt(args[0]);
            Integer note = Integer.parseInt(args[1]);
            mini.play(instrument, note);
        }
    }

    public void play(Integer instrument, Integer note) {
        try {
            Sequencer sequencer = MidiSystem.getSequencer();
            sequencer.open();
            Sequence sequence = new Sequence(Sequence.PPQ, 4);

            Track track = sequence.createTrack();
            MidiEvent event = null;

            ShortMessage shM1 = new ShortMessage();
            shM1.setMessage(192, 1, instrument, 0);
            MidiEvent changeInstrument = new MidiEvent(shM1, 1);
            track.add(changeInstrument);

            ShortMessage shM2 = new ShortMessage();
            shM2.setMessage(144, 1, note, 100);
            MidiEvent noteOn = new MidiEvent(shM2, 1);
            track.add(noteOn);

            ShortMessage shM3 = new ShortMessage();
            shM3.setMessage(128, 1, note, 100);
            MidiEvent noteOff = new MidiEvent(shM3, 16);
            track.add(noteOff);

            sequencer.setSequence(sequence);
            sequencer.start();
        } catch (MidiUnavailableException e) {
            e.printStackTrace();
        } catch (InvalidMidiDataException e) {
            e.printStackTrace();
        }
    }

}
