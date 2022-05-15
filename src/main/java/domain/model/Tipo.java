package src.main.java.domain.model;

import src.main.java.domain.excepciones.CategoriaInvalidaException;

public class Tipo {
  Categoria categoria;

  public Tipo(Categoria categoria) {
    if(categoria == null){
      throw new CategoriaInvalidaException("Categoria Invalida");
    }
    this.categoria = categoria;
  }

  public Categoria getCategoria() {
    return categoria;
  }
}
