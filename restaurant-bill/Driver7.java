public class Driver7 {
    public static void main(String[] args) {
        Bill myBill = new Bill();
        String[] dish = { "rice", "beans", "yam", "plantain", "eba" };
        double[] cost = { 6.0, 3.4, 4.5, 7.8 };
        myBill.addOrder("rice", 1, dish, cost);
        myBill.addOrder("beans", 2, dish, cost);
        myBill.addOrder("yam", 3, dish, cost);
        myBill.addOrder("plantain", 10, dish, cost);
        myBill.getOrder();
        System.out.println("Your total bill = $" + myBill.getTotal());
    }
}
