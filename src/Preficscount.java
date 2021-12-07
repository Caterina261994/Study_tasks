import java.util.ArrayDeque;
import java.util.Deque;

public class Preficscount {
    public static void main(String[] args) {
        String[] prefixStr = "* + 7 * * 4 6 + 8 9 5 ".split(" ");
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = prefixStr.length - 1; i > -1; i--) {
            {
                String s = prefixStr[i];
                if (s.equals("")) {
                    continue;
                }
                if (s.equals("+")) {
                    stack.push(stack.poll() + stack.poll());
                } else if (s.equals("*")) {
                    stack.push(stack.poll() * stack.poll());
                } else {
                    stack.push(Integer.parseInt(s));
                }

            }
        }
        System.out.println(stack.poll());
    }
}



