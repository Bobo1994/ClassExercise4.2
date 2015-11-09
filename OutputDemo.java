public class OutputDemo {

	public static void main(String[] args) {
		for(int i=1;i<100;i=i+2){
			System.out.println(i);
		}
		int b = 0;
		do{
			b=b+2;
			System.out.println(b);
		}while(b<100);
		int a=0;
		 while (a<3){
			 int space=2-a;
			 while(space!=0){
				 System.out.print(" ");
				
				 space--;
			 } int star=(2*a)+1;
			 while (star!=0){
				 System.out.print("*");
				
				 star--;
				 
			 }a++;
			 System.out.println();
			 
			 
		 } 
		int c=0;
		while(c<2){
			int spaces=c+1;
			while(spaces!=0){
				System.out.print(" ");
				spaces--;
			} int stars=3-2*(c);
			while(stars!=0){
				System.out.print("*");
				stars--;
				
			}c++;
			System.out.println();
		}
	}

}
