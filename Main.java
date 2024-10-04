
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prendas[] prendas = {
            new Prendas("Blusa", "Jorge", null, 100),
            new Prendas("Falda", "Pepe", null, 150.67),
            new Prendas("Camisa", "Toño", null, 230),
            new Prendas("Playera", "Josue", null, 200),
            new Prendas("Chamarra", "Hector", null, 340),
            new Prendas("Cinturón", "Victor", null, 80),
            new Prendas("Gorros", "Paco", null, 45),
            new Prendas("Sudaderas", "Wilson", null, 350),
            new Prendas("Calzones", "Elian", null, 30),
            new Prendas("Corbatas", "Joshua", null, 50),
        };

        boolean salirmenu = true;
        do {
            //Menú de funcionalidades
            System.out.println("| Bienvenido a Boutique Elegance |" + "\n");
            boolean saliropcs = true;
            do {
                System.out.println("¿Que desea realizar? Ingrese el número segun corresponda: " + "\n" +
                                    "1.- Visualizar estantes por año de colección." + "\n" +
                                    "2.- Buscar prenda por diseñador" + "\n" +
                                    "3.- Valor total actual de las prendas" + "\n" +
                                    "4.- Registrar nueva prenda" + "\n");
                int opc = sc.nextInt();
                sc.nextLine();
                switch (opc) {

                    //ordenar ascendentemente por anio de coleccion
                    case 1:
                        break;

                    //busquedas por diseñador
                    case 2:
                        break;

                    //valor total en stock
                    case 3:
                        double total = 0;
                        for (Prendas prendas1 : prendas) {
                            total += prendas1.getPrecio();
                        }
                        System.out.println("[ El valor total de las prendas es: $" + total + " ]" + "\n");
                        saliropcs = false;
                        break;

                    //registrar nueva prenda
                    case 4:
                        break;

                    default: 
                        System.out.println("No ingreso una de las opciones, intente de nuevo \n");
                }
            } while (saliropcs);
                
            System.out.println("Presio 'S' para menu, o cualquier otra letra para seguir");
            String salirentrar = sc.nextLine().toLowerCase();
            if (salirentrar.equals("s"))
                salirmenu = false;
        } while (salirmenu);


    }
}
