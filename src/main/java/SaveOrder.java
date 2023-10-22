import java.util.Scanner;


public class SaveOrder {
    private String clientName = prompt("clientName:");
    private String product = prompt("product:");
    private int qnt = Integer.parseInt(prompt("qnt: "));

    private int price = Integer.parseInt(prompt("price: "));

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }

    private String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.print(message);
        return in.nextLine();
    }

}