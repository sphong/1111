package lab09;

public class RandomWalk {
    
    int x;
    int y;
    int maxSteps;
    int stepsTaken;
    int boundary;
    
    public RandomWalk(int max, int edge) {
        maxSteps = max;
        boundary = edge;
        x = 0;
        y = 0;
        stepsTaken = 0;
    }
    
    public RandomWalk(int max, int edge, int startX, int startY) {
        maxSteps = max;
        boundary = edge;
        x = startX;
        y = startY;
        stepsTaken = 0;
    }
    
    public String toString() {
        return "Steps: " + stepsTaken + "; Position: (" + x +
                "," + y + ")";
    }
    
}
