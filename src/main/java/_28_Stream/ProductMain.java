package _28_Stream;

import java.util.Arrays;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("삼성 갤럭시북", 5, true, 2000000),
                new Product("애플 m1", 1, false, 159000),
                new Product("삼성 키보드", 10, true, 40000),
                new Product("애플 펜슬", 3, true, 190000),
                new Product("로지텍 마우스", 0, false, 60000)
        );

        // 1. 이름에 삼성이 들어간 상품중 10만원 이하 상품리스트 추출
        List<Product> samsung = products.stream()
                .filter(name -> name.getName().contains("삼성"))
                .filter(price -> price.getPrice() <= 100000)
                .toList();

        // 2. 이름에 애플이 들어가지 않은 상품중 세일 중인 상품리스트
        //    세일은 정가 * 0.9 해서 추출
        List<Product> notApple = products.stream()
                .filter(p -> !(p.getName().contains("애플")))
                .filter(p -> p.isOnSale())
                .map(p -> new Product(p.getName(), p.getStock(), p.isOnSale(), (int) (p.getPrice() * 0.9)))
                .toList();
        System.out.println(notApple);

        // 3. 세일중인 상품들(정가기준)의 총 전체가격(재고량 * 가격)를 구해주세요
        int totalPrice = products.stream()
                .filter(p -> p.isOnSale())
                .map(p -> p.getStock() * p.getPrice()) // [5000000, 0, ....]
                .reduce(0, (priceSum, price) -> priceSum + price);

    }
}
