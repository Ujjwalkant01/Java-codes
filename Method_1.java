public class Method_1 {

    static int ego(int x,int y){
        int z;
        if(x<y){
            z=x+y;
            System.out.println(z);
        }
        else{
            z= (x+y)*2;
            System.out.println(z);
        }
        return z;

    }
    public static void main(String[] args){
        int a=5;
        int b=10;
        int c;
        c= ego(a,b);

        int u=25;
        int p=21;
        int q;
        q= ego(u,p);

    }
}
