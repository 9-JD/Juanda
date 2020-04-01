package unidad3;

public class energia {

	public static void main(String[] args) {

		
	
		int numero_de_visitas= (int)(Math.random()*100 +1);
		
		int i =0;
		int A=65;
		int a=0;
		int B=66;
		int b=0;
		int C=67;
		int c=0;
		int D=68;
		int d=0;
		int casas=0;
		while ( i < numero_de_visitas) {
			
			
			 casas = (int)(Math.random()*(69-65)+65);
			
			i++;
			
			if (casas==A) {
				 ++a;
			}
			
			else if (casas==B) {
				 ++b;
			}
			
			else if (casas==C) {
				 ++c;
			}
			
			
			else	if (casas==D) {
				 ++d;
			}
			
		}
		
		
		System.out.println ("numero de casa visitadas " +numero_de_visitas );
		System.out.println ("numero de casa de clase A " +a+" su procentaje es "+(a/(double)numero_de_visitas)*100+"%");
		System.out.println ("numero de casa de clase B " +b+" su procentaje es "+((double)b/numero_de_visitas)*100+"%");
		System.out.println ("numero de casa de clase C " +c+" su procentaje es "+(c/(double)numero_de_visitas)*100+"%");
		System.out.println ("número de las viviendas que no poseen estudio energético " +d+" su procentaje es "+((double)d/numero_de_visitas)*100+"%");
		
	

	}

}
