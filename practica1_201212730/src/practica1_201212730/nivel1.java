package practica1_201212730;
import java.util.Scanner;

public class nivel1 {
	menuPrincipal regresar = new menuPrincipal();

	public void programa1() {
		
		
		System.out.println("Nivel 1");
		System.out.println("Programa 1");
		System.out.println(" ");

		System.out.println("    *");
		System.out.println("   ***");
		System.out.println("  *****");
		System.out.println(" *******");
		System.out.println("*********");
		System.out.println(" *******");
		System.out.println("  *****");
		System.out.println("   ***");
		System.out.println("    *");
		//menuPrincipal inicio = new menuPrincipal();
		//inicio.main(null);
		regresar.inicio();
	}
	
	public void programa2(){
		System.out.println("Nivel 1");
		System.out.println("Programa 2");
		System.out.println(" ");
		int a, b, c, d, e, f;
		double resultado=0;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese 6 Número Enteros Del 0 Al 100");
		System.out.println("Ingrese El Primer Número");
		a= entrada.nextInt();
		System.out.println("Ingrese El Segundo Número");
		b= entrada.nextInt();
		System.out.println("Ingrese El Tercer Número");
		c= entrada.nextInt();
		System.out.println("Ingrese El Cuarto Número");
		d= entrada.nextInt();
		System.out.println("Ingrese El Quinto Número");
		e= entrada.nextInt();
		System.out.println("Ingrese El Sexto Número");
		f= entrada.nextInt();
		System.out.println("");
		
		resultado= (a+b+c+d+e+f)/6;
		System.out.println("La Media es: "+resultado);
		
		if (resultado>=90 & resultado<=100) System.out.println("Puntuacion: "+resultado+" "+"Es Una Puntuación A");
		if (resultado>=80 & resultado<=89) System.out.println("Puntuacion: "+resultado+" "+"Es Una Puntuación B");
		if (resultado>=70 & resultado<=79) System.out.println("Puntuacion: "+resultado+" "+"Es Una Puntuación C");
		if (resultado>=60 & resultado<=69) System.out.println("Puntuacion: "+resultado+" "+"Es Una Puntuación D");
		if (resultado<=59) System.out.println("Puntuacion: "+resultado+" "+"Es Una Puntuación E");
		
		regresar.inicio();		
	}
	
	public void programa3(){
		System.out.println("Nivel 1");
		System.out.println("Programa 3");
		System.out.println(" ");
		
		String hora="", dia="";
		char uno=' ', dos=' ';
		boolean bandera=true;
		int a;
		Scanner entrada = new Scanner(System.in);
		
		do{
		System.out.println("Ingrese La Hora Desea en Formato de 24hrs");
		System.out.println("DEBE DE CONTENER 5 CARACTERES CON ESTE FORMATO 15:02");
		hora= entrada.next();
		a= hora.length();
		if (a!=5 || hora.charAt(2)!=':' || (hora.charAt(0)!='0' & hora.charAt(0)!='1' & hora.charAt(0)!='2')){bandera=true; System.out.println("Error en hora, vuelta a intentarlo");}
		else{bandera=false;}
		
		}
		while(bandera);
		
		if (hora.charAt(0)=='0' & hora.charAt(1)=='0'){uno='1'; dos='2'; dia="AM";}
		if (hora.charAt(0)=='0' & hora.charAt(1)=='1'){uno='0'; dos='1'; dia="AM";}
		if (hora.charAt(0)=='0' & hora.charAt(1)=='2'){uno='0'; dos='2'; dia="AM";}
		if (hora.charAt(0)=='0' & hora.charAt(1)=='3'){uno='0'; dos='3'; dia="AM";}
		if (hora.charAt(0)=='0' & hora.charAt(1)=='4'){uno='0'; dos='4'; dia="AM";}
		if (hora.charAt(0)=='0' & hora.charAt(1)=='5'){uno='0'; dos='5'; dia="AM";}
		if (hora.charAt(0)=='0' & hora.charAt(1)=='6'){uno='0'; dos='6'; dia="AM";}
		if (hora.charAt(0)=='0' & hora.charAt(1)=='7'){uno='0'; dos='7'; dia="AM";}
		if (hora.charAt(0)=='0' & hora.charAt(1)=='8'){uno='0'; dos='8'; dia="AM";}
		if (hora.charAt(0)=='0' & hora.charAt(1)=='9'){uno='0'; dos='9'; dia="AM";}
		if (hora.charAt(0)=='1' & hora.charAt(1)=='0'){uno='1'; dos='0'; dia="AM";}
		if (hora.charAt(0)=='1' & hora.charAt(1)=='1'){uno='1'; dos='1'; dia="AM";}
		if (hora.charAt(0)=='1' & hora.charAt(1)=='2'){uno='1'; dos='2'; dia="PM";}
		if (hora.charAt(0)=='1' & hora.charAt(1)=='3'){uno='0'; dos='1'; dia="PM";}
		if (hora.charAt(0)=='1' & hora.charAt(1)=='4'){uno='0'; dos='2'; dia="PM";}
		if (hora.charAt(0)=='1' & hora.charAt(1)=='5'){uno='0'; dos='3'; dia="PM";}
		if (hora.charAt(0)=='1' & hora.charAt(1)=='6'){uno='0'; dos='4'; dia="PM";}
		if (hora.charAt(0)=='1' & hora.charAt(1)=='7'){uno='0'; dos='5'; dia="PM";}
		if (hora.charAt(0)=='1' & hora.charAt(1)=='8'){uno='0'; dos='6'; dia="PM";}
		if (hora.charAt(0)=='1' & hora.charAt(1)=='9'){uno='0'; dos='7'; dia="PM";}
		if (hora.charAt(0)=='2' & hora.charAt(1)=='0'){uno='0'; dos='8'; dia="PM";}
		if (hora.charAt(0)=='2' & hora.charAt(1)=='1'){uno='0'; dos='9'; dia="PM";}
		if (hora.charAt(0)=='2' & hora.charAt(1)=='2'){uno='1'; dos='0'; dia="PM";}
		if (hora.charAt(0)=='2' & hora.charAt(1)=='3'){uno='1'; dos='1'; dia="PM";}

		System.out.println("La Hora Es: "+uno+dos+hora.charAt(2)+hora.charAt(3)+hora.charAt(4)+dia);	
		regresar.inicio();		
	}

