package examen2eva;

public class actividadvectores {

	static int mediano[];
	static String med[];
	public static void main(String[] args) {
	
		int visitas []= {612, 561, 6230 , 2434, 123};
		String vistasl []= {"A", "B", "C", "D", "E"};
		
		String mayor1="";
		String menor1="";
		String mediano1="";
		int sumatotal=0;
		
		
		int mayor=visitas[0];
		int menor=visitas[0];
		int c=0;
		
		
		
		for (int i=0; i<visitas.length; i++) {
			
			
			if (visitas[i]>mayor) {
				
				mayor=visitas[i];
				
				
				
			}
			
			
	if (visitas[i]<menor) {
				
				menor=visitas[i];
				
				
				
			}
			
			

		}
	
	for (int i=0; i<visitas.length; i++) {
		
		
		
		
		if (visitas[i]<mayor && visitas[i]>menor) {
			
			++c;
		}		
				

	
	
	
		}
		
	mayor1+=mayor;
	menor1+=menor;
	
		med= new String [c];
		mediano = new int [c];
		
	
	int grande[];
	int pequeño[];
		int a=0;
		int b=0;
		int d=0;
	for (int i=0; i<visitas.length;  i++) {
		
		if (visitas[i]==mayor) {
			
		
			
		
		mayor1+=vistasl[i]+" ";
		
		
		
		}
		
		
if (visitas[i]==menor) {

	
		
		menor1+=vistasl[i]+" ";	
			
		}
		
		
		
	if (visitas[i]<mayor && visitas [i]>menor) {
	
	
	med[d]=vistasl[i];	
	
	mediano[d]=visitas[i];
	++d;	
		
	}	
		
	sumatotal+=visitas[i];	
	}	
		
		
	for (int i=0; i<mediano.length; ++i) {
		
		for (int k=0; k<mediano.length; ++k) {
			
			
		if (mediano[i]>mediano[k]) {
			
			int aux=mediano[i];
			mediano[i]=mediano[k];
			mediano[k]=aux;
			
			 String aux1=med[i];
			
			med[i]=med[k];
			med[k]=aux1;
			
			
			
		}	
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
	}	

		
	for (int i=0; i<mediano.length; ++i) {
		
		
	mediano1+=mediano[i]+" "+med[i]+" ";	
		
		
		
	}	
		
		
		
	System.out.println("mayor numero de visitas  "+mayor1);	
	System.out.println("menor numero de visitas  "+menor1);
	System.out.println("mediano numero de visitas  "+mediano1);	
	System.out.println("suma  "+sumatotal);
		
		
		
		
		
		
		
		

	}

}
