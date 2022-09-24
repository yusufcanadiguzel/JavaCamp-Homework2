public class Main {
    public static void main(String[] args) throws Exception {
        
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        Product product2 = new Product(2, "Mouse", 1000, 100);

        product.setId(1);
        product.setName("Laptop");
        product.setUnitPrice(10000);
        product.setUnitsInStock(100);

        productManager.add(product);
        productManager.add(product2);

        System.out.println(product.getCode());
        System.out.println(product2.getCode());
    }
}
