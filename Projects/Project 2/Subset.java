import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;


// Takes a command-line integer k; reads in a sequence of strings from
// standard input; and prints out exactly k of them, uniformly at random.
// Note that each item from the sequence is printed out at most once.
public class Subset {
    public static void main(String[] args) {
        int k = Integer.parseInt(args[0]); //gets k
        // Create an object q of type ResizingArrayRandomQueue
        ResizingArrayRandomQueue<String> q = new ResizingArrayRandomQueue<>();
        //Read strings from standard input and insert them into q
        while (!StdIn.isEmpty()) {
            q.enqueue(StdIn.readString()); //adds input to enqueue
        }
        //Dequeue and print k (command-line argument) items from q
        for (int i = 1; i <= k; i++) {
            StdOut.println(q.dequeue()); //dequeue prints random
        }
    }
}
