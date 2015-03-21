package practica1_201212730;
import java.util.Scanner;
import java.util.Random;
//import java.util.ArrayList;

public class nivel2 {
	menuPrincipal regresar = new menuPrincipal();
	
	public void programa6(){
		System.out.println("Nivel 2");
		System.out.println("Programa 6");
		System.out.println(" ");
		
		int a=0, b=0;
		String operacion=" ";
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese Dos Números Enteros ");
		System.out.println("Ingrese El Primer Número ");
		a= entrada.nextInt();
		System.out.println("Ingrese El Segundo Número");
		b= entrada.nextInt();
		System.out.println(" ");
		
		System.out.println("Ingrese La Letra Para La Operación Deseada");
		System.out.println("s = Sumar ");
		System.out.println("r = Diferencia ");
		System.out.println("m = Producto ");
		System.out.println("d = Cociente ");
		operacion= entrada.next();
		
		if (operacion.charAt(0)=='s' || operacion.charAt(0)=='S') System.out.println ("El Resultado De La Suma Es: "+(a+b));
		if (operacion.charAt(0)=='r' || operacion.charAt(0)=='R') System.out.println ("El Resultado De La Resta Es: "+(a-b));
		if (operacion.charAt(0)=='m' || operacion.charAt(0)=='M') System.out.println ("El Resultado De La Producto Es: "+(a*b));
		if (operacion.charAt(0)=='d' || operacion.charAt(0)=='D') System.out.println ("El Resultado Del Cociente Es: "+(a%b));
		
		regresar.inicio();
	}
	
	public void programa7(){
		System.out.println("Nivel 2");
		System.out.println("Programa 7");
		System.out.println(" ");

		int a=0;
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingrese El Número De La Tabla de Multiplicación Deseada ");
		a = entrada.nextInt();
		
		for (int i=20; i>0; i--){
			System.out.println(a+" x "+i+" = "+(a*i));
		}
		regresar.inicio();
	}
	
	public void programa8(){
		System.out.println("Nivel 2");
		System.out.println("Programa 8");
		System.out.println(" ");

		int a=0, b=0, numero=0;
		String letras="", unidad=" ", decena=" ";
		
		Scanner entrada = new Scanner(System.in);
		Random rnd = new Random ();
		
		System.out.println("Ingrese El Límite Inferior, Mayor Que Cero ");
		a = entrada.nextInt();
		System.out.println("Ingrese El Límite Superior, Menor Que Cien");
		b = entrada.nextInt();
		
		numero = (int)(rnd.nextDouble() * b + a );
		System.out.println("El Número Aleatorio Es: " + numero);
		
		letras = String.valueOf(numero);
		
		if (letras.length() == 1){
		if (letras.charAt(0)=='0'){decena="cero";}
		if (letras.charAt(0)=='1'){decena="uno";}
		if (letras.charAt(0)=='2'){decena="dos";}
		if (letras.charAt(0)=='3'){decena="tres";}
		if (letras.charAt(0)=='4'){decena="cuatro";}
		if (letras.charAt(0)=='5'){decena="cinco";}
		if (letras.charAt(0)=='6'){decena="seis";}
		if (letras.charAt(0)=='7'){decena="siete";}
		if (letras.charAt(0)=='8'){decena="ocho";}
		if (letras.charAt(0)=='9'){decena="nueve";}
		}
		
		if (letras.length() > 1){
		if (letras.charAt(0)==' '){unidad=" ";}
		if (letras.charAt(0)=='1'){unidad="Dieci";}
		if (letras.charAt(0)=='2'){unidad="Veinti";}
		if (letras.charAt(0)=='3'){unidad="Treinta";}
		if (letras.charAt(0)=='4'){unidad="Cuarenta";}
		if (letras.charAt(0)=='5'){unidad="Cincuenta";}
		if (letras.charAt(0)=='7'){unidad="Setenta";}
		if (letras.charAt(0)=='8'){unidad="Ochenta";}
		if (letras.charAt(0)=='9'){unidad="Noventa";}
		
		if (letras.charAt(1)==' '){decena=" ";}
		if (letras.charAt(1)=='1'){decena="uno";}
		if (letras.charAt(1)=='2'){decena="dos";}
		if (letras.charAt(1)=='3'){decena="tres";}
		if (letras.charAt(1)=='4'){decena="cuatro";}
		if (letras.charAt(1)=='5'){decena="cinco";}
		if (letras.charAt(1)=='6'){decena="seis";}
		if (letras.charAt(1)=='7'){decena="siete";}
		if (letras.charAt(1)=='8'){decena="ocho";}
		if (letras.charAt(1)=='9'){decena="nueve";}
		
	}
		System.out.println("El Número en Letras Es: "+ unidad+ "  y " + decena );
		regresar.inicio();
	}
	
