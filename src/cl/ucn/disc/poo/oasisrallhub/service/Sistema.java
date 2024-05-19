/*
 * Copyright (c) 2023-2024. Departamento de Ingenieria de Sistemas y Computacion
 */
package cl.ucn.disc.poo.oasisrallhub.service;

import cl.ucn.disc.poo.oasisrallhub.model.Trabajador;
import cl.ucn.disc.poo.oasisrallhub.model.Tren;

public interface Sistema {

  void agregarTren(Tren trenes);

  void agregarTrabajador(Trabajador trabajadores);

  void actualizarFuncionamiento(String identificador, boolean funcionamiento);

  void porcentageTrenesInactivos();

  void promedioPrecioTotal();

  void sumaPreciosRuta();
}
