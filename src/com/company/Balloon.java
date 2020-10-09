package com.company;

import java.awt.*;

public class Balloon implements Drawable{
    int x, y;
    int height;
    int weigh;
    final String text;

    public Balloon(int x, int y, int height, int weigh, String text) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.weigh = weigh;
        this.text = text;
    }

    @Override
    public void draw(Graphics2D g) {
        drawBalloon(g, x, y, weigh, height, text);
    }

    private void drawBalloon(Graphics2D gr, int x, int y,int height, int weigh, String text) {
        gr.setColor(new Color(242, 3, 255));
        gr.fillOval(height/4 + 400, weigh/2 - 80, 200, 300 );
        gr.setColor(Color.WHITE);
        gr.fillRect(538,165,198,50);
        gr.setColor(Color.black);
        gr.drawLine(weigh/2 + 545, height/2 + 62, weigh/2 + 545, height/ 2 + 83);
        gr.drawLine(weigh/2 + 480, height/2 + 62, weigh/2 +480, height / 2 + 83);
        gr.setColor(new Color(97, 40, 36));
        gr.fillRect(weigh/2 + 472, height/2 + 83, 80, 50);


        gr.setColor(new Color(3, 255, 37));
        gr.fillOval(height/4 + 50, weigh/4 + 110, 170, 190 );
        gr.setColor(new Color(135, 10, 224));
        gr.fillArc(weigh / 2 + 80,height / 4 + 35, 135,190,90,180 );
        gr.fillArc(weigh / 2 + 80,height / 4 + 35, 135,190,270,180 );
        gr.setColor(new Color(196, 46, 46));
        gr.fillArc(weigh / 2 + 100,height / 4 + 35, 100,190,90,180 );
        gr.fillArc(weigh / 2 + 100,height / 4 + 35, 100,190,270,180 );
        gr.setColor(new Color(3,255,37));
        gr.fillArc(weigh / 2 + 118,height / 4 + 35, 65,190,90,180 );
        gr.fillArc(weigh / 2 + 118,height / 4 + 35, 65,190,270,180 );
        gr.setColor(new Color(135,10,224));
        gr.fillArc(weigh / 2 + 133,height / 4 + 35, 35,190,90,180 );
        gr.fillArc(weigh / 2 + 133,height / 4 + 35, 35,190,270,180 );

        gr.setColor(Color.black);

        gr.drawLine(weigh/4 + 180, height/4 + 220, weigh/4 + 180, height/ 4 + 233);
        gr.drawLine(weigh/4 + 240, height/4 + 220, weigh/4 + 240, height / 4 + 233);
        gr.setColor(new Color(97, 40, 36));
        gr.fillRect(weigh/4 + 170, height/4 + 233, 80, 35);

        gr.setColor(Color.BLACK);
        gr.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        Font font = new Font("Segoe print", Font.PLAIN, (int)(weigh * 0.15));
        gr.setFont(font);
        gr.drawString(text, x + (int)(weigh * 0.06), y + (int)(height * 0.25));
    }
}