	public void programa9(){
		System.out.println("Nivel 2");
		System.out.println("Programa 9");
		System.out.println(" ");

		int numero=0;
		String primero="", unidad =" ", decena=" ";
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese Un Número");
		numero = entrada.nextInt();
		primero = String.valueOf(numero);
		
		
		if (primero.charAt(0)=='0' & numero<10 ){unidad=" ";}
		if (primero.charAt(0)=='1' & numero<10 ){unidad="I";}
		if (primero.charAt(0)=='2' & numero<10 ){unidad="II";}
		if (primero.charAt(0)=='3' & numero<10 ){unidad="III";}
		if (primero.charAt(0)=='4' & numero<10 ){unidad="IV";}
		if (primero.charAt(0)=='5' & numero<10 ){unidad="V";}
		if (primero.charAt(0)=='6' & numero<10 ){unidad="VI";}
		if (primero.charAt(0)=='7' & numero<10 ){unidad="VII";}
		if (primero.charAt(0)=='8' & numero<10 ){unidad="VIII";}
		if (primero.charAt(0)=='9' & numero<10 ){unidad="IX";}
		
		if (primero.charAt(0)=='0' & numero>10 ){unidad=" ";}
		if (primero.charAt(0)=='1' & numero>10 ){unidad="X";}
		if (primero.charAt(0)=='2' & numero>10 ){unidad="XX";}
		if (primero.charAt(0)=='3' & numero>10 ){unidad="XXX";}
		if (primero.charAt(0)=='4' & numero>10 ){unidad="XL";}
		if (primero.charAt(0)=='5' & numero>10 ){unidad="L";}
		if (primero.charAt(0)=='6' & numero>10 ){unidad="LX";}
		if (primero.charAt(0)=='7' & numero>10 ){unidad="LXX";}
		if (primero.charAt(0)=='8' & numero>10 ){unidad="LXXX";}
		if (primero.charAt(0)=='9' & numero>10 ){unidad="XC";}
		
		if (primero.length() > 1){
		
		if (primero.charAt(0)=='1' & primero.charAt(1)=='0' ){unidad= "X"; decena=" ";}	
		if (primero.charAt(1)=='1' & numero>10 ){decena="I";}
		if (primero.charAt(1)=='2' & numero>10 ){decena="II";}
		if (primero.charAt(1)=='3' & numero>10 ){decena="III";}
		if (primero.charAt(1)=='4' & numero>10 ){decena="IV";}
		if (primero.charAt(1)=='5' & numero>10 ){decena="V";}
		if (primero.charAt(1)=='6' & numero>10 ){decena="VI";}
		if (primero.charAt(1)=='7' & numero>10 ){decena="VII";}
		if (primero.charAt(1)=='8' & numero>10 ){decena="VIII";}
		if (primero.charAt(1)=='9' & numero>10 ){decena="IX";}
		
		if (numero==100){unidad=" "; decena="C";}
		}
		
		System.out.println(primero+" El Número En Romanos Es: "+ unidad+decena);
		
		regresar.inicio();
	}
	
	public void programa10(){
		System.out.println("Nivel 2");
		System.out.println("Programa 10");
		System.out.println(" ");
		
		int a=0, b=0, k=0, m=0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese Un Número");
		a = entrada.nextInt();
		b = a;
		
		for (int i = 0; i < a; i++) {
			m++;
			
		for (int j = 0; j < b; j++) {
			
				System.out.print(m+" ");
			
		}
		
		System.out.println();
		b = b-1;
		k = k+1;
		
		for ( int l = 0; l < k; l++) {
			System.out.print(" ");	
		}
		
		}
		
	
		regresar.inicio();

	}
	
