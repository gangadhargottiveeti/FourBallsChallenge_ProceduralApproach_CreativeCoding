import processing.core.PApplet;

public class FourBalls extends PApplet{

    private float ball1X = 0, ball2X = 0, ball3X = 0, ball4X = 0;       // position X for ball1, ball2, ball3 and ball4 respectively
    private float ball1Y, ball2Y, ball3Y, ball4Y;                          // position Y for ball1, ball2, ball3 and ball4 respectively
    private final float speedOfBall1 = 1;
    private final float speedOfBall2 = 2 * speedOfBall1;    // twice of ball1 speed
    private final float speedOfBall3 = 3 * speedOfBall1;    // thrice of ball1 speed
    private final float speedOfBall4 = 4 * speedOfBall1;    // four times of ball1 speed
    private final float sizeOfBall = 10;

    public static void main(String[] args) {
        PApplet.main("FourBalls",args);
    }

    @Override
    public void settings() {
        int widthOfScreen = 700;
        int heightOfScreen = 450;
        size(widthOfScreen, heightOfScreen);

    }

    @Override
    public void setup() {
        ball1Y = (float) (height) /5;
        ball2Y = (float) (height * 2) /5;
        ball3Y = (float) (height * 3) /5;
        ball4Y = (float) (height * 4) /5;
    }

    @Override
    public void mouseClicked() {
        background(155);
        ball1X = 0; ball2X = 0; ball3X = 0; ball4X = 0;
    }

    @Override
    public void draw() {
        moveBall1();
        moveBall2();
        moveBall3();
        moveBall4();
    }

    private void moveBall1(){
        ellipse(ball1X, ball1Y,sizeOfBall,sizeOfBall);
        ball1X += speedOfBall1;
    }

    private void moveBall2(){
        ellipse(ball2X, ball2Y,sizeOfBall,sizeOfBall);
        ball2X += speedOfBall2;
    }

    private void moveBall3(){
        ellipse(ball3X, ball3Y,sizeOfBall,sizeOfBall);
        ball3X += speedOfBall3;
    }

    private void moveBall4(){
        ellipse(ball4X, ball4Y,sizeOfBall,sizeOfBall);
        ball4X += speedOfBall4;
    }
}
