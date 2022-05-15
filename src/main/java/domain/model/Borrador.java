package src.main.java.domain.model;

public class Borrador {
  private Tipo tipo;
  private Material material;
  private Color colorPrimario;
  private Color colorSecundario;

  public Borrador(Tipo tipo) {
    this.tipo = tipo;
  }

  Borrador definirMaterial(Material material) {
    this.material = material;
    return this;
  }

  Borrador definirColorPrimario(Color color) {
    this.colorPrimario = color;
    return this;
  }

  Borrador definirColorSecundario(Color color) {
    this.colorSecundario = color;
    return this;
  }

  Prenda generarPrenda() {
    return new Prenda(this.tipo, this.material, this.colorPrimario, this.colorSecundario);
  }
}
