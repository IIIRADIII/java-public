public class Rectangulator {
	public static void main(String[] args){
		int length = Integer.parseInt(args[0]);
		int width = Integer.parseInt(args[1]);
		
		Rectangle myRect = new Rectangle(length, width);
		
		String output = String.format("*** Your Rectangle ***\n\nLength: %d\nWidth: %d\nArea: %d\nPerimeter: %d\n\n ", myRect.length,myRect.width,myRect.getArea(),myRect.getPerimeter());
		
		System.out.println(output);
	}
}
