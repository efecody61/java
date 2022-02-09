package deneme;
import java.util.Scanner;
public class kullanýcýgiriþi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		System.out.println("                         ");
		System.out.println("Giriþ için  bekleyin...");
		System.out.println("                         ");

		String akullanýcý = "efe büyükyýlmaz";
		String aparola = "02081967";
		int giriþhakký = 3 ;
		 
	    while(true) {
	    	
	    	System.out.print("kullaný adý:");
	    	String kullanýcý = scanner.nextLine();
	    	System.out.print("parola:");
	    	String parola = scanner.nextLine();
	    	
	    	    if(akullanýcý.equals(kullanýcý)  && aparola.equals(parola)){
	    		
	    		   System.out.println("Hoþgeldiniz    " + akullanýcý );
	    	                 break;	
	    	       }
	    	          else if (akullanýcý.equals(kullanýcý) && !aparola.equals(parola)) {
	    	
	    	                   System.out.println("parola hatalý "+ (giriþhakký-1) +" hakkýnýz kaldý");
	    	        }
	    	
	    	          else if (!akullanýcý.equals(kullanýcý) && aparola.equals(parola)) {
	    	    
	    	        	  System.out.println("kullanýcý adý hatalý "+ (giriþhakký-1) +" hakkýnýz kaldý");
	    	          }
	    	          
	    	          else if (!akullanýcý.equals(kullanýcý) && !aparola.equals(parola)) {
	    	        	  
	    	        	  System.out.println("kullanýcý adý ve parola hatalý " +(giriþhakký-1) +" hakkýnýz kaldý.");

	    	          }

	    	         giriþhakký -= 1 ;
	    	         
	    	         if (giriþhakký == 0 ) {
	    	        	 break ;
	    	         }
	    	    
	    	
	    }                                                

      }
  }