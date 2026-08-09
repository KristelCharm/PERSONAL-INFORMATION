public class MakeupShop {

    private String[] categories;
    private String[][] products;

    // Setter for categories
    public void setCategories(String[] categories) {
        this.categories = categories;
    }

    // Setter for products
    public void setProducts(String[][] products) {
        this.products = products;
    }

    // Getter for categories
    public String[] getCategories() {
        return categories;
    }

    // Getter for products
    public String[][] getProducts() {
        return products;
    }

    public static void main(String[] args) {

        // Create object of the subclass
        MakeupProducts makeup = new MakeupProducts();

        // Categories
        String[] categories = {
            "Face",
            "Eyes",
            "Lips",
            "Cheeks",
            "Skincare"
        };

        // Multidimensional array
        String[][] products = {
            {"Foundation", "Concealer", "Face Powder", "BB Cream"},
            {"Mascara", "Eyeliner", "Eyeshadow", "Eyebrow Pencil"},
            {"Lipstick", "Lip Gloss", "Lip Tint", "Lip Balm"},
            {"Blush", "Bronzer", "Highlighter", "Contour"},
            {"Facial Cleanser", "Moisturizer", "Sunscreen", "Face Serum"}
        };

        // Set the values
        makeup.setCategories(categories);
        makeup.setProducts(products);

        // Display the products
        makeup.displayProducts();
    }
}