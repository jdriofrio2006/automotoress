public class Main {
    public static void main(String[] args) {
        automovil bmw = new automovil();
        bmw.marca="BMW";
        bmw.modelo="i320";
        bmw.color="Negro";
        bmw.cilindraje=3200;

        //se necesita instaciar
        System.out.println(bmw.detalleauto());
        System.out.println();


        automovil mb = new automovil();
        mb.marca="Mercedes Benz";
        mb.modelo="ML25";
        mb.color="Blanco";
        mb.cilindraje=2500;

        mb.detalleauto();






    }
}