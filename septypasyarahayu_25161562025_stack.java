public class septypasyarahayu_25161562025_stack {

    // === BAGIAN 1: Deklarasi Stack ===
    static String[] stack = new String[10];
    static int top = -1;

    // === BAGIAN 2: Operasi Stack ===

    // Method push
    static void push(String tiket) {
        if (top == stack.length - 1) {
            System.out.println("Stack penuh! Transaksi tidak bisa ditambahkan");
        } else {
            top++;
            stack[top] = tiket;
        }
    }

    // Method pop
    static String pop() {
        if (isEmpty()) {
            return "Stack kosong!";
        } else {
            String data = stack[top];
            top--;
            return data;
        }
    }

    // Method peek
    static String peek() {
        if (isEmpty()) {
            return "Stack kosong!";
        } else {
            return stack[top];
        }
    }
static int hitungTotal() {
    int total = 0;
    for (int i = 0; i <= top; i++) {
        String data = stack[i];
        String hargaStr = data.substring(data.indexOf("Rp") + 2);
        hargaStr = hargaStr.replace(".", "").trim();
        int harga = Integer.parseInt(hargaStr);
        total += harga;
    }
    return total;
}
    // Mengecek stack kosong
    static boolean isEmpty() {
        return top == -1;
    }

    // Menampilkan isi stack
    static void tampilkanStack() {
        System.out.println("=== Isi Stack (TOP -> BOTTOM) ===");

        if (isEmpty()) {
            System.out.println("Stack kosong");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println("| " + stack[i] + " |");
            }
        }

        System.out.println("==============================");
    }

    // === BAGIAN 3: Main Program ===
    public static void main(String[] args) {

        push("Tiket-A01 : Avengers Rp50.000");
        push("Tiket-B02 : Interstellar Rp45.000");
        push("Tiket-C03 : Inception Rp45.000");
        int total = hitungTotal();
        tampilkanStack();

        System.out.println("Tiket terakhir masuk : " + peek());

        System.out.println("Tiket dibatalkan : " + pop());
        System.out.printf("Total transaksi : Rp%,d\n", total);
        tampilkanStack();
 }
}