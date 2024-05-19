/*
 * Copyright (c) 2023-2024. Departamento de Ingenieria de Sistemas y Computacion
 */
package cl.ucn.disc.poo.oasisrallhub.model;
/**
 * La clase Trabajdor
 *
 * @author Gimena zavaleta-loayza.
 */
public class Trabajador {
    /** Nombre del Trabajador. */
    private String nombre;
    /** Apellido del Trabajor. */
    private String apellido;
    /** Cargo del Treabajador. */
    private String cargo;
    /** Salario del Trabajador. */
    private int salario;
    /** Experiencia del Trabajador. */
    private int experiencia;
    /**
     * Constructor del Tren
     *
     * @param nombre
     * @param apellido
     * @param cargo
     * @param salario
     * @param experiencia
     */
    public Trabajador(String nombre,String apellido, String cargo, int salario, int experiencia) {

        // validaciones
        if(nombre == null ){
            throw new IllegalArgumentException("El nombre no pude estar vacio");
        }
        if(apellido == null){
            throw new IllegalArgumentException("El apellido no puede estar vacio");
        }
        if(!(cargo.equals("Conductor") || cargo.equals("Personal de serivicio") || cargo.equals("Guardafreno") || cargo.equals("Jefe de tren"))){
            throw new IllegalArgumentException("El cargo no puede ser nulo y tiene que se Conductor, Personal de servicio, Guardafreno o Jefe de tren.");
        }
        if(salario <= 0 ){
            throw new IllegalArgumentException("El salario tiene que ser un numero positivo y mayor que cero");
        }
        if(experiencia < 0){
            throw new IllegalArgumentException("Los años de experiencia no puede ser negativo");
        }

        // asignacion
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.salario = salario;
        this.experiencia = experiencia;
    }
    /**
     * @return el nombre.
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Agrega el nombre.
     *
     * @param nombre a agregar.
     */
    public void setNombre(String nombre) {
        if(nombre == null ){
            throw new IllegalArgumentException("El nombre no pude estar vacio");
        }
        this.nombre = nombre;
    }
    /**
     * @return el apellido.
     */
    public String getApellido() {
        return apellido;
    }
    /**
     * Agrega el apellido.
     *
     * @param apellido a agregar.
     */
    public void setApellido(String apellido) {
        if(apellido == null){
            throw new IllegalArgumentException("El apellido no puede estar vacio");
        }
        this.apellido = apellido;
    }
    /**
     * @return el cargo.
     */
    public String getCargo() {
        return cargo;
    }
    /**
     * Agrega el cargo.
     *
     * @param cargo a agregar.
     */
    public void setCargo(String cargo) {
        if(!(cargo.equals("Conductor") || cargo.equals("Personal de serivicio") || cargo.equals("Guardafreno") || cargo.equals("Jefe de tren"))){
            throw new IllegalArgumentException("El cargo no puede ser nulo y tiene que se Conductor, Personal de servicio, Guardafreno o Jefe de tren.");
        }
        this.cargo = cargo;
    }
    /**
     * @return el salario.
     */
    public int getSalario() {
        return salario;
    }
    /**
     * Agrega el salario.
     *
     * @param salario a agregar.
     */
    public void setSalario(int salario) {
        if(salario <= 0 ){
            throw new IllegalArgumentException("El salario tiene que ser un numero positivo y mayor que cero");
        }
        this.salario = salario;
    }
    /**
     * @return la experiencia.
     */
    public int getExperiencia() {
        return experiencia;
    }
    /**
     * Agrega la experiencia.
     *
     * @param experiencia a agregar.
     */
    public void setExperiencia(int experiencia) {
        if(experiencia < 0){
            throw new IllegalArgumentException("Los años de experiencia no puede ser negativo");
        }
        this.experiencia = experiencia;
    }
}
