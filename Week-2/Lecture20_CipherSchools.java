public class Lecture20_CipherSchools{
    public static void main(String args[]){
        int arr[][]=new int [3][];
        arr[0]=new int[3];
        arr[1]=new int[2];
        arr[2]=new int[3];
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int arr2[][]=new int[3][];
        // arr2[0]={1,2,3}; we cannot initialize the array this way
        // arr2[1]={2,3};
        // arr2[2]={4,5,6};
        
        //Anonymous Arrays
        arr2[0]=new int[]{1,2,3};
        arr2[1]=new int[]{2,3};
    }
}
