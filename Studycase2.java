import java.util.Stack;

public class StudyCase2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        System.out.println(stack.pop()); // Menghapus elemen teratas dan menampilkannya
        System.out.println(stack.peek()); // Menampilkan elemen teratas tanpa menghapusnya
    }
}
