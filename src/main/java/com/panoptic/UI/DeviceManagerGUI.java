package com.panoptic.UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class DeviceManagerGUI extends JFrame{
    public JPanel mainPanel;
    private JTextField tfieldUserMsg;
    private JLabel lblUserMsg;
    private JButton btnSendMsg;
    private JLabel lblOutputMsg;
    private JPanel pnlComponents;

    public DeviceManagerGUI(String title) {

        //super is the superclass.  The JFrame superclass is instantiated
        //which is the base object for out DeviceManagerGUI
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*Create and set up the content pane.
        This is where we set the content for our form.  All of our components
        will go somewhere on the mainPanel.  This is how we make a connection
        with the components we build with the builder
         */
        this.setContentPane(mainPanel);
        this.pack();
        btnSendMsg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Grab text from tfieldUserMsg
                //put in label
                lblOutputMsg.setText(tfieldUserMsg.getText());
            }
        });

        tfieldUserMsg.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblOutputMsg.setText(tfieldUserMsg.getText());
            }
        });
    }



}
