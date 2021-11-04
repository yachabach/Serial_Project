package com.panoptic.application;

import com.panoptic.UI.DeviceManagerGUI;

import javax.swing.*;

public class App {
    public static void main(String[] args) {

        createAndShowGUI();
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        /*We extended a JFrame which means we created a subclass that can
        be treated like a JFrame.  So we instantiate the one we created
        namely DeviceManagerGUI
         */
        JFrame frame = new DeviceManagerGUI("Evren Device Manager");
        frame.setVisible(true);

    }
}
