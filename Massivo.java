public class Massivo {
    public static void main(String[] args){
        int [] A={2,4,6};
        int [] B;
        Ekran(A);
        B=Kvadratino(A);
        Ekran(B);
    }
    public static void Ekran(int [] A){
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]+"");
        }
        System.out.println();
    }
    public static int [] Kvadratino(int [] A){
        int [] M=new int[A.length];
        for(int i=0;i<A.length;i++){
            M[i]=A[i]*A[i];
        }
        return M;
    }
}
