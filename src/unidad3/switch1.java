package unidad3;

import java.util.Scanner;

public class switch1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("introduce nota");
		
		int e =sc.nextInt();
		
		switch (e) {
		
		case 0:
			System.out.println("supendido");
		break;
		case 1:
			System.out.println("supendido");
		break;
		case 2:
			System.out.println("supendido");
		break;
		case 3:
			System.out.println("supendido");
		break;
		case 4:
			System.out.println("supendido");
		break;
		case 5:
			System.out.println("sufi");
		break;
		case 6:
			System.out.println("bien");
		break;
		case 7:
			System.out.println("note");
		break;
		case 8:
			System.out.println("note");
		break;
		case 9:
			System.out.println("sobre");
		break;
		case 10:
			System.out.println("sobre");
		break;
		
		default:
		
			System.out.println("imposible de valorar");
		
		
		
		
		sc.close();
		
		
		}

	}

}
