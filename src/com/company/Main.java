package com.company;



/**Buenas,  hice el codigo en java para practicar**/

/**
 * Quize cambiar mi codigo a uno menos fragil, pero no supe como continuar
class Atuendo{

    Prenda parteSuperior;
    Prenda parteInferior;
    Prenda calzado;
    Prenda accesorios;

    void cargarPrenda(Prenda prenda, Categoria categoria) {

        if (!prenda.tieneTodosLosDatos()) {
            throw new Error("faltan datos");

        }
        if (!prenda.combinacionValida(categoria)) {
            throw new Error("la categoria de la prenda no coincide con su tipo");
        } else {
            this.aniadirEnCategoria(prenda, categoria)
        }
    }


        void aniadirEnCategoria(Prenda prenda,Categoria PARTESUPERIOR){  this.parteSuperior = prenda;
        }

         void aniadirEnCategoria(Prenda prenda,Categoria PARTEINFERIOR) {

         }

}
 */
     class Usuario  {
        Prenda[] atuendo ;


        void cargarPrenda(Prenda prenda) {
            prenda.validar(this);


        }

        void aniadir(Prenda prenda){/**Error cannot find symbol add (este se usaba en wollok para
                                     agregar elementos en la listas)*/
            atuendo.add(prenda);
        }

    }




    class Prenda{
        TipoPrenda tipoPrenda;
        Categoria categoria;
        Tela tela;
        Color color;
        Color colorSecundario;



        Categoria getCategoria(){
            return this.categoria;
        }

        void setColor(Color color){
            this.color = color;

        }

        void setColorSecundario(Color colorSecundario){
            this.colorSecundario = colorSecundario;
        }

        void setTela(Tela tela){
            this.tela = tela;
        }




        void validar(Usuario usuario){



            if(tipoPrenda == null || categoria == null || tela == null || color == null){
                throw new Error("faltan datos");
            }
            if(!tipoPrenda.coincideCon(categoria)){
                throw new Error("la categoria de la prenda no coincide con su tipo");

            }

            else {
                usuario.aniadir(this);

            }
        }

    }



        class TipoPrenda{

        Categoria categoria;

        boolean coincideCon(Categoria unaCategoria){
            return categoria == unaCategoria;
        }

    }


enum Categoria{
        PARTESUPERIOR,
        PARTEINFERIOR,
        CALZADO,
        ACCESORIOS
}
 enum Color{
        AZUL,
        AMARILLO,
        ROJO,
        VERDE,
        NARANJA,
        VIOLETA
 }
/**Se puede ir añadiendo mas colores*/

enum Tela{
         LINO,
         LANA
}
/**Se puede ir añadiendo mas telas*/