package jp.co.samples.method.name;

/**
 * Get current method name sample source codes.
 */
public class MethodNameSamples {

    /**
     * Main method.
     * 
     * @param args
     *            start arguments.
     */
    public static void main(String[] args) {

        // Get current method.
        throwable();
        thread();
        anonymous();
    }

    /**
     * Get current method name from Throwable.
     */
    private static void throwable() {

        // Method name from Throwable.
        String methodName = new Throwable().getStackTrace()[0].getMethodName();
        System.out.println(methodName);
    }

    /**
     * Get current method name from Thread.
     */
    private static void thread() {

        // Method name from Thread.
        for (StackTraceElement trace : Thread.currentThread().getStackTrace()) {
            String output = String.format("class : %s, method : %s",
                    trace.getClassName(), trace.getMethodName());
            System.out.println(output);
        }
    }

    /**
     * Get current method from anonymous function.
     */
    private static void anonymous() {

        // Method name from anonymous function.
        String methodName = new Object() {
        }.getClass().getEnclosingMethod().getName();
        System.out.println(methodName);
    }
}
