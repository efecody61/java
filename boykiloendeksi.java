
package deneme;
import java.util.Scanner;

public class proje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

       Scanner scanner = new Scanner (System.in);						
    
       System.out.print("l�tfen kilonuzu giriniz :");
       int kilo = scanner.nextInt();
       System.out.print("l�tfen boyunuzu giriniz(�rnek1,75):");
       double boy = scanner.nextDouble ();
       
       double bki = kilo / (boy * boy) ;
	 
       System.out.println("kilo endeksiniz :" + bki );
	 
       if (bki < 18) {
    	   
    	   System.out.println("zay�f");
    	   
       }
	
       else if (18 <= bki && bki <25){
    	   
    	   System.out.println("normal");
       }
       else if (25 <=bki && bki <=30 ) {
    	  
    	System.out.println("kilolu");
    	
       }
       else if (bki > 30) {
    	   System.out.println("obez");
       }
	} 
	
	
	
}
	