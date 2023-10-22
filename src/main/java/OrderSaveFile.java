import java.io.FileWriter;
import java.io.IOException;

public class OrderSaveFile {

    public final  Order order;


    public OrderSaveFile(Order order) {
        this.order = order;
    }

    public  void orderSaveFile() {
        String fileName = "order.json";

        try {
            FileWriter writer = new FileWriter(fileName, false);

            try {
                writer.write("{\n");


                writer.write("\"clientName\":\"" + order.getClientName() + "\",\n");
                writer.write("\"product\":\"" + order.getProduct() + "\",\n");
                writer.write("\"qnt\":" + order.getQnt() + ",\n");
                writer.write("\"price\":" + order.getPrice() + "\n");
                writer.write("}\n");
                writer.flush();
            } catch (Throwable var6) {
                try {
                    writer.close();
                } catch (Throwable var5) {
                    var6.addSuppressed(var5);
                }

                throw var6;
            }

            writer.close();
        } catch (IOException var7) {
            System.out.println(var7.getMessage());
        }

    }
}
