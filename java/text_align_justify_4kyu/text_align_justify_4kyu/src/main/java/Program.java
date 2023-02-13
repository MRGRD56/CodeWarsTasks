public class Program {
    private static final String LIPSUM = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vestibulum sa"
                                         + "gittis dolor mauris, at elementum ligula tempor eget. In quis rhoncus nunc, at aliquet orci. Fusc"
                                         + "e at dolor sit amet felis suscipit tristique. Nam a imperdiet tellus. Nulla eu vestibulum urna. V"
                                         + "ivamus tincidunt suscipit enim, nec ultrices nisi volutpat ac. Maecenas sit amet lacinia arcu, no"
                                         + "n dictum justo. Donec sed quam vel risus faucibus euismod. Suspendisse rhoncus rhoncus felis at f"
                                         + "ermentum. Donec lorem magna, ultricies a nunc sit amet, blandit fringilla nunc. In vestibulum vel"
                                         + "it ac felis rhoncus pellentesque. Mauris at tellus enim. Aliquam eleifend tempus dapibus. Pellent"
                                         + "esque commodo, nisi sit amet hendrerit fringilla, ante odio porta lacus, ut elementum justo nulla"
                                         + " et dolor.";

    public static void main(String[] args) {
        var wrapped = Kata.justify(LIPSUM, 24);
        System.out.println(wrapped);
    }
}
