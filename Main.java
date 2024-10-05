
import java.util.Arrays;
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
            new Prendas("Gorros", "Jorge", null, 45),
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
                        boolean prendaEncontrada = false;
                        System.out.println("Ingresa el nombre del diseñador: ");
                        String ingresaDiseniador = sc.nextLine().toLowerCase();
                        for (int i = 0; i < prendas.length; i++) {
                            String diseniador = prendas[i].getDiseniador().toLowerCase();
                            if (diseniador.equals(ingresaDiseniador)) {
                                System.out.print("Prendas que su Diseñador es " + ingresaDiseniador + ": \n" + prendas[i]);
                                prendaEncontrada = true;
                            }
                        }
                        if (!prendaEncontrada) {
                            System.out.println("No existen prendas del diseñador: " + ingresaDiseniador);
                        }
                        saliropcs = false;
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
                        System.out.println("[ Ingresa los datos de la prenda ]\n");

                        System.out.print("Nombre de la prenda: ");
                        String nombrePrenda = sc.nextLine();

                        System.out.print("Ingresa el diseñador de la prenda: ");
                        String nombreDiseniador = sc.nextLine();

                        System.out.print("Ingresa el precio de la prenda: ");
                        double precioPrenda = sc.nextDouble();
                        sc.nextLine();

                        Prendas[] arrayAct = new Prendas[prendas.length + 1];
                        for (int i = 0; i < prendas.length; i++) {
                            arrayAct[i] = prendas[i];
                         }
                         arrayAct[prendas.length] = new Prendas(nombrePrenda, nombreDiseniador, null, precioPrenda);
                        prendas = arrayAct;
                        saliropcs = false;
                        break;
                    default: 
                        System.out.println("No ingreso una de las opciones, intente de nuevo \n");
                }
            } while (saliropcs);
                
            System.out.println("[ Presione 'S' para salir del menu, o cualquier otra letra para seguir ]");
            String salirentrar = sc.nextLine().toLowerCase();
            if (salirentrar.equals("s"))
                salirmenu = false;
        } while (salirmenu);

        System.out.println(Arrays.toString(prendas));
        sc.close();
    }
}
