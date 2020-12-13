package com.company.gui;

import com.company.common.Solution;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame {
    private JTextField textFieldArray;
    private JButton buttonProcess;
    private JPanel GUIPanel;
    private JLabel labelAnswer;

    public GUI() {
        setSize(700,500);
        setContentPane(GUIPanel);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setVisible(true);

        buttonProcess.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String arr = textFieldArray.getText();
                String[] items = arr.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");

                int[] results = new int[items.length];

                for (int i = 0; i < items.length; i++) {
                    try {
                        results[i] = Integer.parseInt(items[i]);
                    } catch (NumberFormatException nfe) {
                        //NOTE: write something here if you need to recover from formatting errors
                    };
                }
                labelAnswer.setText(Solution.solution(results)+"");
            }
        });

    }
}
