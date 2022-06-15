public class Fibonacci {
    public static void main(String[] args) {
        int v1 = 1;
        int v2 = 0;
        int v3 = 0;
        for (int i = 0; i <= 30; i++) {
            v3 = v2 + v1;
            System.out.println(v3);
            v1 = v2;
            v2 = v3;
        }
    /*
        int proximo=0,atual=0,anterior=1;
        while(proximo<=100){
        proximo=atual+anterior;
        System.out.print(proximo+",");
        anterior=atual;
        atual=proximo;
        }
    */
    }
}