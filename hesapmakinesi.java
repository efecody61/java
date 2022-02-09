 package deneme;
import java.util.Scanner;
public class hesapmakinesi {

	public static int toplama (int a , int b , int c) {
		
		return (a+b+c);
	}
	
    public static int toplama (int a , int b  ) {
		
		return (a+b);
	}
    public static int çýkarma (int a , int b  ) {
		
		return (a-b);
	}
   public static double bölme (int a , int b ) {
		
		return ((double)a/b);
	}
   public static int çarpma (int a , int b , int c) {
		
		return (a*b*c);
	}
   public static int çarpma (int a , int b ) {
		
		return (a*b);
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		
		String iþlemler = "1.iþlem toplama\n"
				        + "2.iþlem çýkarma\n"
				        + "3.iþlem çarpma\n"
				        + "4.iþlem bölme\n"
				        + "çýkýþ için q a basýn";
		System.out.println(" ");
		System.out.println(iþlemler);
		System.out.println(" ");

		while(true) {
       
			System.out.println("iþlem seçiniz : ");			
 		String iþlem = scanner.nextLine();
        if (iþlem.equals("1")) {
        	
        	System.out.println("kaç adet sayý toplayacaksýnýz(2 veya 3: ");
                int kaçsayý = scanner.nextInt();
                
        	 if(kaçsayý == 2) {
                 System.out.print("Birinci sayý: ");
        		 int a = scanner.nextInt();
        		 System.out.print("Ýkinci sayý: ");
        		 int b = scanner.nextInt();
        		 scanner.nextLine();
        		 System.out.println("girlen sayýlarýn toplamlarý:"+ toplama(a,b));
        	 }
        	 else if (kaçsayý == 3) {
        
        		System.out.print("Birinci sayý: "); 
        		int a = scanner.nextInt();
        		System.out.print("Ýkinci sayý: ");
                int b = scanner.nextInt();
                System.out.print("Üçüncü sayý: ");
        	    int c = scanner.nextInt();
        	    scanner.nextLine();
        	    System.out.println("girilen sayýlarýn toplamý: " + toplama(a,b,c));


        	 }
        	 else {
        		 System.out.println("medot bulunamadý...");
        	 }
 
            
        
        }
        else if(iþlem.equals("2")) {
         System.out.print("Birinci sayý: ");
   		 int a = scanner.nextInt();
   		 System.out.print("Ýkinci sayý: ");
   		 int b = scanner.nextInt();
   		scanner.nextLine();
   		 System.out.println("girlen sayýlarýn farklarý:"+ çýkarma(a,b));	
        	
        	
        }
        else if(iþlem.equals("3")) {
        	System.out.println("kaç adet sayý çarpacaksýnýz:");
				 int kaçsayý = scanner.nextInt();
	                
	        	 if(kaçsayý == 2) {
	                 System.out.print("Birinci sayý: ");
	        		 int a = scanner.nextInt();
	        		 System.out.print("Ýkinci sayý: ");
	        		 int b = scanner.nextInt();
	        		 scanner.nextLine();
	        		 System.out.println("girlen sayýlarýn çarpýmlarý:"+ çarpma(a,b));
	        	 }
	        	 else if (kaçsayý == 3) {
	        		System.out.print("Birinci sayý: "); 
	        		int a = scanner.nextInt();
	        		System.out.print("Ýkinci sayý: ");
	                int b = scanner.nextInt();
	                System.out.print("Üçüncü sayý: ");
	        	    int c = scanner.nextInt();
	        	    scanner.nextLine();
	        	    System.out.println("girilen sayýlarýn çarpýmlarý: " + çarpma(a,b,c));


	        	 }
	        	 else {
	        		 System.out.println("medot bulunamadý...");
	        	 }
	 
	            
	        
				
			}
			
        else if(iþlem.equals("4")) {
        	System.out.print("Birinci sayý: ");
      		 int a = scanner.nextInt();
      		 System.out.print("Ýkinci sayý: ");
      		 int b = scanner.nextInt();
      		scanner.nextLine();
      		 System.out.println("girlen sayýlarýn bölümü:"+ bölme(a,b));	
        }
		
        else if(iþlem.equals("q")) {
        	System.out.println("iþlemlerden çýkýlýyor...");
        break;
        }
        else {
        	System.out.println("uygun iþlem bulunamadý...");
        }
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
