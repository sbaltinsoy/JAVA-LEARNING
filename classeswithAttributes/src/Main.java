public class Main {

    public static void main(String[] args) {
        Product product1 = new Product(1,"Laptop","Moster Laptop",5000,2,"Gri");
        Product product = new Product();
        product.setName("Laptop");
        product.setId(1);
        product.setDescription("Monster Laptop");
        product.setPrice(5000);
        product.setStockAmount(8);
        product.setColor("Red");

        ProductManager productManager = new ProductManager();
        productManager.Add(product);

        System.out.println(product.getCode());

    }
}
