/*
 * Copyright (c) 2023-2024. Departamento de Ingenieria de Sistemas y Computacion
 */
package cl.ucn.disc.poo.oasisrallhub.service;

import cl.ucn.disc.poo.oasisrallhub.model.Trabajador;
import cl.ucn.disc.poo.oasisrallhub.model.Tren;
import java.util.HashSet;
import java.util.Set;
/**
 * La clase que implementa la interface Sistema.
 *
 * @author Gimena zavaleta-Loayza.
 */
public class SistemaImpl implements Sistema {

    private Set<Tren> nombreTren;
    private Set<Trabajador> nombreTrabajador;
    private int totalTrenes;
    private int trenesInactivos;
    private int sumaPrecios;
    private int sumaPreciosRutaA;
    private int sumaPreciosRutaB;
    private int sumaPreciosRutaC;
    private int sumaPreciosRutaD;

    public SistemaImpl() {
        this.nombreTren = new HashSet<>();
        this.nombreTrabajador = new HashSet<>();
        this.totalTrenes = 0;
        this.trenesInactivos = 0;
        this.sumaPrecios = 0;
        this.sumaPreciosRutaA = 0;
        this.sumaPreciosRutaB = 0;
        this.sumaPreciosRutaC = 0;
        this.sumaPreciosRutaD = 0;
    }

    @Override
    public void agregarTren(Tren trenes) {
        //
        if(trenes == null){
            throw new IllegalArgumentException("No se permite un tren vacio");
        }

        for (Tren tn : this.nombreTren){
            if(tn.getIdentificador().equals(trenes.getIdentificador())){
                throw new IllegalArgumentException("Tren ya existe!");
            }
        }
        this.nombreTren.add(trenes);
        this.totalTrenes++;
        this.sumaPrecios += trenes.getPrecio();

        switch (trenes.getRuta()){
            case "A":
                this.sumaPreciosRutaA += trenes.getPrecio();
                break;
            case "B":
                this.sumaPreciosRutaB += trenes.getPrecio();
                break;
            case "C":
                this.sumaPreciosRutaC += trenes.getPrecio();
                break;
            case "D":
                this.sumaPreciosRutaD += trenes.getPrecio();
                break;
        }
        if(!trenes.isFuncionamiento()){
            this.trenesInactivos++;
        }
        System.out.println("Tren registrado correctamente");
    }

    @Override
    public void agregarTrabajador(Trabajador trabajadores) {

        if(trabajadores == null){
            throw new IllegalArgumentException("No se puede agregar un trabajador vacio");
        }
        this.nombreTrabajador.add(trabajadores);
        System.out.println("Trabajador registrado correctamente");
    }
    public void actualizarFuncionamiento(String identificador, boolean funcionamiento){
        Tren tren = null;
        for (Tren tn : nombreTren){
            if(tn.getIdentificador().equals(identificador)){
                tren = tn;
            }
        }
        if(tren == null){
            throw new IllegalArgumentException("No se permite un tren vacio");
        }
        if(tren.isFuncionamiento() && !funcionamiento){
            trenesInactivos++;
        }else if(!tren.isFuncionamiento() && funcionamiento){
            trenesInactivos--;
        }
        tren.setFuncionamiento(funcionamiento);
        System.out.println("actualizacion realida correctamente");
    }

    public void porcentageTrenesInactivos() {
        if (totalTrenes == 0) {
            System.out.println("No hay trenes registrados");
            return;
        }
        double porcentge = (double) trenesInactivos / totalTrenes * 100;
        System.out.println("Porcentage de trenes inactivos: " + porcentge + "%");

    }

    public void promedioPrecioTotal(){
        if(totalTrenes == 0){
            System.out.println("No hay trenes registrados");
        }

        double promedio =(double) sumaPrecios / totalTrenes;
        System.out.println("Promedio del precio total de los trenes es de " + promedio);

    }
    public void sumaPreciosRuta(){
        System.out.println("Suma de precios por ruta");
        System.out.println("Ruta A: "+ sumaPreciosRutaA);
        System.out.println("Ruta B: "+ sumaPreciosRutaB);
        System.out.println("Ruta C: "+ sumaPreciosRutaC);
        System.out.println("Ruta D: "+ sumaPreciosRutaD);



    }
}
