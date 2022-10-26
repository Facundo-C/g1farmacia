package com.uwugang.g1farmacia.controllers;

import com.uwugang.g1farmacia.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

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
