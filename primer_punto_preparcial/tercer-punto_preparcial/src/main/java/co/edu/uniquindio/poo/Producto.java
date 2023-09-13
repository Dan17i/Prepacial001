package co.edu.uniquindio.poo;

import java.time.LocalDate;

import main.java.co.edu.uniquindio.poo.Marca;
import main.java.co.edu.uniquindio.poo.Tipoproducto;

public record Producto(String nombre, LocalDate fechaDevencimiento, float precio, Marca marca, Tipoproducto tipoPrducto) {
 
    }

