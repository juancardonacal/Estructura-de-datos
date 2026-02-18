public class Consecionario {

    public static void main(String[] args) {

        Moto[] motos = new Moto[8];

        // Creacion de los objetos de tipo moto y almacenados en cada posicion del arreglo.
        motos[0] = new Moto(2020, "Yamaha", "Rojo", 150.0, 12000000.0);
        motos[1] = new Moto(2021, "Honda", "Azul", 125.0, 7000000.0);
        motos[2] = new Moto(2019, "Suzuki", "Blanco", 100.0, 4000000.0);
        motos[3] = new Moto(2022, "Kawasaki", "Verde", 250.0, 12000000.0);
        motos[4] = new Moto(2015, "Yamaha", "negro", 200.0, 24000000.0);
        motos[5] = new Moto(2025, "boxer", "Azul", 125.0, 5000000.0);
        motos[6] = new Moto(2023, "Suzuki", "Rosa", 125.0, 4000000.0);
        motos[7] = new Moto(2021, "Honda", "Multicolor", 90.0, 2000000.0);

        // Operaciones con los objetos del arreglo.

        System.out.println(motos[0]);

        // Obtener el promedio de los modelos de las motos del array.
        int sumaModelos = 0;
        for (int i = 0; i < motos.length; i++) {
            sumaModelos += motos[i].getModelo();

        }
        System.out.println("El promedio de los modelos de las motos es: " + (sumaModelos / motos.length));

        // Obtener las motos que puedo comprar con un presupuesto de 10000000.0
        String cad = " \n";
        for (int i = 0; i < motos.length; i++) {
            if (motos[i].getPrecio() <= 10000000.0) {
                cad += "- " + motos[i].getMarca() + " " + motos[i].getPrecio() + "\n";
            }
        }
        System.out.println("Con un presupuesto de 10000000.0 puedo comprar las siguientes motos: " + cad);

    }

}
