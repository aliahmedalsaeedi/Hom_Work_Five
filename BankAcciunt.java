public class BankAcciunt {
    private double Balance;//الرصيد
    private int counter=4;// العداد

    //Question three
    BankAcciunt(){
        Balance =1000;
        Balance -=500;
        Balance -=400;
        System.out.print("Q_Three = "+ Balance +"\n------------------\n");
        counter--;
    }
    public BankAcciunt(int number) {
        Balance = number;
        counter--;
    }
    //Question four &  Eight                 النسبة المئوية
    public double addinterest(double percentage){
        --counter;
        Balance= Balance*(percentage/100);    //1000+=1000(100/50)   1000+=1000(0.5)   1000+=1000*0.5=500  1000+500=1500
        return  (counter<=0)? Balance--:Balance;

    }

    // Five
    public void mystery( int amount){
        this.Balance=this.Balance-amount;
        this.Balance=this.Balance+amount;
        System.out.print("this = " + this.Balance + "\n-----------------\n");
    }


}
