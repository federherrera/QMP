package src.main.java.domain.model;

public class Material {
  String material;
  Trama trama;

  public Material(String material, Trama trama) {
    this.material = material;

    if(trama != null) {
      this.trama = trama;
    }else {
      this.trama = Trama.LISA;
    }
  }

  public String getMaterial() {
    return material;
  }

  public void setMaterial(String material) {
    this.material = material;
  }
}
