public class enddd {
    public static void main(String[] args) {
        int a=1, b=1,c=1;
        System.out.println(b);
        for(int i=1;i<10;i++){
            c=a+b;
            a=b;
            b=c;
            System.out.println(b);
        }
    }
}
