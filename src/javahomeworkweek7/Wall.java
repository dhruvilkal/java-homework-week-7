package javahomeworkweek7;

public class Wall {
    //Declare two variable(Instance)
    double width;
    double height;

    // No - arg constructor
    public Wall(){
        this.width =0;
        this.height = 0;

    }
    //Constructor with parameters , setting width and height with check
public Wall(double width,double height){
        this.width =width;
        this.height = height;

}
// 1st method  for width
    public double getWidth(){
        return width;
    }
// 2nd method for height
    public double getHeight(){
        return height;
    }
    // setWidth with one parameter of type double

    public void setWidth(double width){
        this.width= (width <0)? 0 : width;
    }
    // setHeight with one parameter of type double
    public void setHeight(double height){
        this.height = (height < 0)? 0:height;
    }
    // method name getArea without any parameters
    public double getArea(){
        return width * height;
    }
    // main method
    public static void main(String[] args) {
        // Test input enter
        Wall wall =new Wall (5,4);
        System.out.println("area="+wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width="+wall.getWidth());
        System.out.println("height="+wall.getHeight());
        System.out.println("area="+wall.getArea());

    }
}
