public class Vector2D extends Window {
    
    public static double x(double i, double radius){
        double theta = i * Math.PI / 180.0; // Convert degrees to radians
        double x = radius * Math.cos(theta);
        return x;
    }

    public static double y(double i, double radius){
        double theta = i * Math.PI / 180.0; // Convert degrees to radians
        double y = radius * Math.sin(theta);
        return y;
    }

    public static double x1(double i, double radius){
        double theta = i * Math.PI / 180.0; // Convert degrees to radians
        double x = radius * Math.cos(theta);
        return x;
    }

    public static double y1(double i, double radius){
        double theta = i * Math.PI / 180.0; // Convert degrees to radians
        double y = radius * Math.sin(theta);
        return y;
    }
    public static double x2(double i, double radius){
        double theta = i * Math.PI / 180.0; // Convert degrees to radians
        double x = radius * Math.cos(theta);
        return x;
    }

    public static double y2(double i, double radius){
        double theta = i * Math.PI / 180.0; // Convert degrees to radians
        double y = radius * Math.sin(theta);
        return y;
    }

}
