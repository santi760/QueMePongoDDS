public class Prenda {

  TipoDePrenda tipoDePrenda
  Material material
  Color color
  Categoria categoria
  Color color2

  constructor(TipoDePrenda tipoDePrenda,Material material,Color color, Categoria categoria, Color color2) {
    this.tipoDePrenda = requireNonNull(tipo, "tipo de prenda es obligatorio")
    this.material = requireNonNull(material, "material es obligatorio")
    this.color = requireNonNull(color, "color es obligatorio")
    this.categoria = requireNonNull(categoria, "categoria es obligatoria")
    this.color2 = color2
  }

  if (tipoDePrenda == REMERA && categoria != PARTE_SUPERIOR)
          // lanzarUnaExcepcion...
          if (tipoDePrenda == PANTALON && categoria != PARTE_INFERIOR)
  // lanzarUnaExcepcion...

}

class TipoDePrenda {
  constant String REMERA ="remera"
  constant String PANTALON ="pantalon"
  constant String POLLERA ="pollera"
  constant String CAMISA_MANGA_CORTA ="camisa-manga-corta"
  constant String BLUSA ="blusa"

}

class Material {
  constant String JEAN ="jean"
  constant String ALGODON ="algodon"
  constant String TElA = "tela"
}

class Categoria{
  constant String PARTE_SUPERIOR ="parte_superior"
  constant String CALZADO ="calzado"
  constant String PARTE_INFERIOR ="parte_inferior"
  constant String ACCESORIOS ="accesorios"


class Color{
  int  rojo, verde, azul

  constructor (rojo, verde, azul)}


