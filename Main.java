
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
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

        System.out.println(Arrays.toString(prendas));
    }
}
