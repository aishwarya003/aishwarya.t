package programsguvi;
import java.util.Scanner;
public class Volumesurfaceareaofcuboid {
	public static void main(String []args){
	Scanner s=new Scanner(System.in);
	
	int surface;
	int volume;
	int l=s.nextInt();
	int b=s.nextInt();
	int h=s.nextInt();
    surface=(2*((l*b)+(b*h)+(h*l)));
    volume=(l*b*h);
    s.close();
    System.out.print(surface);
    System.out.print(" "+volume);

}
}
