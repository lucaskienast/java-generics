package exercises.oracle.ex10;

public class Main {

    public static void main(String[] args) {
        Node<? extends Shape> nc = new SubNode<Circle>();
        SubNode<? extends Shape> ns = (SubNode<? extends Shape>) nc;
    }

}
