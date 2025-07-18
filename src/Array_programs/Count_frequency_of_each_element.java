package Array_programs;

public class Count_frequency_of_each_element {

    public static void countfreq(int[ ] arr, int n){
        boolean visited[] = new  boolean[n];
        for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i] == true)
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);

    }}
    public static void main(String[] args) {
        int[] arr = { 5,8,2,4,2,6,};
        int n = arr.length;
        countfreq(arr,n);
    }
}
