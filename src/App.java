import processing.core.*;

public class App extends PApplet {
    public static void main(String[] args)  {
        PApplet.main("App");
    }
    public void settings() {
        size(400, 400);
    }

    public void setup() {
        background(230,255,254);
    }

    public void draw() {
        stroke(100,150,210);
        noFill();
        strokeWeight(3);
        fill(170,215,255);
        rect(50,50,100,100);

        stroke(170,215,255);
        noFill();
        strokeWeight(3);
        fill(100,150,210);
        circle(200,300,70);

        line(150,150,200,265);
        line(50,150,165,300);
}

}