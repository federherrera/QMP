package src.main.java.domain.model;

import src.main.java.domain.model.Color;
import src.main.java.domain.model.Material;
import src.main.java.domain.model.Tipo;
import src.main.java.domain.excepciones.PrendaInvalidaException;

public class Prenda {
  private Tipo tipoDePrenda;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;

  public Prenda(Tipo tipoDePrenda, Material material, Color colorPrimario, Color colorSecundario) {

    // Validaciones
    if(tipoDePrenda == null || material == null || colorPrimario == null){
      throw new PrendaInvalidaException("Prenda inválida");
    }
    this.tipoDePrenda = tipoDePrenda;
    this.material = material;
    this.colorPrimario = colorPrimario;
    this.colorSecundario = colorSecundario;
  }
}
