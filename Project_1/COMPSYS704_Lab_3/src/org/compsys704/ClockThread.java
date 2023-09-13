package org.compsys704;
import javax.swing.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClockThread extends Thread {
    private JLabel timeLabel;

    public ClockThread(JLabel timeLabel) {
        this.timeLabel = timeLabel;
    }

    @Override
    public void run() {
        while (true) {
            // Get the current time
            LocalDateTime currentTime = LocalDateTime.now();

            // Format the time as a string
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
            String formattedTime = currentTime.format(formatter);

            // Update the time label in the GUI
            timeLabel.setText(formattedTime);

            // Sleep for one second
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