	public void programa4(){
		System.out.println("Nivel 1");
		System.out.println("Programa 4");
		System.out.println(" ");
		
		char x;
		double a;
		boolean bandera=true;
		Scanner entrada = new Scanner(System.in);
		
		do{
			System.out.println("Ingrese La Letra De La Operación Deseada");
			System.out.println("C = Calcula Área, Perímetro y Radio De Un Círculo");
			System.out.println("U = Calcula Área y Perímetro De Un Cuadrado");
			System.out.println("T = Calcula Área, Perímetro y Altura De Un Triángulo Equilatero");
			System.out.println("");
			x = entrada.next().charAt(0);
			if (x=='c' || x=='C') bandera= false;
			if (x=='u' || x=='U') bandera= false;
			if (x=='t' || x=='T') bandera= false;
		}
		while(bandera);
		

		
		if (x=='C'||x=='c'){
			System.out.println("Ingrese El Valor De X, Es Diámetro Del Círculo");
			a= entrada.nextDouble();
			System.out.println ("Área Del Circulo: "+((3.141592654)*(a/2)*(a/2))+" Perímetro: "+(2*3.141592*(a/2))+" Radio: "+(a/2)+x);
		}
		
		if (x=='u' || x=='U'){
			System.out.println("Ingrese El Valor De X, Es Un Lado Del Cuadrado ");
			a= entrada.nextDouble();
			System.out.println ("Área: "+(a*a)+" Perímetro: "+(4*a));
		}
		
		if (x=='t' || x=='T'){
			double b=0;
			System.out.println("Ingrese El Valor De X, Es La Base Del Triángulo ");
			a= entrada.nextDouble();
			b=(Math.sqrt((a*a)-((a/2)*(a/2))));
			System.out.println ("Área: "+((a*b)/2)+" Perímetro: "+(3*a)+" Altura: "+(b));
		}
		
		regresar.inicio();
	}
	
	public void programa5(){
		System.out.println("Nivel 1");
		System.out.println("Programa 5");
		System.out.println(" ");
		
		int dia1=0, mes1=0, ano1=0, dia2=0, mes2=0, ano2=0, final1=0, final2=0, contador=0;
		boolean bandera1= true, bandera2=true;
		Scanner entrada = new Scanner(System.in);
		
		do{
		System.out.println("Ingrese La Primera Fecha: ");
		System.out.println("Ingrese El Día: ");
		dia1=entrada.nextInt();
		System.out.println("Ingrese El Mes: ");
		mes1=entrada.nextInt();
		System.out.println("Ingrese El Año: ");
		ano1=entrada.nextInt();
		System.out.println("");
		if (dia1<1 || dia1>30 || mes1<1 || mes1>12){bandera1 = true; System.out.println("ERROR EN FORMATO DE FECHA: ");}else{ bandera1 = false;}
		}
		while(bandera1);
		
		do{
		System.out.println("Ingrese La Segunda Fecha: ");
		System.out.println("Ingrese El Día: ");
		dia2=entrada.nextInt();
		System.out.println("Ingrese El Mes: ");
		mes2=entrada.nextInt();
		System.out.println("Ingrese El Año: ");		
		ano2=entrada.nextInt();
		if (dia2<1 || dia2>30 || mes2<1 || mes2>12){bandera2 = true; System.out.println("ERROR EN FORMATO DE FECHA: ");}else{ bandera2 = false;}
		}
		while(bandera2);
		
		final1= (30 * mes1) - dia1;
		final2= (30 * mes2) - dia2;
		
		contador= final2-final1;
		System.out.println("La Fecha 1 es: "+dia1+"/"+mes1+"/"+ano1+" La Segunda Fecha es: "+dia2+"/"+mes2+"/"+ano2);		
		System.out.println("Los Dias De Diferencia Entre Las Fechas Son: "+ contador+" Dias");
		System.out.println("");
		
		regresar.inicio();
	}
	
}
