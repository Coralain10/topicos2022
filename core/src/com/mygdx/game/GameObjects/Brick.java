package com.mygdx.game.GameObjects;

import com.badlogic.gdx.graphics.Color;

public class Brick extends Paddle {
    public Brick(int x, int y, int width, int height) {
        super(x,y,width,height);
        setColor(Color.GOLD);
    }
}
