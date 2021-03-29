package module5.BasicOfOOP.Task2;

/**
 * Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать
 * покупку из нескольких товаров.
 */
public class Runner {
    public static void main(String args []){

        Payment payment = new Payment(1000);

        payment.addGoods(new Goods("Banana", 10));
        payment.addGoods(new Goods("Robot", 25));

        payment.makePayment( 100);

    }

}
