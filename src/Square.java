public class Square {
    private int a;
    private int b;
    private int c;
    private int d;

    public void setA(int a){
        this.a=a;
    }public void setB(int b){
        this.b=b;
    }
    public void setC(int c){
        this.c=c;
    }
    public void setD(int d){
        this.d=d;
    }
    public int getA(int a){
        a=40;
        return a;
    }
    public int getB(int b){
        b=40;
        return b;
    }
    public int getC(int c){
        c=40;
        return c;
    }
    public int getD(int d){
        d=40;
        return d;
    }
    public void square1(){
        int f = 0;
       f = getA(a)*getB(b);
        System.out.println(f);
    }
}
