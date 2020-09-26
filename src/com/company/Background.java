package com.company;

import java.awt.*;

public class Background implements Drawable {
    int height;
    int width;

    public Background(int height, int width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw(Graphics2D g) {
        drawSky(g, height, width);
    }

    private void drawSky(Graphics2D gr, int height, int width) {
        gr.setColor(new Color(0, 0, 250));
        gr.fillRect(0, 0, width, height);
    }
}
