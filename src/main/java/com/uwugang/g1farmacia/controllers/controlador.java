package com.uwugang.g1farmacia.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.uwugang.g1farmacia.services.ServicioArticulo;
import com.uwugang.g1farmacia.services.ServicioCarrito;
import com.uwugang.g1farmacia.services.ServicioCategoria;
import com.uwugang.g1farmacia.services.ServicioMarca;
import com.uwugang.g1farmacia.services.ServicioPedido;

@Controller
public class controlador {
	@Autowired
	private ServicioArticulo svcArticulo;
	@Autowired
	private ServicioCarrito svcCarrito;
	@Autowired
	private ServicioCategoria svcCategoria;
	@Autowired
	private ServicioMarca svcMarca;
	@Autowired
	private ServicioPedido svcPedido;
	
}
