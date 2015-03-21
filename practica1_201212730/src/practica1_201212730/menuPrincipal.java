package practica1_201212730;

import java.util.*;

public class menuPrincipal {

	public static void main(String[] args) {
		menuPrincipal ejecutar = new menuPrincipal();
		
		ejecutar.inicio();

	}////fin main principal
	
	public void inicio(){
		int entrada1=0;
		
		System.out.println("");
		System.out.println("Bienvenido a Mi Programa");

		
		menuPrincipal nivel = new menuPrincipal();
		//nivel1Prog nivel1 = new nivel1Prog();
		Scanner entrada = new Scanner(System.in);
		
		do{
			System.out.println("Ingrese El Nivel De Dificultad");
			System.out.println("Ingrese 0 = Para Salir Del Programa :-)");
			System.out.println("Ingrese 1 = Para el Nivel 1");
			System.out.println("Ingrese 2 = Para el Nivel 2");
			
			entrada1= entrada.nextInt();	
			if (entrada1<0 || entrada1>2){
				System.out.println("Ingrese Un Número Válido P-) ");
				System.out.println("");
			}
	}
		while(entrada1<0 || entrada1>2);
		
		switch (entrada1){
		case 0: System.out.println ("Hasta Pronto Carnal "); break;
		case 1: nivel.primerNivel(); break;
		case 2: nivel.segundoNivel(); break;
		default : System.out.println("Ingrese El Número 1 ó 2"); System.out.println(""+entrada1);
		}
		//System.out.println("Fin Del Programa Principal");
		
	}//fin del inicio
	
	
	public void primerNivel(){
		int entrada2=0;
		Scanner ingresar2 = new Scanner(System.in);
		nivel1 nivel1 = new nivel1();
		
		do{
			System.out.println("Bienvenido Al Nivel 1");
			System.out.println("1 = Imprime Un Rombo");
			System.out.println("2 = Media de 6 Puntuaciones");
			System.out.println("3 = Cambiar Notación De Hora de 24hrs a 12hrs");
			System.out.println("4 = Calcúlo De Figuras Geometricas");
			System.out.println("5=  Número De Dias De Diferencia Entre 2 Fechas");
			entrada2= ingresar2.nextInt();
		}
		while (entrada2<1 || entrada2>5 );
		
		switch (entrada2){
		case 1: nivel1.programa1(); break;
		case 2: nivel1.programa2(); break;
		case 3: nivel1.programa3(); break;
		case 4: nivel1.programa4(); break;
		case 5: nivel1.programa5(); break;
		}
		
	}
	
	public void segundoNivel(){
		int entrada3 =0;
		Scanner ingresar3 = new Scanner (System.in);
		nivel2 nivel = new nivel2();
		
		do{
			System.out.println("Bienvenido Al Nivel 2");
			System.out.println("6 = Calculadora Simple");
			System.out.println("7 = Mostrar Tabla De Multiplicación De Un Número");
			System.out.println("8 = Número Aleatorio En Letras");
			System.out.println("9 = Pasar Un Número A Numeración Romana");
			System.out.println("10 = Piramide Invertida De Números");
			System.out.println("11 = Número Menor y Mayor En Romanos");
			System.out.println("12 = Palabra En Asteriscos");
			System.out.println("13 = Adivinar Letra Del Abecedario");
			System.out.println("14 = Dibujar Cuadrado Con *");
			System.out.println("15 = Números Primos De Un Número ");
			entrada3= ingresar3.nextInt();
			
		}
		while (entrada3<6 || entrada3>15);
		
		switch (entrada3){
		case 6: nivel.programa6(); break;
		case 7: nivel.programa7(); break;
		case 8: nivel.programa8(); break;
		case 9: nivel.programa9(); break;
		case 10: nivel.programa10(); break;
		case 11: nivel.programa11(); break;
		case 12: nivel.programa12(); break;
		case 13: nivel.programa13(); break;
		case 14: nivel.programa14(); break;
		case 15: nivel.programa15(); break;
		}
	}
	

}
