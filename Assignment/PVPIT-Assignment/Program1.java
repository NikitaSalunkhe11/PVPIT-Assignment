import java.util.*;
import java.io.*;

class MergeSortedArrays {
    public static void mergeArrays(int[] arr1, int[] arr2, int n1, int n2, int[] arr3) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1) {
            if (arr1[i] != 0) {
                arr3[k++] = arr1[i++];
            }else{
                    i++;
            }
        }
        while(j < n2){
                if(arr2[j] != 0){
                        arr3[k++]=arr2[j++];
                }else{
                        j++;
                }
        }
        Arrays.sort(arr3);
    }
    public static void main(String[] args) throws IOException{

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter size of first Array");

        int size1=Integer.parseInt(br.readLine());
        
        int arr1[] = new int[size1];

        System.out.println("Enter Sorted Array Elements");

        for(int i=0;i<size1;i++){
            arr1[i]=Integer.parseInt(br.readLine());
        }

        System.out.println("Enter size of Second Array");

        int size2=Integer.parseInt(br.readLine());
        
        int arr2[] = new int[size2];

        System.out.println("Enter Sorted Array Elements");

        for(int i=0;i<size2;i++){
            arr2[i]=Integer.parseInt(br.readLine());
        }

        int arr3[] = new int[(size1 + size2)];

        mergeArrays(arr1, arr2, size1, size2, arr3);

        for (int k=0;k<arr3.length;k++){
                if(arr3[k] != 0){
                        System.out.print(arr3[k] + " ");
                }
        }
        System.out.println();
    }
}
