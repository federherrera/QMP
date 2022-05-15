package src.main.java.domain.model;

public class SanJuanSastre extends Sastre{

  // todo a todo

  @Override
  protected Prenda fabricarParteSuperior() {

    Tipo chomba = new Tipo(Categoria.PARTE_SUPERIOR);

    Borrador borrador = new Borrador(chomba);
   // borrador.definirColorPrimario();
   // borrador.definirColorSecundario();
   // borrador.definirMaterial();

    return null;
  }

  @Override
  protected Prenda fabricarParteInferior() {
    return null;
  }

  @Override
  protected Prenda fabricarCalzado() {
    return null;
  }
}
