import java.util.Arrays;
public class Arrayinko {
    public static void Cap(int [] A){
        for(int i=0;i<A.length;i++){
            System.out.println(A[i]);
        }
        System.out.println();
    }
    public static void main(String[] args){
        int [] A={6,2,9,5,1};
        int [] B={8,2,6,0,5};
        Arrays.sort(A);
        Cap(A);
        for(int i=B.length-1;i>=0;i--){
            System.out.println(B[i]);
        }
       /*/* System.out.println();*/
        for(int j=1;j<B.length;j++){
        for(int i=0;i<B.length-j;i++){
            if(B[i]>B[i+1]){
                int c=B[i];
                B[i]=B[i+1];
                B[i+1]=c;
            }
        }}
        Cap(B);

}}
