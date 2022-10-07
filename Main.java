public class Main {
    public static void main(String[] args) {
        //Question three
        BankAcciunt Q_three=new BankAcciunt();


        //Question Four
        BankAcciunt Q_Four=new BankAcciunt(1000);
        System.out.print("Q_Four " +Q_Four.addinterest(50) + "\n-----------------\n");

        //Question Five
        BankAcciunt Q_Five=new BankAcciunt();
       Q_Five.mystery(50);

        //Question Eight
        BankAcciunt Q_Eight=new BankAcciunt(1000);
        Q_Eight.addinterest(10);
        Q_Eight.addinterest(10);
        System.out.println(Q_Eight.addinterest(500));
        System.out.println(Q_Eight.addinterest(100));

        //Question Nine
        CashRegister Q_Nine=new CashRegister();
        Q_Nine.printReceipt();
        System.out.println("\n");



        //Question Ten
        Employee Q_Ten=new Employee();
        System.out.println("Total Salary = " + Q_Ten.setPercentage());
        System.out.println(Q_Ten.getName());

    }


}
