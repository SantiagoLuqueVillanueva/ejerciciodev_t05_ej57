public class App {
    public static void main(String[] args) throws Exception {
        int altura = Integer.parseInt(System.console().readLine("Introduzca la altura de la figura: "));

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j < altura; j++) {
                if (i == 0 || i == altura - 1 || j == 0 || j == altura - 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
