class Sum {
    public static void main(String[] args) {
        int[] arr = {1,3,5};
        int result = sum2(arr);
        System.out.println(result);
    }

    public static int sum(int[] arr) {
        return sum(arr, 0, 0);
    }

    public static int sum(int[] arr, int index, int currSum) {
        if(arr.length == 0) {
            return currSum;
        }
        if(index == (arr.length - 1)) {
            return currSum + arr[index];
        }
        int temp = currSum + arr[index];
        return  sum(arr, ++index, temp);
    }

    public static int sum2(int[] arr) {
        if(arr.length == 0) {
            return 0;
        }

        if(arr.length == 1) {
            return arr[0];
        }
        int[] tempArr = new int[arr.length - 1];
        System.arraycopy(arr, 1, tempArr, 0, arr.length - 1);
        return arr[0] + sum2(tempArr);
    }
}