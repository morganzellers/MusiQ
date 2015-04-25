package com.joecheatham;


import org.jaudiotagger.audio.AudioFile;
import org.jaudiotagger.audio.AudioFileIO;
import org.jaudiotagger.audio.AudioHeader;
import org.jaudiotagger.audio.exceptions.CannotReadException;
import org.jaudiotagger.tag.Tag;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            File file = new File("RoboCop.m4a");
            AudioFile f = AudioFileIO.read(file);
            Tag tag = f.getTag();
            AudioHeader audioHeader = f.getAudioHeader();
            System.out.println("title: " + tag.getFirst("©nam"));
            System.out.println("artist: " + tag.getFirst("soar"));
        } catch (Exception e) {

        }

    }
}
