package robot;

import org.jointheleague.graphical.robot.Robot;


public class RobotSquare {
    public static void main(String[] args) throws Exception {
        // 1. Make a new Robot
    	Robot R2D2 = new Robot();      
    	R2D2.penDown();


        // 6. Make the robot move as fast as possible

    	R2D2.setSpeed(10);
        // 5. Do everything below here 4 times
    	for (int i = 0; i <= 4; i++ ) {
        //         2. Move your robot 200 pixels
    		R2D2.move(200);
    		R2D2.turn(90);

        //         4. Turn the robot 90 degrees to the right (90 degrees)
    	}

    }
}
