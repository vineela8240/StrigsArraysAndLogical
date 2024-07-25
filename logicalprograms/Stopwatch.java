package logicalprograms;

public class Stopwatch {


        private long startTime;
        private long endTime;
        private boolean running;

        // Start the stopwatch
        public void start() {
            startTime = System.currentTimeMillis();
            running = true;
        }

        // Stop the stopwatch
        public void stop() {
            endTime = System.currentTimeMillis();
            running = false;
        }

        // Get the elapsed time in milliseconds
        public long getElapsedTime() {
            if (running) {
                return System.currentTimeMillis() - startTime;
            } else {
                return endTime - startTime;
            }
        }

        public static void main(String[] args) {
            Stopwatch stopwatch = new Stopwatch();

            // Start the stopwatch
            System.out.println("Starting the stopwatch...");
            stopwatch.start();


            try {
                Thread.sleep(3000); // Sleep for 3 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Stop the stopwatch
            System.out.println("Stopping the stopwatch...");
            stopwatch.stop();

            // Print the elapsed time
            long elapsedTime = stopwatch.getElapsedTime();
            System.out.println("Elapsed time in milliseconds: " + elapsedTime);
            System.out.println("Elapsed time in seconds: " + elapsedTime / 1000.0);
        }
    }


