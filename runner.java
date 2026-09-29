//                        task 1
//class circle {
//    public int radius;
//
//    public circle() {
//        radius = 3;
//    }
//
//    public circle(int a) {
//        radius = a;
//    }
//
//    public void display() {
//        System.out.println("Radius is = " + radius);
//    }
//
//    public double circumfrence(int a) {
//        return (2 * 3.18 * radius);
//    }
//}
//public class runner {
//    public static void main(String[] args) {
//        circle cs = new circle();
//        cs.display();
//        System.out.println(c1.circumfrence(2));
//    }
//}


//           task 2
//class account{
//    int balance;
//    int withdraw;
//    int deposit;
//public account(){
//    balance=4000;
//    withdraw=3000;
//    deposit=2000;
//}
//public account(int b,int w,int d){
//    balance=b;
//    withdraw=w;
//    deposit=d;
//}
//public int withdraw(){
//    return balance=(balance-withdraw);
//}
//public int deposit(){
//    return balance=(balance+deposit);
//}
//}
//public class runner{
//    public static void main(String[] args){
//        account a1=new account();
//        System.out.println("Balance after withdraw is:"+a1.withdraw());
//        System.out.println("Balance after deposit is:"+a1.deposit());
//    }
//}


//                 task 3
//class distance{
//    int feet,inches,valueF,valueI;
//    public distance(){
//        feet=16;
//        inches=160;
//    }
//    public distance(int f,int i){
//        feet=f;
//        inches=i;
//    }
//    public void display(){
//        System.out.println("Distance in feet is = "+feet+"Distance in inches is = "+inches);
//    }
//    public double convertI(){
//        return valueI=(feet*12);
//    }
//    public double convertF(){
//        return valueF=(inches/12);
//    }}
//    public class runner{
//        public static void main(String[]args){
//            distance d1=new distance();
//            d1.display();
//            System.out.println(d1.convertF());
//            System.out.println(d1.convertI());
//        }
//    }


//    task 4
//class mark{
//    private int eng;
//    private int maths;
//    private int cs;
//
//    public void mark(){
//        eng=55;
//        maths=64;
//        cs=58;
//    }
//    public void mark(int e,int m,int c){
//        eng=e;
//        maths=m;
//        cs=c;
//    }
//    public void display(){
//        System.out.println("your score out of 60 is:"+eng+maths+cs);
//    }
//    public int total(){
//        return (eng+maths+cs);
//    }
//    public double percent(){
//        return ((double)total()/180*100);
//    }
//}
//public class marks{
//    public static void main(String[] args){
//        mark S1=new mark();
//        S1.display();
//        S1.mark(52,54,57);
//        System.out.println(S1.total());
//        System.out.println(S1.percent());
//    }
//}


//                task 5
//class Time{
//    private String hour;
//    private String min;
//    private String seconds;
//
//    public Time(){
//        hour="12:00am";
//        min="45mins";
//        seconds="22secs";
//    }
//    public Time(String h,String m,String s){
//        hour=h;
//        min=m;
//        seconds=s;
//    }
//    public void display(){
//        System.out.println("Time in hours:"+hour+"\n"+"Time in minutes:"+min+"\n"+"Time in seconds:"+seconds);
//
//    }
//    public void check(){
//        System.out.println("Time should be valid");
//    }
//}
//public class Times{
//    public static void main(String[] args){
//        Time T1=new Time();
//        T1.display();
//    }
//}