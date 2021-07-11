import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//declarams objeto
		CuentaBancaria cuenta_personal = new CuentaBancaria();
		/*
		 * Menu cajero
		 * 1. retiro
		 * 2. deposito
		 * 3. imprimir saldo
		 * 4. estado de cuenta
		 * 5. agregar beneficiario
		 * 6. salir
		 * */
			
		int opcion = 0;
		
		do {
			
	
		Scanner leer = new Scanner(System.in);
		
		System.out.println("menu cuenta bancaria");
		System.out.println("ingresar la opcion desceada");
		System.out.println("1. retiro");
		System.out.println("2. deposito");
		System.out.println("3. imprimir saldo");
		System.out.println("4. estado de cuenta");
		System.out.println("5. agregar beneficiario");
		System.out.println("6. salir ");
		
		opcion=leer.nextInt();
		
		switch(opcion) {
		case 1:
			System.out.println("ingrese la cantidad que descea retirar");
			float monto = leer.nextFloat();
			cuenta_personal.retiros(monto);
			System.out.println("*********************");
			break;
		case 2:
			System.out.println("ingresa la cantidad que descea depositar");
			float deposito= leer.nextFloat();
			cuenta_personal.depositos(deposito);
			System.out.println("*********************");
			break;
		case 3:
			System.out.println("el monto total de su saldo es : " +cuenta_personal.consultarSaldo());
			System.out.println("*********************");
		case 5:
			System.out.println("ingrese el nombre del beneficiario");
			String nombre =leer.next();
			cuenta_personal.beneficiario=nombre;
			break;
		}
		
	} while (opcion != 6);
		
		/*
		cuenta_personal.beneficiario = "adriana";
		
		System.out.println("ingresa un monto a depositar");
		Scanner leer = new Scanner(System.in);
		float deposito = leer.nextFloat();
		
		System.out.println("ingresa un monto a retirar");
		float retiro= leer.nextFloat();
		
		cuenta_personal.depositos(deposito);
		cuenta_personal.retiros(retiro);
		
		System.out.println("tu saldo actual es: "+ cuenta_personal.consultarSaldo());
		
		System.out.println(cuenta_personal.beneficiario);
		
		CuentaBancaria cuenta_papa = new CuentaBancaria();
		cuenta_papa.beneficiario="ernesto";
		System.out.println(cuenta_papa.beneficiario);
		*/
	}
  
}
