package main.product;


/**
 * Interface represents a pile of products such as the Schuur
 */
public interface ProductPile<T extends Product> {

    void addProduct(T t);

    T getProduct();

    boolean hasMoreProducts();
}
