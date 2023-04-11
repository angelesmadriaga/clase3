package clase3;

public class Clase3eje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String S1="una cadena de palabras en java";
		int i;
		int i2 = S1.length(); 
		int a=0;
		 for (i = 0 ; i < i2 ; i++) {
			 if(S1.charAt(i)=='a') {
				 
				 a = a + 1 ;
			 
			 }
		
			 
		 }
		System.out.println("  la cantidad de letras a es :   "  + a);
		

	}

}
