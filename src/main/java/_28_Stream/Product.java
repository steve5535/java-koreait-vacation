package _28_Stream;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor @Data
public class Product {
    private String name;
    private int stock;
    private boolean onSale;
    private int price;
}
