public class MakeupProducts extends MakeupShop {

    public void displayProducts() {

        System.out.println("==============================================");
        System.out.println("          MAKEUP PRODUCTS CATALOG");
        System.out.println("==============================================");

        // Get the arrays using getters
        String[] categories = getCategories();
        String[][] products = getProducts();

        // Loop through categories
        for (int i = 0; i < categories.length; i++) {

            System.out.println();
            System.out.println("Category: " + categories[i]);
            System.out.println("Products:");

            // Loop through products
            for (int j = 0; j < products[i].length; j++) {

                System.out.print(products[i][j]);

                // Add comma between products
                if (j < products[i].length - 1) {
                    System.out.print(", ");
                }
            }

            System.out.println();
            System.out.println("----------------------------------------------");
        }

        System.out.println();
        System.out.println("==============================================");
        System.out.println("       END OF MAKEUP PRODUCTS CATALOG");
        System.out.println("==============================================");
    }
}