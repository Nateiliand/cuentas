package cuentas;

/**
 * Clase que define una cuenta corriente, con su nombre, número de cuenta,
 * saldo y tipo de interés.
 * Permite ingresar y retirar dinero, y consultar el saldo actual.
 * @author Natalia Castelló Noguera.
 */
public class CCuenta {
    /**Nombre del titular de la cuenta*/
    private String nombre;
    /**Número de cuenta*/
    private String cuenta;
    /**Saldo inicial de la cuenta*/
    private double saldo;
    /**Tipo de interés de la cuenta*/
    private double tipoInteres;

    /**
     * Constructor vacío para crear una cuenta sin especificar sus atributos.
     */
    public CCuenta() {
    }
    /**
     * Contructor para crear una cuenta con los atributos especificados:
     * 
     * @param nom Nombre del titular de la cuenta.
     * @param cue Número de cuenta.
     * @param sal Saldo inicial de la cuenta.
     * @param tipo Tipo de interés de la cuenta.
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre=nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Permite al titular comprobar el estado de su cuenta.
     * 
     * @return Devuelve la cantidad de saldo actual.
     */
    public double estado() {
        return saldo;
    }
    /**
     * Permite al titulat ingresar dinero
     * 
     * @param cantidad La cantidad a ingresar.
     * Devuelve la suma de del saldo más la cantidad ingresada.
     * @throws Exception cuando la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    /**
     * Permite al titular retirar dinero
     * 
     * @param cantidad La cantidad a retirar
     * Devuelve la resta del saldo menos la cantidad retirada.
     * @throws Exception cuando la cantidad es negativa
     * o no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    /**
     * Getters que permiten obtener los datos de las variables.
     * @return Devuelve el nombre del titular actual.
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Getters que permiten obtener los datos de las variables.
     * @return Devuelve la cuenta bancaria actual.
     */
    public String getCuenta(){
        return cuenta;
    }
    /**
     * Getters que permiten obtener los datos de las variables.
     * @return Devuelve el saldo actual.
     */
    public double getSaldo(){
        return saldo;
    }
    /**
     * Getters que permiten obtener los datos de las variables.
     * @return Devuelve el tipo de interés.
     */
    public double getTipoInteres(){
        return tipoInteres;
    }
    /**
     * Setters que permiten modificar los valores de las variables.
     * 
     * @param nombre Nuevo nombre de titular
     */
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    /**
     * Setters que permiten modificar los valores de las variables.
     * 
     * @param cuenta Nueva cuenta
     */
    public void setCuenta(String cuenta){
        this.cuenta = cuenta;
    }
    /**
     * Setters que permiten modificar los valores de las variables.
     * @param saldo Nuevo saldo.
     */
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    /**
     * Setters que permiten modificar los valores de las variables.
     * 
     * @param tipoInteres Nuevo tipo de interés.
     */
    public void setTipoInteres(double tipoInteres){
        this.tipoInteres = tipoInteres;
    }
}