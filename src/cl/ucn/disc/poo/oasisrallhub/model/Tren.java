/*
 * Copyright (c) 2023-2024. Departamento de Ingenieria de Sistemas y Computacion
 */
package cl.ucn.disc.poo.oasisrallhub.model;
/**
 * La clase Tren-
 *
 * @author Gimena zavaleta-loayza.
 */
public class Tren {
    /** Id del Tren. */
    private String identificador;
    /** Ruta. */
    private String ruta;
    /** Precio. */
    private int precio;
    /** Descripcion del tren. */
    private String descripcion;
    /** Funcionamiento del tren. */
    private boolean funcionamiento;
    /**
     * Constructor del Tren
     *
     * @param identificador
     * @param ruta
     * @param precio
     * @param descripcion
     * @param funcionamiento
     */
    public Tren(String identificador, String ruta, int precio, String descripcion, boolean funcionamiento) {
        //validaciones
        if (identificador == null || identificador.length() != 4 ){
            throw new IllegalArgumentException("El identificador no puede ser nulo y debe tener 4 caracteres");
        }
        if(ruta == null || !(ruta.equals("A")|| ruta.equals("B") || ruta.equals("C") || ruta.equals("D"))) {
            throw new IllegalArgumentException("La ruta no puede ser nula y solo puede ser A,B,C y D");
        }
        if(precio == 0 || precio > 10000){
            throw new IllegalArgumentException("el precio no puede ser nulo y tiene que ser menor a 10000");
        }
        if(descripcion == null){
            throw new IllegalArgumentException("Tiene que tener una descripcion.");
        }

        // asignacion
        this.identificador = identificador;
        this.ruta = ruta;
        this.precio = precio;
        this.descripcion = descripcion;
        this.funcionamiento = funcionamiento;
    }
    /**
     * @return el identificador.
     */
    public String getIdentificador() {
        return identificador;
    }
    /**
     * Agrega el identificador.
     *
     * @param identificador a agregar.
     */
    public void setIdentificador(String identificador) {
        if (identificador == null || identificador.length() != 4 ){
            throw new IllegalArgumentException("El identificador no puede ser nulo y debe tener 4 caracteres");
        }
        this.identificador = identificador;
    }
    /**
     * @return la ruta.
     */
    public String getRuta() {
        return ruta;
    }
    /**
     * Agrega la ruta.
     *
     * @param ruta a agregar.
     */
    public void setRuta(String ruta) {
        if(ruta == null || !(ruta.equals("A")|| ruta.equals("B") || ruta.equals("C") || ruta.equals("D"))) {
            throw new IllegalArgumentException("La ruta no puede ser nula y solo puede ser A,B,C y D");
        }
        this.ruta = ruta;
    }
    /**
     * @return el precio.
     */
    public int getPrecio() {
        return precio;
    }
    /**
     * Agrega el precio.
     *
     * @param precio a agregar.
     */
    public void setPrecio(int precio) {
        if(precio == 0 || precio > 10000){
            throw new IllegalArgumentException("el precio no puede ser nulo y tiene que ser menor a 10000");
        }
        this.precio = precio;
    }
    /**
     * @return la desccripcion.
     */
    public String getDescripcion() {
        return descripcion;
    }
    /**
     * Agrega la descripcion.
     *
     * @param descripcion a agregar.
     */
    public void setDescripcion(String descripcion) {
        if(descripcion == null){
            throw new IllegalArgumentException("Tiene que tener una descripcion.");
        }
        this.descripcion = descripcion;
    }
    /**
     * @return el duncionamiento.
     */
    public boolean isFuncionamiento() {
        return funcionamiento;
    }
    /**
     * Agrega el funcionamiento.
     *
     * @param funcionamiento a agregar.
     */
    public void setFuncionamiento(boolean funcionamiento) {
        this.funcionamiento = funcionamiento;
    }
}