	public void programa11(){
		System.out.println("Nivel 2");
		System.out.println("Programa 11");
		System.out.println(" ");
		
		int a=0, aux=0;
		boolean cambios = false;
		String romano = " ";
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese El Tamaño De La Lista");
		a = entrada.nextInt();
		
		String ingresar [] = new String [a];
				
		for (int i = 0; i< a; i++) {
			
			System.out.println("Ingrese Un Número Romano: ");
			romano = entrada.next();
			
			System.out.println(""+i);
		ingresar[i] = romano;	 
		///////////	
		////////////
		}
		
		
		int ordenar [] = new int [a];
		for (int i = 0; i < a; i++) {
			System.out.println();
			
			if (ingresar[i].equals("I")){ ordenar[i] = 1;} 
			if (ingresar[i].equals("II")){ ordenar[i] = 2;}
			if (ingresar[i].equals("III")){ ordenar[i] = 3;}
			if (ingresar[i].equals("IV")){ ordenar[i] = 4;}
			if (ingresar[i].equals("V")){ ordenar[i] = 5;}
			if (ingresar[i].equals("VI")){ ordenar[i] = 6;} 
			if (ingresar[i].equals("VII")){ ordenar[i] = 7;}
			if (ingresar[i].equals("VIII")){ ordenar[i] = 8;}
			if (ingresar[i].equals("IX")){ ordenar[i] = 9;}
			if (ingresar[i].equals("X")){ ordenar[i] = 10;}
			if (ingresar[i].equals("XI")){ ordenar[i] = 11;} 
			if (ingresar[i].equals("XII")){ ordenar[i] = 12;}
			if (ingresar[i].equals("XIII")){ ordenar[i] = 13;}
			if (ingresar[i].equals("XIV")){ ordenar[i] = 14;}
			if (ingresar[i].equals("XV")){ ordenar[i] = 15;}
			if (ingresar[i].equals("XVI")){ ordenar[i] = 16;} 
			if (ingresar[i].equals("XVII")){ ordenar[i] = 17;}
			if (ingresar[i].equals("XVIII")){ ordenar[i] = 18;}
			if (ingresar[i].equals("XIX")){ ordenar[i] = 19;}
			if (ingresar[i].equals("XX")){ ordenar[i] = 20;}
			if (ingresar[i].equals("XXI")){ ordenar[i] = 21;} 
			if (ingresar[i].equals("XXII")){ ordenar[i] = 22;}
			if (ingresar[i].equals("XXIII")){ ordenar[i] = 23;}
			if (ingresar[i].equals("XXIV")){ ordenar[i] = 24;}
			if (ingresar[i].equals("XXV")){ ordenar[i] = 25;}
			if (ingresar[i].equals("XXVI")){ ordenar[i] = 26;} 
			if (ingresar[i].equals("XXVII")){ ordenar[i] = 27;}
			if (ingresar[i].equals("XXVIII")){ ordenar[i] = 28;}
			if (ingresar[i].equals("XXIX")){ ordenar[i] = 29;}
			if (ingresar[i].equals("XXX")){ ordenar[i] = 30;}
			if (ingresar[i].equals("XXXI")){ ordenar[i] = 31;} 
			if (ingresar[i].equals("XXXII")){ ordenar[i] = 32;}
			if (ingresar[i].equals("XXXIII")){ ordenar[i] = 33;}
			if (ingresar[i].equals("XXXIV")){ ordenar[i] = 34;}
			if (ingresar[i].equals("XXXV")){ ordenar[i] = 35;}
			if (ingresar[i].equals("XXXVI")){ ordenar[i] = 36;} 
			if (ingresar[i].equals("XXXVII")){ ordenar[i] = 37;}
			if (ingresar[i].equals("XXXVIII")){ ordenar[i] = 38;}
			if (ingresar[i].equals("XXXIX")){ ordenar[i] = 39;}
			if (ingresar[i].equals("XL")){ ordenar[i] = 40;}
			if (ingresar[i].equals("XLI")){ ordenar[i] = 41;} 
			if (ingresar[i].equals("XLII")){ ordenar[i] = 42;}
			if (ingresar[i].equals("XLIII")){ ordenar[i] = 43;}
			if (ingresar[i].equals("XLIV")){ ordenar[i] = 44;}
			if (ingresar[i].equals("XLV")){ ordenar[i] = 45;}
			if (ingresar[i].equals("XLVI")){ ordenar[i] = 46;} 
			if (ingresar[i].equals("XLVII")){ ordenar[i] = 47;}
			if (ingresar[i].equals("XLVIII")){ ordenar[i] = 48;}
			if (ingresar[i].equals("XLIX")){ ordenar[i] = 49;}
			if (ingresar[i].equals("L")){ ordenar[i] = 50;}
			if (ingresar[i].equals("LI")){ ordenar[i] = 51;} 
			if (ingresar[i].equals("LII")){ ordenar[i] = 52;}
			if (ingresar[i].equals("LIII")){ ordenar[i] = 53;}
			if (ingresar[i].equals("LIV")){ ordenar[i] = 54;}
			if (ingresar[i].equals("LV")){ ordenar[i] = 55;}
			if (ingresar[i].equals("LVI")){ ordenar[i] = 56;} 
			if (ingresar[i].equals("LVII")){ ordenar[i] = 57;}
			if (ingresar[i].equals("LVIII")){ ordenar[i] = 58;}
			if (ingresar[i].equals("LIX")){ ordenar[i] = 59;}
			if (ingresar[i].equals("LX")){ ordenar[i] = 60;}
			if (ingresar[i].equals("LXI")){ ordenar[i] = 61;} 
			if (ingresar[i].equals("LXII")){ ordenar[i] = 62;}
			if (ingresar[i].equals("LXIII")){ ordenar[i] = 63;}
			if (ingresar[i].equals("LXIV")){ ordenar[i] = 64;}
			if (ingresar[i].equals("LXV")){ ordenar[i] = 65;}
			if (ingresar[i].equals("LXVI")){ ordenar[i] = 66;} 
			if (ingresar[i].equals("LXVII")){ ordenar[i] = 67;}
			if (ingresar[i].equals("LXVIII")){ ordenar[i] = 68;}
			if (ingresar[i].equals("LXIX")){ ordenar[i] = 69;}
			if (ingresar[i].equals("LXX")){ ordenar[i] = 70;}
			if (ingresar[i].equals("LXXI")){ ordenar[i] = 71;} 
			if (ingresar[i].equals("LXXII")){ ordenar[i] = 72;}
			if (ingresar[i].equals("LXXIII")){ ordenar[i] = 73;}
			if (ingresar[i].equals("LXXIV")){ ordenar[i] = 74;}
			if (ingresar[i].equals("LXXV")){ ordenar[i] = 75;}
			if (ingresar[i].equals("LXXVI")){ ordenar[i] = 76;} 
			if (ingresar[i].equals("LXXVII")){ ordenar[i] = 77;}
			if (ingresar[i].equals("LXXVIII")){ ordenar[i] = 78;}
			if (ingresar[i].equals("LXXIX")){ ordenar[i] = 79;}
			if (ingresar[i].equals("LXXX")){ ordenar[i] = 80;}
			if (ingresar[i].equals("LXXXI")){ ordenar[i] = 81;} 
			if (ingresar[i].equals("LXXXII")){ ordenar[i] = 82;}
			if (ingresar[i].equals("LXXXIII")){ ordenar[i] = 83;}
			if (ingresar[i].equals("LXXXIV")){ ordenar[i] = 84;}
			if (ingresar[i].equals("LXXXV")){ ordenar[i] = 85;}
			if (ingresar[i].equals("LXXXVI")){ ordenar[i] = 86;} 
			if (ingresar[i].equals("LXXXVII")){ ordenar[i] = 87;}
			if (ingresar[i].equals("LXXXVIII")){ ordenar[i] = 88;}
			if (ingresar[i].equals("LXXXIX")){ ordenar[i] = 89;}
			if (ingresar[i].equals("XC")){ ordenar[i] = 90;}
			if (ingresar[i].equals("XCI")){ ordenar[i] = 91;} 
			if (ingresar[i].equals("XCII")){ ordenar[i] = 92;}
			if (ingresar[i].equals("XCIII")){ ordenar[i] = 93;}
			if (ingresar[i].equals("XCIV")){ ordenar[i] = 94;}
			if (ingresar[i].equals("XCV")){ ordenar[i] = 95;}
			if (ingresar[i].equals("XCVI")){ ordenar[i] = 96;} 
			if (ingresar[i].equals("XCVII")){ ordenar[i] = 97;}
			if (ingresar[i].equals("XCVIII")){ ordenar[i] = 98;}
			if (ingresar[i].equals("XCIX")){ ordenar[i] = 99;}
			if (ingresar[i].equals("C")){ ordenar[i] = 100;}
			
		}
		
		for (int i = 0; i < a; i++) {
			System.out.println(" lista "+ ingresar[i]);
			System.out.println(" valor "+ ordenar[i]);
		}
		
		//ordenamiento muy importante
		while (true){
			cambios = false;
			for (int i = 1; i < ordenar.length; i++) {
				
				if (ordenar[i]<ordenar[i-1]){
					aux = ordenar[i];
					ordenar[i] = ordenar[i-1];
					ordenar[i-1] = aux;
					cambios = true;
				}
					
			}
			if (cambios == false)
			break;
		}
		
		for (int i = 0; i < a; i++) {
			System.out.println(ordenar[i]);
		}	
		System.out.println("El Número Menor Es: "+ordenar[0] );
		System.out.println("El Mayor Es: "+ ordenar[a-1]);
		
		String letras, unidad="", decena="", letras2="", unidad2="", decena2=""; 
		letras = String.valueOf(ordenar[0]);
		
		if (letras.length() == 1){
		if (letras.charAt(0)=='0'){decena="cero";}
		if (letras.charAt(0)=='1'){decena="uno";}
		if (letras.charAt(0)=='2'){decena="dos";}
		if (letras.charAt(0)=='3'){decena="tres";}
		if (letras.charAt(0)=='4'){decena="cuatro";}
		if (letras.charAt(0)=='5'){decena="cinco";}
		if (letras.charAt(0)=='6'){decena="seis";}
		if (letras.charAt(0)=='7'){decena="siete";}
		if (letras.charAt(0)=='8'){decena="ocho";}
		if (letras.charAt(0)=='9'){decena="nueve";}
		}
		
		if (letras.length() > 1){
		if (letras.charAt(0)==' '){unidad=" ";}
		if (letras.charAt(0)=='1'){unidad="Dieci";}
		if (letras.charAt(0)=='2'){unidad="Veinti";}
		if (letras.charAt(0)=='3'){unidad="Treinta";}
		if (letras.charAt(0)=='4'){unidad="Cuarenta";}
		if (letras.charAt(0)=='5'){unidad="Cincuenta";}
		if (letras.charAt(0)=='7'){unidad="Setenta";}
		if (letras.charAt(0)=='8'){unidad="Ochenta";}
		if (letras.charAt(0)=='9'){unidad="Noventa";}

		
		
		if (letras.charAt(1)==' '){decena=" ";}
		if (letras.charAt(1)=='1'){decena="uno";}
		if (letras.charAt(1)=='2'){decena="dos";}
		if (letras.charAt(1)=='3'){decena="tres";}
		if (letras.charAt(1)=='4'){decena="cuatro";}
		if (letras.charAt(1)=='5'){decena="cinco";}
		if (letras.charAt(1)=='6'){decena="seis";}
		if (letras.charAt(1)=='7'){decena="siete";}
		if (letras.charAt(1)=='8'){decena="ocho";}
		if (letras.charAt(1)=='9'){decena="nueve";}
		}
		
		letras2 = String.valueOf(ordenar[a-1]);
		
		if (letras2.length() == 1){
		if (letras2.charAt(0)=='0'){decena2="cero";}
		if (letras2.charAt(0)=='1'){decena2="uno";}
		if (letras2.charAt(0)=='2'){decena2="dos";}
		if (letras2.charAt(0)=='3'){decena2="tres";}
		if (letras2.charAt(0)=='4'){decena2="cuatro";}
		if (letras2.charAt(0)=='5'){decena2="cinco";}
		if (letras2.charAt(0)=='6'){decena2="seis";}
		if (letras2.charAt(0)=='7'){decena2="siete";}
		if (letras2.charAt(0)=='8'){decena2="ocho";}
		if (letras2.charAt(0)=='9'){decena2="nueve";}
		}
		
		if (letras2.length() > 1){
		if (letras2.charAt(0)==' '){unidad2=" ";}
		if (letras2.charAt(0)=='1'){unidad2="Dieci";}
		if (letras2.charAt(0)=='2'){unidad2="Veinti";}
		if (letras2.charAt(0)=='3'){unidad2="Treinta";}
		if (letras2.charAt(0)=='4'){unidad2="Cuarenta";}
		if (letras2.charAt(0)=='5'){unidad2="Cincuenta";}
		if (letras2.charAt(0)=='6'){unidad2="Sesenta";}
		if (letras2.charAt(0)=='7'){unidad2="Setenta";}
		if (letras2.charAt(0)=='8'){unidad2="Ochenta";}
		if (letras2.charAt(0)=='9'){unidad2="Noventa";}
		
		if (letras2.charAt(1)==' '){decena2=" ";}
		if (letras2.charAt(1)=='1'){decena2="uno";}
		if (letras2.charAt(1)=='2'){decena2="dos";}
		if (letras2.charAt(1)=='3'){decena2="tres";}
		if (letras2.charAt(1)=='4'){decena2="cuatro";}
		if (letras2.charAt(1)=='5'){decena2="cinco";}
		if (letras2.charAt(1)=='6'){decena2="seis";}
		if (letras2.charAt(1)=='7'){decena2="siete";}
		if (letras2.charAt(1)=='8'){decena2="ocho";}
		if (letras2.charAt(1)=='9'){decena2="nueve";}
		
		if (letras.equals("100")){unidad = ""; decena="Cien";}
		if (letras2.equals("100")){unidad2 = ""; decena2="Cien";}
		
	}
		System.out.println("El Número Menor Es: " + unidad + " y " + decena);
		System.out.println("El Número Mayor Es: " + unidad2 + " y " + decena2);
		
		regresar.inicio();
	}
	
