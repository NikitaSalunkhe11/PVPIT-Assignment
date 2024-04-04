import java.util.ArrayList;
import java.util.List;
import java.io.*;
class MaximumSumPath {
    public static int maxSumPath(int[] X, int[] Y) {
        int sumX = 0, sumY = 0, maxSum = 0;
        int i = 0, j = 0;
        List<Integer> path = new ArrayList<>();


        while (i < X.length && j < Y.length) {
            if (X[i] < Y[j]) {
                sumX += X[i];
                path.add(X[i]);
                i++;
            } else if (X[i] > Y[j]) {
                sumY += Y[j];
                path.add(Y[j]);
                j++;

            } else {

                maxSum += Math.max(sumX, sumY) + X[i];

                path.add(X[i]);

                sumX = sumY = 0;
                i++;
                j++;
            }
        }


        while (i < X.length) {
            sumX += X[i];
            path.add(X[i]);
            i++;
        }

        while (j < Y.length) {
            sumY += Y[j];
            path.add(Y[j]);
            j++;
        }

        maxSum += Math.max(sumX, sumY);

        System.out.print("Maximum Sum Path: ");
        for (int k = 0; k < path.size(); k++) {
            System.out.print(path.get(k));
            if (k != path.size() - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println();

        return maxSum;
    }

    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the Array1 size");
            int size1 = Integer.parseInt(br.readLine());

            System.out.println("Enter the Array1 elements");

            int X[] = new int[size1];

            for(int i = 0 ;i<X.length;i++){
                X[i] = Integer.parseInt(br.readLine());
            }

            System.out.println("Enter the Array2 size");
            int size2 = Integer.parseInt(br.readLine());

            System.out.println("Enter the Array2 elements");

            int Y[] = new int[size2];

            for(int i = 0 ;i<Y.length;i++){
                Y[i] = Integer.parseInt(br.readLine());
            }
        int maxSum = maxSumPath(X, Y);
        System.out.println("Maximum Sum: " + maxSum);
    }
}