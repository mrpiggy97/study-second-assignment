/* 
The following code will calculate the area and volume
of the following geometric figures: rectanble, sphere,
cylinder and cube.
The main method will call assignment method, which will
prompt the user for the length, width and height to
calculate the volume of a rectangle
**/

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main{
    public static class Rectangle{
        // the following function recieves two parameters
        // that will come from user input to calculate
        // the area of the rectangle
        public static int Area(int width, int length){
            return width*length;
        }
        // this method calculates the volume of the rectangle
        // parameters are expected to come from user input
        public static int Volume(int width, int length, int height){
            return width*length*height;
        }
    }
    // the following code will contain two methods
    // one will calculate the area of a sphere
    // and the other will calculate the volume of said
    // sphere
    public static class Sphere{
        // radius is intended to be provided by the user
        public static double Area(int radius){
            return 4*Math.PI*(radius*radius);
        }
        // radius is intended to be providedby the user
        public static double Volume(int radius){
            int cubicRadious = radius*radius*radius;
            return Math.PI*cubicRadious*4/3;
        }
    }
    // the following code will have two methods, one to
    // calculate the area of a cylinder and another to
    // calculate the volume of said cylinder
    
    public static class Cylinder{
        // both height and radius are meant to be provided
        // by user
        public static double Area(int height, int radius){
            return (2*Math.PI*radius*height)+2*Math.PI*(radius*radius);
        }
        public static double Volume(int height, int radius){
            return Math.PI*(radius*radius)*height;
        }
    }

    // the following code will serve to calculate the area
    // and volume of a cube
    public static class Cube{
        public static int Edge;
        // edge is meant to be provided by user
        public static double Area(int edge){
            return 6*(edge*edge);
        }
        // edge is meant to be provided by user
        public static double Volume(int edge){
            return edge*edge*edge;
        }
    }
    /*
     the following code will ask the user to input for
     the radius in order to calculate
     said sphere's volume. We will also be handling exceptions
     that may come up  
     */
    public static void Assignment(){
        boolean stop = false;
        // we will be in an indifinite loop until the user has succesfully
        // entered the radius in a correct manner, if any exceptions
        // come up then we print the error and start the process all over
        // again. At the end we will calculate the volume of the sphere
        // and display it to the user
        while(!stop){
            // inside this try catch block we ask the user for
            // the radius and handle the exceptions
            try {
                System.out.println("please enter the radius for the sphere ");
                Scanner scan = new Scanner(System.in);
                int radius = scan.nextInt();
                double volume = Sphere.Volume(radius);
                String message = String.format("The volume for the sphere was %1.2f", volume);
                System.out.println(message);
                scan.close();
                // here we have been succesful in getting the volume of the sphere
                // we now close the loop
                stop = true;
            } catch (InputMismatchException err) {
                String msg = String.format("the program gave the following error: %s", err.toString());
                System.err.println(msg);
            }catch(NoSuchElementException err){
                String msg = String.format("the program gave the following error: %s", err.toString());
                System.err.println(msg);
            }
        }
    }
    public static void main(String[] args) {
        Main.Assignment();
    }
}