	public void programa12(){
		System.out.println("Nivel 2");
		System.out.println("Programa 12");
		System.out.println("");
		
		int numero=0;
		String palabra=" ";
		Scanner ingresar = new Scanner (System.in);
		
		
		System.out.println("Ingrese Una Palabra");
		palabra = ingresar.next();
		
		numero = palabra.length();
		
		for (int i = 0; i < numero; i++) {
			System.out.print("*");
		}
		
		System.out.println();
		System.out.println("La Longitud De La Palabra Es: "+numero);
		System.out.println();
		
		regresar.inicio();
	}
	
	public void programa13(){
		System.out.println("Nivel 2");
		System.out.println("Programa 13");
		System.out.println(" ");

		int a=0, b=0;
		String letra="", letrados="";
		boolean bandera = true;
		Scanner ingresar = new Scanner(System.in);
		
		System.out.println("Ingrese Una Letra EN MINUSCULA");
		letra = ingresar.next();
		
		if (letra.charAt(0)=='a') a = 1;
		if (letra.charAt(0)=='b') a = 2;
		if (letra.charAt(0)=='c') a = 3;
		if (letra.charAt(0)=='d') a = 4;
		if (letra.charAt(0)=='e') a = 5;
		if (letra.charAt(0)=='f') a = 6;
		if (letra.charAt(0)=='g') a = 7;
		if (letra.charAt(0)=='h') a = 8;
		if (letra.charAt(0)=='i') a = 9;
		if (letra.charAt(0)=='j') a = 10;
		if (letra.charAt(0)=='k') a = 11;
		if (letra.charAt(0)=='l') a = 12;
		if (letra.charAt(0)=='m') a = 13;
		if (letra.charAt(0)=='n') a = 14;
		if (letra.charAt(0)=='ñ') a = 15;
		if (letra.charAt(0)=='o') a = 16;
		if (letra.charAt(0)=='p') a = 17;
		if (letra.charAt(0)=='q') a = 18;
		if (letra.charAt(0)=='r') a = 19;
		if (letra.charAt(0)=='s') a = 20;
		if (letra.charAt(0)=='t') a = 21;
		if (letra.charAt(0)=='u') a = 22;
		if (letra.charAt(0)=='v') a = 23;
		if (letra.charAt(0)=='w') a = 24;
		if (letra.charAt(0)=='x') a = 25;
		if (letra.charAt(0)=='y') a = 26;
		if (letra.charAt(0)=='z') a = 27;
	
		do {
		System.out.println("Ingrese La Segunda Letra EN MINUSCULA para adivinar");
		letrados = ingresar.next();
		
		if (letrados.charAt(0)=='a') b = 1;
		if (letrados.charAt(0)=='b') b = 2;
		if (letrados.charAt(0)=='c') b = 3;
		if (letrados.charAt(0)=='d') b = 4;
		if (letrados.charAt(0)=='e') b = 5;
		if (letrados.charAt(0)=='f') b = 6;
		if (letrados.charAt(0)=='g') b = 7;
		if (letrados.charAt(0)=='h') b = 8;
		if (letrados.charAt(0)=='i') b = 9;
		if (letrados.charAt(0)=='j') b = 10;
		if (letrados.charAt(0)=='k') b = 11;
		if (letrados.charAt(0)=='l') b = 12;
		if (letrados.charAt(0)=='m') b = 13;
		if (letrados.charAt(0)=='n') b = 14;
		if (letrados.charAt(0)=='ñ') b = 15;
		if (letrados.charAt(0)=='o') b = 16;
		if (letrados.charAt(0)=='p') b = 17;
		if (letrados.charAt(0)=='q') b = 18;
		if (letrados.charAt(0)=='r') b = 19;
		if (letrados.charAt(0)=='s') b = 20;
		if (letrados.charAt(0)=='t') b = 21;
		if (letrados.charAt(0)=='u') b = 22;
		if (letrados.charAt(0)=='v') b = 23;
		if (letrados.charAt(0)=='w') b = 24;
		if (letrados.charAt(0)=='x') b = 25;
		if (letrados.charAt(0)=='y') b = 26;
		if (letrados.charAt(0)=='z') b = 27;
		
		if (a > b) System.out.println("Despues"); System.out.println("");
		if (a < b) System.out.println("Antes"); System.out.println("");
			
		if (a==b) {
		bandera = false;
		System.out.println("La Letra Es: "+letra);
		System.out.println("Acertaste Carnal");
		System.out.println("Fin");
		}
	}
		while (bandera);
		
		regresar.inicio();
	}
	
