public class Main {
    public static void main(String[] args) {
        samsung();
        iphone();

    }
    static void iphone(){
        System.out.println("\033[31mIphone\033[0m");
        Phone iphone = new Phone();
        iphone.name = "iphone 13pro";
        iphone.price= 120000;
        iphone.color="purple";
        iphone.battery=100;
        System.out.println(iphone.name+"\n"+iphone.price+"\n"+iphone.color+"\n"+iphone.battery);
    }
    static void samsung(){
        System.out.println("\033[31mSamsung\033[0m");
        Phone samsung = new Phone();
        samsung.name= "S22 ultra";
        samsung.price=80000;
        samsung.color="black";
        samsung.battery=100;
        System.out.println(samsung.name+"\n"+samsung.price+"\n"+samsung.color+"\n"+samsung.battery);
    }
}