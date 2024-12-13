
package actividad_02_ud3_ed;

/**
 * 
 * @author Ana
 */
public class CCuenta {


     
  protected String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

  
    public CCuenta ()
    {
    }

   /**
    * Cuenta corriente de usuarios.
    * @param nom Nombre del titular de la cuenta.
    * @param cue Tipo de cuenta.
    * @param sal Saldo de la cuenta.
    * @param tipo Tipo de interés.
    */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
        tipoInterés=tipo;
    }
  /**
   * Funcion vacia que asigna a la variable nombre una cadena de caracteres.
   * @param nom cadena de caracteres que compone el nombre.
   */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
   
    /**
     * Función nombre de un usuario.
     * @return el nombre de un usuario.
     */
    public String obtenerNombre()
    {
        return nombre;
    }

    /**
     * Función estado de la cuenta.
     * @return el saldo disponible de la cuenta.
     */
     public double estado ()
    {
        return saldo;
    }

    /**
     * Función vacía de ingresos de saldo.
     * @param cantidad será la cuantía del ingreso.
     * @throws Exception cuando la cuantía a ingresar sea negativa.
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");}
        setSaldo(saldo + cantidad);
    }

   /**
    * Función vacia de retiradas de saldo.
    * @param cantidad será la cuantía de la retirada.
    * @throws Exception cuando la cantidad a retirar sea negativo o no haya 
    * suficiente saldo.
    */
    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");}
        if (estado()< cantidad){
            throw new Exception ("No se hay suficiente saldo");}
        setSaldo(saldo - cantidad);
    }
    
    /**
     * Función para obtener el tipo de cuenta.
     * @return el tipo de cuenta.
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

  /**
   * Funcion para seleccionar cuenta.
   * @param cuenta es la cuenta que se está usando actualmente.
   */
  public void setCuenta(String cuenta) {
    this.cuenta = cuenta;
  }

  /**
   * Funcion para ver el saldo.
   * @param saldo es el saldo actual de la cuenta.
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

 /**
  * Función para ver el tipo de interés.
  * @return El tipo de interés actual asignado a la cuenta.
  */
  public double getTipoInterés() {
    return tipoInterés;
  }

  /**
   * Función para escoger el tipo de interés.
   * @param tipoInterés Será el tipo de interés actual de la cuenta.
   */
  public void setTipoInterés(double tipoInterés) {
    this.tipoInterés = tipoInterés;
  }
}
