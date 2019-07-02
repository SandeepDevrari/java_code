import java.util.Stack;
public class JavaStack_Example{
    public JavaStack_Example(){
        Stack<Integer> stack=new Stack<>();
        stack.push(2);
        stack.push(1);
        stack.push(77);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.empty());
        System.out.println(stack.search(44));
    }
    public static void main(String[] args){
        new JavaStack_Example();
    }
}