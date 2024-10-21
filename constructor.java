import java.util.Scanner;

public class Main {
    static class Rectangle{
        Scanner input = new Scanner(System.in);
        int width = 3;
        int height = 4;

        public Rectangle(int w, int h){
        w = input.nextInt();
        h = input.nextInt();
        width = w;
        height = h;
        }
        public int area(){
            return width*height;
        }
        public int perimeter(){
            return (width+height)*2;
        }
        public double diagonal(){
            return Math.sqrt(width*width + height*height);
        }
        public boolean check(){
            if (width == height) return true;
            else return false;
        }
        public void printInfo(){
            System.out.println("width:" + width);
            System.out.println("height:" + height);
            System.out.println("area:" + area());
            System.out.println("perimeter:" + perimeter());
            System.out.println("diagonal:" + diagonal());
            if (check() == true){
                System.out.println("type: square");
            } else {
                System.out.println("type: rectangle");
            }
        }
    }
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		Rectangle myRectangle = new Rectangle(3,4);
        myRectangle.printInfo();
	}
}