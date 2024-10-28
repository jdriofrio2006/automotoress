public class automovil {
    //atributos
    String marca;
    String modelo;
    String color="verde";
    double cilindraje;


    //crear metodos el this sirve para tomar informacion de la clase u objetos

    public String detalleauto(){
        String color = "Gris";
        System.out.println("marca = " + this.marca);
        System.out.println("modelo = " + this.modelo);
        System.out.println("color = " + color);
        System.out.println("cilindraje = " + this.cilindraje);

        return "Hola mundo";

    }

}
