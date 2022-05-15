package src.main.java.domain.model;

public abstract class Sastre {

  protected abstract Prenda fabricarParteSuperior();
  protected abstract Prenda fabricarParteInferior();
  protected abstract Prenda fabricarCalzado();

  Uniforme generarInforme(){
    return (new Uniforme(this.fabricarParteSuperior(),this.fabricarParteInferior(),this.fabricarCalzado()));
  }

}
