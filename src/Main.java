public class Main {
    public static void main(String[] args) {

        String [][] cities = new String[3][3];

        cities[0][0] = "Frankfurt";
        cities[0][1] = "Mannheim";
        cities[0][2] = "Weinheim";
        cities[1][0] = "Munich";
        cities[1][1] = "Augsburg";
        cities[1][2] = "Dachau";
        cities[2][0] = "Berlin";
        cities[2][1] = "Dresden";
        cities[2][2] = "Hannover";

        for (int i = 0; i <=2 ; i++) {

            System.out.println("-------");
            for (int j = 0; j <=2; j++) {
                System.out.println(cities[i][j]);
            }

        }

    }
}