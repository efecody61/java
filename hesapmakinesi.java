 package deneme;
import java.util.Scanner;
public class hesapmakinesi {

	public static int toplama (int a , int b , int c) {
		
		return (a+b+c);
	}
	
    public static int toplama (int a , int b  ) {
		
		return (a+b);
	}
    public static int ��karma (int a , int b  ) {
		
		return (a-b);
	}
   public static double b�lme (int a , int b ) {
		
		return ((double)a/b);
	}
   public static int �arpma (int a , int b , int c) {
		
		return (a*b*c);
	}
   public static int �arpma (int a , int b ) {
		
		return (a*b);
	}
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner (System.in);
		
		String i�lemler = "1.i�lem toplama\n"
				        + "2.i�lem ��karma\n"
				        + "3.i�lem �arpma\n"
				        + "4.i�lem b�lme\n"
				        + "��k�� i�in q a bas�n";
		System.out.println(" ");
		System.out.println(i�lemler);
		System.out.println(" ");

		while(true) {
       
			System.out.println("i�lem se�iniz : ");			
 		String i�lem = scanner.nextLine();
        if (i�lem.equals("1")) {
        	
        	System.out.println("ka� adet say� toplayacaks�n�z(2 veya 3: ");
                int ka�say� = scanner.nextInt();
                
        	 if(ka�say� == 2) {
                 System.out.print("Birinci say�: ");
        		 int a = scanner.nextInt();
        		 System.out.print("�kinci say�: ");
        		 int b = scanner.nextInt();
        		 scanner.nextLine();
        		 System.out.println("girlen say�lar�n toplamlar�:"+ toplama(a,b));
        	 }
        	 else if (ka�say� == 3) {
        
        		System.out.print("Birinci say�: "); 
        		int a = scanner.nextInt();
        		System.out.print("�kinci say�: ");
                int b = scanner.nextInt();
                System.out.print("���nc� say�: ");
        	    int c = scanner.nextInt();
        	    scanner.nextLine();
        	    System.out.println("girilen say�lar�n toplam�: " + toplama(a,b,c));


        	 }
        	 else {
        		 System.out.println("medot bulunamad�...");
        	 }
 
            
        
        }
        else if(i�lem.equals("2")) {
         System.out.print("Birinci say�: ");
   		 int a = scanner.nextInt();
   		 System.out.print("�kinci say�: ");
   		 int b = scanner.nextInt();
   		scanner.nextLine();
   		 System.out.println("girlen say�lar�n farklar�:"+ ��karma(a,b));	
        	
        	
        }
        else if(i�lem.equals("3")) {
        	System.out.println("ka� adet say� �arpacaks�n�z:");
				 int ka�say� = scanner.nextInt();
	                
	        	 if(ka�say� == 2) {
	                 System.out.print("Birinci say�: ");
	        		 int a = scanner.nextInt();
	        		 System.out.print("�kinci say�: ");
	        		 int b = scanner.nextInt();
	        		 scanner.nextLine();
	        		 System.out.println("girlen say�lar�n �arp�mlar�:"+ �arpma(a,b));
	        	 }
	        	 else if (ka�say� == 3) {
	        		System.out.print("Birinci say�: "); 
	        		int a = scanner.nextInt();
	        		System.out.print("�kinci say�: ");
	                int b = scanner.nextInt();
	                System.out.print("���nc� say�: ");
	        	    int c = scanner.nextInt();
	        	    scanner.nextLine();
	        	    System.out.println("girilen say�lar�n �arp�mlar�: " + �arpma(a,b,c));


	        	 }
	        	 else {
	        		 System.out.println("medot bulunamad�...");
	        	 }
	 
	            
	        
				
			}
			
        else if(i�lem.equals("4")) {
        	System.out.print("Birinci say�: ");
      		 int a = scanner.nextInt();
      		 System.out.print("�kinci say�: ");
      		 int b = scanner.nextInt();
      		scanner.nextLine();
      		 System.out.println("girlen say�lar�n b�l�m�:"+ b�lme(a,b));	
        }
		
        else if(i�lem.equals("q")) {
        	System.out.println("i�lemlerden ��k�l�yor...");
        break;
        }
        else {
        	System.out.println("uygun i�lem bulunamad�...");
        }
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
