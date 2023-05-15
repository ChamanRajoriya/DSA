package Arrays;

public class basic_array {

    public static void main(String[] args) {
        int [] arr=new int[4];
        arr[0]=1;
        arr[1]=2;
        for (int a:arr) {
            //System.out.println(a);
        }
        int [][]a=new int[6][9];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for (int[] ap: a ) {
            for (int arrayelement : ap) {
                System.out.print(arrayelement);
            }
            System.out.println();
        }
    int [][] ar={{1,2,3},{2,1,3},{8,2}};
    try {
        for (int i = 0; i < ar.length; ++i) {
            for (int j = 0; j <ar[i].length; ++j) {
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }catch(Exception s){
        System.out.println(s);
    }

        System.out.println("hello");}
}

