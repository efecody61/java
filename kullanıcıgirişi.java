package deneme;
import java.util.Scanner;
public class kullan�c�giri�i {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		System.out.println("                         ");
		System.out.println("Giri� i�in  bekleyin...");
		System.out.println("                         ");

		String akullan�c� = "efe b�y�ky�lmaz";
		String aparola = "02081967";
		int giri�hakk� = 3 ;
		 
	    while(true) {
	    	
	    	System.out.print("kullan� ad�:");
	    	String kullan�c� = scanner.nextLine();
	    	System.out.print("parola:");
	    	String parola = scanner.nextLine();
	    	
	    	    if(akullan�c�.equals(kullan�c�)  && aparola.equals(parola)){
	    		
	    		   System.out.println("Ho�geldiniz    " + akullan�c� );
	    	                 break;	
	    	       }
	    	          else if (akullan�c�.equals(kullan�c�) && !aparola.equals(parola)) {
	    	
	    	                   System.out.println("parola hatal� "+ (giri�hakk�-1) +" hakk�n�z kald�");
	    	        }
	    	
	    	          else if (!akullan�c�.equals(kullan�c�) && aparola.equals(parola)) {
	    	    
	    	        	  System.out.println("kullan�c� ad� hatal� "+ (giri�hakk�-1) +" hakk�n�z kald�");
	    	          }
	    	          
	    	          else if (!akullan�c�.equals(kullan�c�) && !aparola.equals(parola)) {
	    	        	  
	    	        	  System.out.println("kullan�c� ad� ve parola hatal� " +(giri�hakk�-1) +" hakk�n�z kald�.");

	    	          }

	    	         giri�hakk� -= 1 ;
	    	         
	    	         if (giri�hakk� == 0 ) {
	    	        	 break ;
	    	         }
	    	    
	    	
	    }                                                

      }
  }