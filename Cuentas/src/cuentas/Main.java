package cuentas;

/**
 * Clase Main que ejecuta la operativa de la aplicación bancaria.
 * 
 * @author Natalia Castelló Noguera
 * @version 0.1
 */
public class Main {
    /**
     * Método principal que ejecuta la operativa.
     * 
     * @param args Argumentos de la linea de comandos.
     */
    public static void main(String[] args) {
        
        CCuenta cuenta1;
        double saldoActual;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es: "+ saldoActual);
        operativa_cuenta(cuenta1,500);
    }
    /**
     * Método que realiza las operaciones básicas sobre la cuenta.
     * 
     * @param cuenta1 Cuenta sobre la que se realizará la operación.
     * @param cantidad Cantidad a retirtar o ingresar.
     * @return La cantidad resultante de la operación.
     */
    public static float operativa_cuenta(CCuenta cuenta1, float cantidad){
        try {
            cuenta1.retirar(2300);
        }
        catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        }
        catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
        return cantidad;
    }
}