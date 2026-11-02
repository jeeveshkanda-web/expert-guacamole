import gpdraw.DrawingTool;
import gpdraw.SketchPad;

public class RecursionTest
{
    
    DrawingTool pen = new DrawingTool(new SketchPad(750, 750));    
    
    public void draw(double length, int level) {
        
        if (level == 0) {
            pen.forward(length);
            pen.turnLeft(90);
        }
        else {
            pen.forward(length);
            pen.turnRight(90);
            draw(length / 2, level - 1);
            pen.forward(length);
        }
        
    }
    
    public static void main(String[] args) {
        
        RecursionTest test = new RecursionTest();
        test.pen.setDirection(0);
        test.draw(200, 3);
        
    }

    
}