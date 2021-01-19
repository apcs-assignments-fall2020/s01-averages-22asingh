public class MyMain {

    // Returns the mean of the 2D array mat
    public static double mean(double[][] mat) { 
        // YOUR CODE HERE
        double length = mat.length * mat[0].length;
        double total = 0;
        for (int y = 0; y < mat.length; y++){
            for (int x = 0; x < mat[0].length; x++){
                total += mat[y][x];
            }
        }
        return total/length;
    }

    // Returns the median of the 2D array mat
    public static double median(double[][] mat) { 
        // YOUR CODE HERE
        double median;
        if (mat.length % 2 == 1){
            if (mat[0].length % 2 == 1){
                median = mat[mat.length/2][mat[0].length/2];
            }
            else {
                double a = mat[mat.length/2][mat[0].length/2];
                double b = mat[mat.length/2][mat[0].length/2 - 1];
                median = (a + b)/2;
            }
        }
        else{
            double a = mat[mat.length/2][0];
            double b = mat[mat.length/2 - 1][mat[0].length - 1];
            median = (a + b)/2;
        }
        return median;
    }
    

    // Returns the mode of the 2D array mat
    public static double mode(double[][] mat) { 
        // YOUR CODE HERE
        double max = 0;
        for (int y = 0; y < mat.length; y++){
            for (int x = 0; x < mat[0].length; x++){
                if (mat[y][x] > max){
                    max = mat[y][x];
                }
            }
        }
        int[] count = new int[(int)max + 1];
        for (int y = 0; y < mat.length; y++){
            for (int x = 0; x < mat[0].length; x++){
                count[(int)mat[y][x]] ++;
            }
        }
        int maxFreq = 0;
        double mode = 0.0;
        for (int i = 0; i < count.length; i++){
            if (count[i] > maxFreq){
                mode = i;
                maxFreq = count[i];
            }
        }
        return mode;
    }


    public static void main(String[] args) {
        // Write some code here to test your methods!
        double[][] arr = {
            {1,  2,  4,  6},
            {7,  7,  7, 12},
            {14, 15, 15, 18},
            {22, 22, 27, 30}
        };
        System.out.println("Mean: " + mean(arr));
        System.out.println("Median: " + median(arr));
        System.out.println("Mode: " + mode(arr));
    }
}
