public class Main {
    public static void main(String[] args) {
        int[] data = {64, 25, 22, 12, 11};
        for (int i = 0; i < data.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < data.length; j++) {
                if (data[j] < data[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = data[minIndex];
            data[minIndex] = data[i];
            data[i] = temp;
        }
        System.out.print("Hasil setelah diurutkan: ");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}