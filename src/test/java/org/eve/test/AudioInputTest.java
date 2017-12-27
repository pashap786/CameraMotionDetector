package org.eve.test;

import java.io.ByteArrayOutputStream;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.TargetDataLine;

import org.junit.Test;

public class AudioInputTest {
	
		@Test
	    public  void testAudio() {
	 
	        ByteArrayOutputStream byteArrayOutputStream;
	        TargetDataLine targetDataLine;
	        int cnt;
	        boolean stopCapture = false;
	        byte tempBuffer[] = new byte[8000];
	        int countzero, countdownTimer;    
	        short convert[] = new short[tempBuffer.length];	 
	 
	        try {
	            byteArrayOutputStream = new ByteArrayOutputStream();
	            stopCapture = false;
	            countdownTimer = 0;
	            while (!stopCapture) {
	                AudioFormat audioFormat = new AudioFormat(8000.0F, 16, 1, true, false);
	                DataLine.Info dataLineInfo = new DataLine.Info(TargetDataLine.class, audioFormat);
	                targetDataLine = (TargetDataLine) AudioSystem.getLine(dataLineInfo);
	                targetDataLine.open(audioFormat);
	                targetDataLine.start();
	                cnt = targetDataLine.read(tempBuffer, 0, tempBuffer.length);
	                byteArrayOutputStream.write(tempBuffer, 0, cnt); 
	                try {
	                    countzero = 0;
	                    for (int i = 0; i < tempBuffer.length; i++) {                                     
	                        convert[i] = tempBuffer[i];
	                        if (convert[i] == 0) {
	                            countzero++;
	                        }
	                    }
	                     
	                    countdownTimer++;
	                    System.out.println(countzero + " " + countdownTimer);
	 
	                } catch (StringIndexOutOfBoundsException e) {
	                    System.out.println(e.getMessage());
	                }
	                Thread.sleep(0);
	                targetDataLine.close();
	            }
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	    }

}
