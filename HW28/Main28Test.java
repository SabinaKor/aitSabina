package ourInterFaces_28.HW28;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Main28Test {
    Shape rectangle = new Rectangle(3, 5);
    Shape circle = new Circle(3);
    Shape[] shapes={rectangle,circle};
    @Test
    public void totalAreaOfFiguresTest(){
        double expected=43.26;
        assertEquals(expected,Main28.totalAreaOfFigures(shapes));
    }

}