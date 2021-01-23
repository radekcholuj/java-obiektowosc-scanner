import java.util.Scanner;

public class CupOrders {
    public static void main(String[] args) {

        OrderRepository orderRepository = new OrderRepository(10);

        int option;
        do {
            System.out.println("------------------ Cup Orders ---------------");
            System.out.println("1 - add order");
            System.out.println("2 - all orders");
            System.out.println("3 - stop program");

            Scanner scanner = new Scanner(System.in, "UTF-8");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.println("Name: ");
                    String name = scanner.nextLine();

                    System.out.println("Text: ");
                    String text = scanner.nextLine();

                    System.out.println("Quantity: ");
                    int quantity = scanner.nextInt();

                    Order order = new Order(name, text, quantity);

                    orderRepository.add(order);
                    break;
                case 2:
                    orderRepository.displayAll();
                    break;
                case 3:
                    break;
            }

        } while(option != 3);


    }
}
