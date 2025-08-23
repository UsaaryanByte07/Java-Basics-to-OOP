public class TestArrayOperations {
    public static void main(String[] args) {
        /*
         * 64. reate a class ArrayOperations with a static nested class Statistics.
         * Statistics could have methods like mean() which
         * operate on an array.
         */
        ArrayOperations opr = new ArrayOperations();
        ArrayOperations.Statistics statistics = new ArrayOperations.Statistics();
        // ArrayOperations.Statistics statistics = opr.new Statistics(); if Statistics
        // was not static then you would use these to instance.. Please watch the video
        // for this Question
        System.out.println(statistics.mean(new int[] { 1, 2, 3, 4, 5 }));
    }
}
