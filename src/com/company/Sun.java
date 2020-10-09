package com.company;

import java.awt.*;

public class Sun implements Drawable {
    int x, y, r, R, n;
    private Color c;

    public Sun(int x, int y, int r, int r1, int n, Color c) {
        this.x = x;
        this.y = y;
        this.r = r;
        R = r1;
        this.n = n;
        this.c = c;
    }

    @Override
    public void draw(Graphics2D g) {
        drawSun(g, x, y, r, R, n, c);
    }



    private static void drawSun(Graphics2D gr, int x, int y, int r, int R, int n, Color c) {

        gr.setColor(c);
        gr.fillOval(x-r, y-r, 2*r, 2*r);
        double da = 2 * Math.PI / n;
        for (int i = 0; i < n; i++) {
            double dx1, dx2, dy1, dy2;
            dx1 = r * Math.cos(da * i);
            dx2 = R * Math.cos(da * i);
            dy1 = r * Math.sin(da * i);
            dy2 = R * Math.sin(da * i);
            gr.drawLine(x + (int) dx1, y + (int) dy1, x + (int) dx2, y + (int) dy2);
        }
    }
}



