public class Vector2D extends Window {
    public static double theta1, theta2, theta3, theta4, theta5, theta6;
    public static double x(double i, double radius){
         theta1 = i * Math.PI / 180.0; // Convert degrees to radians
        double x = radius * Math.cos(theta1);
        return x;
    }

    public static double y(double i, double radius){
         theta2 = i * Math.PI / 180.0; // Convert degrees to radians
        double y = radius * Math.sin(theta2);
        return y;
    }

    public static double x1(double i, double radius){
         theta3 = i * Math.PI / 180.0; // Convert degrees to radians
        double x = radius * Math.cos(theta3);
        return x;
    }

    public static double y1(double i, double radius){
         theta4 = i * Math.PI / 180.0; // Convert degrees to radians
        double y = radius * Math.sin(theta4);
        return y;
    }
    public static double x2(double i, double radius){
         theta5 = i * Math.PI / 180.0; // Convert degrees to radians
        double x = radius * Math.cos(theta5);
        return x;
    }

    public static double y2(double i, double radius){
         theta6 = i * Math.PI / 180.0; // Convert degrees to radians
        double y = radius * Math.sin(theta6);
        return y;
    }

    public static double magnitude(double i, double radius){
        double thetaa = i*Math.PI/180.0;
        double mag = Math.sqrt(Math.pow(radius * Math.sin(thetaa), 2) +Math.pow(radius * Math.cos(thetaa), 2));
        return mag;
    }
}
