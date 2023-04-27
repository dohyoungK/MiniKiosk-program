package app;

import app.product.Product;
import app.product.ProductRepository;

import java.util.Scanner;

public class OrderApp {

    public void start() {

        Scanner scanner = new Scanner(System.in);

        ProductRepository productRepository = new ProductRepository();
        Product[] products = productRepository.getAllProducts();
        Menu menu = new Menu(products);
        Cart cart = new Cart(productRepository, menu);

        System.out.println("🍔 BurgerQueen Order Service");

        while (true) {
//          1. 메뉴 출력
            menu.printMenu();
            String input = scanner.nextLine();

//          2. 입력이 + 면 주문내역 출력, 1에서 제품 번호 범위 내라면 장바구니 담기
            if (input.equals("+")) {
//                주문 내역 출력
            }
            else {
                int menuNumber = Integer.parseInt(input);

                if (menuNumber == 0) cart.printCart();
                else if (1 <= menuNumber && menuNumber <= products.length) cart.addToCart(menuNumber);
            }
        }
    }
}
