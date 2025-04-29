class CountingSort {
    public void sort(int[] ages) {
        int max = 18, min = 10;
        int[] count = new int[max - min + 1];

        for (int age : ages) {
            count[age - min]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                ages[index++] = i + min;
            }
        }
    }
}
