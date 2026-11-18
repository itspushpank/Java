
    class Reserve implements Runnable {
        int available = 1;
        int wanted;

        Reserve(int i) {
            wanted = i;
        }
        // Making the entire method synchronized
        public synchronized void bookTicket() {
            System.out.println("Available Berths = " + available);
// If available berths are more than or equal to wanted berths
            if (available >= wanted) {
// Get the name of passenger (thread)
                String name = Thread.currentThread().getName();
// Allot the berth
                System.out.println(wanted + " Berths reserved for " +

                        name);

                try {
                    Thread.sleep(1500); // Simulate printing/processing

                    available = available - wanted; // Update available


                } catch (InterruptedException ie) {
                    ie.printStackTrace();
                }
            } else {
// If available berths are less
                System.out.println("Sorry, no berths");
            }
        }

        public void run() {
            bookTicket();
        }
    }

    class Test1 {
        public static void main(String args[]) {
            Reserve obj = new Reserve(1);
// Attach both threads to the SAME target object
            Thread t1 = new Thread(obj);
            Thread t2 = new Thread(obj);
// Name the threads as persons
            t1.setName("First Person");
            t2.setName("Second Person");
// Send requests for booking
            t1.start();
            t2.start();
        }
    }
}
