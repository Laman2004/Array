public class Array {
    static int CemArray(int array[]){
        for(int i=0;i<array.length;i++){
            return array[0]+array[array.length-1];

            }return 0;
        }
        static int ZeroArray(int array[]){
        int say=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==0){
                say++;
                return say;
            }
        }return 0;
        }
        static String PoliArray(int array[]){
        int say=0;
        for(int i=0;i<array.length;i++){
if(array[i]==array[array.length-i-1]){
    say++;
    if(say==array.length/2){
        return "Polindromdur";
    }
}
        }
        return "polindrom deyil";
        }
        static int IndexArray(int array[]){
        int index;
        for(int i=0;i<array.length;i++){
            if(array[i]==0){
                return i;
            }
        }return 0;
        }
        static void OrtaqArray(int array[],int array1[]){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array1.length;j++){
            if(array[i]==array1[j]){
                System.out.println(array1[j]);
                break;
            }}}}
        public static int[] DeyisArray(int [] array,int index1,int index2){
        int c;
                c=array[index1];
                array[index1]=array[index2];
                array[index2]=c;
                return array;
        }
    public static void Cap(int [] array)
    {
        for (int i =0 ; i < array.length; i++)
            System.out.print(array[i] + " ");

        System.out.println("");
    }

        public static void main(String[] args){

            int array[]={1,2,0,2,1};
            int array1[]={1,2,6,7,0};

        System.out.println(CemArray(array));
        System.out.println(ZeroArray(array));
        System.out.println(PoliArray(array));
            System.out.println(IndexArray(array));
            OrtaqArray(array,array1);
            array=DeyisArray(array,1,2);
            Cap(array);
        }
    }

