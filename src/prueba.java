
public class prueba {

	public static void main(String[] args) {

		
		
		
		int  numAleatorio=(int)(Math.random()*1000000000);
		
		
		String fin="";
		
		String t="ES8023100001180000012345";
		
		
		
		
		
		
		
		int pos1=0;
		int pos2=3;
		
		
		for (int i=0; i<6; i++) {
			
			
			String t1= t.substring(pos1, pos2+1 );	
			pos1=pos1+4;
			pos2=pos2+4;
			
			fin+=t1+" ";
			
		}
		
		
	System.out.print(fin);	

	}

}
