package com.mygdx.game.Factory;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.mygdx.game.GameObjects.Ball;
import com.mygdx.game.GameObjects.Paddle;
import com.mygdx.game.Interface.IFactory;

import java.util.ArrayList;
import java.util.Random;

public class BallFactory implements IFactory {

    //ArrayList<Ball> balls = new ArrayList<>();
    Ball ball;
    Random r = new Random();

    public BallFactory() { //int total
//        for (int i = 0; i < total; i++) {
//            balls.add( );
//        }
        ball = new Ball(
                r.nextInt(Gdx.graphics.getWidth()),
                r.nextInt(Gdx.graphics.getHeight()),
                20,//r.nextInt(100),
                r.nextInt(15),
                r.nextInt(15)
        );
    }

    public void colideWithPaddle(Paddle paddle) {
//        if(balls.get(0).collideWith(paddle)){
//            balls.get(0).bounce();
//        }
        if(ball.collideWith(paddle)) {
            ball.bounce();
        }
    }

    @Override
    public void render(ShapeRenderer renderer) {
        //for (Ball ball: balls) {
        //}
        ball.draw();
        ball.render(renderer);
    }

    @Override
    public void destroy() {

    }

    public Ball getBall() {
        return ball;
    }

    public void setBall(Ball ball) {
        this.ball = ball;
    }
}
