public class CashRegister {
    private int RAM;
    private int SSD;
    private int GPU;
    private int CPU;
    private int TV;
    private int mouse;
    private int kybd;
    private int Case;

    public CashRegister() {
        this.RAM = 200;
        this.SSD = 150;
        this.GPU = 800;
        this.CPU = 700;
        this.TV = 500;
        this.mouse = 100;
        this.kybd = 50;
        this.Case =80;
    }

    public void printReceipt(){
        String price =String.valueOf(this.RAM);
        price = price.concat(" + " + String.valueOf(this.SSD));
        price = price.concat(" + " + String.valueOf(this.CPU));
        price = price.concat(" + " + String.valueOf(this.GPU));
        price = price.concat(" + " + String.valueOf(this.TV));
        price = price.concat(" + " + String.valueOf(this.Case));
        price = price.concat(" + " + String.valueOf(this.kybd));
        price = price.concat(" + " + String.valueOf(this.mouse));

        System.out.println("Total =  " +price);

    }

}
