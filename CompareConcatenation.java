public class CompareConcatenation {
    public static void main(String[] args) {
        int iterations = 1000000;
        String text = "hello";

        // Measure time for StringBuffer
        long startTime1 = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(text);
        }
        long endTime1 = System.nanoTime();
        long durationBuffer = endTime1 - startTime1;

        // Measure time for StringBuilder
        long startTime2 = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(text);
        }
        long endTime2 = System.nanoTime();
        long durationBuilder = endTime2 - startTime2;

        System.out.println("Time taken by StringBuffer: " + durationBuffer / 1000000 + " ms");
        System.out.println("Time taken by StringBuilder: " + durationBuilder / 1000000 + " ms");
    }
}
