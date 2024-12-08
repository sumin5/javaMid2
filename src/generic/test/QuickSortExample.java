package generic.test;

public class QuickSortExample {

    // 퀵 정렬 메서드
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // 피벗을 기준으로 배열을 분할하고, 피벗의 위치를 반환
            int pivotIndex = partition(arr, low, high);

            // 피벗을 기준으로 왼쪽과 오른쪽 부분 리스트에 대해 재귀 호출
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // 배열을 피벗을 기준으로 분할하는 메서드
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // 마지막 요소를 피벗으로 선택
        int i = low - 1;       // 작은 요소의 인덱스

        for (int j = low; j < high; j++) {
            // 현재 요소가 피벗보다 작거나 같으면
            if (arr[j] <= pivot) {
                i++;

                // i와 j의 요소를 교환
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // 피벗과 i+1 위치의 요소를 교환
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1; // 피벗의 위치 반환
    }

    public static void main(String[] args) {
        int[] arr = {33, 10, 55, 71, 29, 99, 34, 8};
        System.out.println("정렬 전: ");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("정렬 후: ");
        printArray(arr);
    }

    // 배열을 출력하는 메서드
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
