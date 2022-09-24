public class Main {
    public static void main(String[] args) throws Exception {
        
        ProductManager productManager = new ProductManager();
        Product product = new Product();

        product.setId(1);
        product.setName("Laptop");
        product.setUnitPrice(10000);
        product.setUnitsInStock(100);

        productManager.add(product);

        System.out.println(product.getCode());
    }
}
