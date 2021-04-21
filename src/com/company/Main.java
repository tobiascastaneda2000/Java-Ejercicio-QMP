package com.company;



/**Buenas,  hice el codigo en java para practicar**/

public class Main {


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
        String categoria;
        String tela;
        String color;
        String colorSecundario;



        String getCategoria(){ /**Usando Intellij, no me aparece las funciones de color amarillo, sino trasparente ¿Que significa?*/
            return this.categoria;
        }

        void setColor(String color){
            this.color = color;

        }

        void setColorSecundario(String colorSecundario){
            this.colorSecundario = colorSecundario;
        }

        void setTela(String tela){
            this.tela = tela;
        }




        void validar(Usuario usuario){



            if(tipoPrenda == null || categoria == null || tela == null || color == null){
                throw new Error("faltan datos");
            }
            if(!tipoPrenda.coincideCon(categoria)){
                throw new Error("la categoria de la prenda no coincide con su tipo");

            }/**Es la unica forma que se me ocurrio para hacer andar los errores*/

            else {
                usuario.aniadir(this);

            }
        }

    }



    class TipoPrenda{

        String categoria;

        boolean coincideCon(String unaCategoria){
            return categoria == unaCategoria;
        }

    }


}

/***/