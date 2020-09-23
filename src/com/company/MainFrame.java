package com.company;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    public MainFrame() throws HeadlessException {
        super("Task 1");
        DrawPanel panel = new DrawPanel();
        this.add(panel);
    }

}
