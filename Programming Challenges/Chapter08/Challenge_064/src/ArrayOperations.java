class ArrayOperations {
    public ArrayOperations() {
    }

    static class Statistics {
        double mean(int[] arr) {
            int sum = 0;
            int[] var6 = arr;
            int var5 = arr.length;

            for (int var4 = 0; var4 < var5; ++var4) {
                int number = var6[var4];
                sum += number;
            }

            return (double) sum / (double) arr.length;
        }
    }
}
