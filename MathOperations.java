public class MathOperations {
    public static void main(String[] args) {
        // 1. Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. Unary Operators (pre/post increment)
        int x = 10;
        System.out.println("\nUnary Operators:");
        System.out.println("x = " + x);
        System.out.println("Post-increment x++ = " + (x++));
        System.out.println("After post-increment x = " + x);
        System.out.println("Pre-increment ++x = " + (++x));

        // 3. Assignment Operators
        int c = 20;
        System.out.println("\nAssignment Operators:");
        System.out.println("c = " + c);
        c += 5;
        System.out.println("c += 5 -> " + c);
        c -= 3;
        System.out.println("c -= 3 -> " + c);
        c *= 2;
        System.out.println("c *= 2 -> " + c);
        c /= 2;
        System.out.println("c /= 2 -> " + c);
        c %= 4;
        System.out.println("c %= 4 -> " + c);

        // 4. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("a >= b = " + (a >= b));
        System.out.println("a <= b = " + (a <= b));
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));

        // 5. Logical Operators
        boolean p = true;
        boolean q = false;
        System.out.println("\nLogical Operators:");
        System.out.println("p && q = " + (p && q));
        System.out.println("p || q = " + (p || q));
        System.out.println("!p = " + (!p));

        // 6. Ternary Operator
        System.out.println("\nTernary Operator:");
        int max = (a > b) ? a : b;
        System.out.println("Max between a and b = " + max);
    }
}