	public void programa14(){
		System.out.println("Nivel 2");
		System.out.println("Programa 14");
		System.out.println(" ");

		int a=0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese Un Número");
		a = entrada.nextInt();
		
		//arriba
		for (int i = 2; i <= a; i++) {
			System.out.print("*");
			
			if (i == a) System.out.println("*");
		}
		
		// lado derecho
		for (int c = 1; c < a-1; c++) {
			System.out.print("*");
			
			for (int f = 2; f <= a-1; f++) {
				System.out.print(" ");
				if (f == (a-1)) System.out.println("*");
			}
			
		}
		// abajo
		for (int d = 0; d < a; d++) {
			System.out.print("*");
		}
		
		System.out.println("");
		
		regresar.inicio();
	}
	
	public void programa15(){
		System.out.println("Nivel 2");
		System.out.println("Programa 15");
		System.out.println(" ");

		int a=0, contador=0, contador2=0, i=0, f=0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese El Limite Superior");
		a = entrada.nextInt();//tope del numero
		
		for ( i = 2; i <= a; i++) {
			
			
			for ( f=1; f<=i; f++){
				System.out.println(i +" / "+f+" "+(i%f));
				
					if ( i % f == 0){ 
						contador = contador +1;
						//a=a+1;
					}
		
					}
			
			if (contador<=2){
				//System.out.println("Si primo");
				contador2 = contador2 + 1;
				contador=0;
				}		
			
				contador=0;
		}
		
		System.out.println("El Número Ingresado Es: "+ a );
		System.out.println("La Cantidad De Números Primos Debajo De Ese Número Es: "+contador2);

		regresar.inicio();
	}
}
