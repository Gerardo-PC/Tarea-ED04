package cuentas;

/**
 * Clase CCuenta, empleada para gestión de cuentas en la práctica 04 de ED - DAW IES San Clemente
 * @author Gerardo Portugués Concepción fpd4861@edu.xunta.gal
 */
public class CCuenta {

    /**
     * Devuelve el nombre de la cuenta
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Actualiza el nombre de la cuenta
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve la cuenta
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Actualiza la cuenta
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo de la cuenta
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Actualiza el saldo de la cuenta
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipo de interés aplicado
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Actualiza el tipo de interés aplicado
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor, vacío
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con parámetros
     * @param nom nombre de la cuenta
     * @param cue datos de la cuenta
     * @param sal saldo de la cuenta
     * @param tipo tipo de interés aplicado
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * Devuelve el saldo de la cuenta (estado)
     * @return Saldo actual de la cuenta
     */
    public double estado()
    {
        return saldo;
    }

    /**
     * Ingresa la cantidad indicada en la cuenta
     * @param cantidad Cantidad a ingresar
     * @throws Exception Excepción si se intenta ingresar cantidades negativas.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    /**
     * Retira la cantidad indicada de la cuenta
     * @param cantidad a retirar de la cuenta
     * @throws Exception Excepción si se intenta retirar una cantidad negativa o no queda saldo.
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
