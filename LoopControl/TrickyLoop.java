package LoopControl;
    public class TrickyLoop {
    static boolean check(char c) {
        System.out.print(c);
        return true;
    }

    public static void main(String[] args) {
        int i = 0;
        for (check('A'); check('B') && (i < 2); check('C')) {
            i++;
            check('D');
        }
    }
}

