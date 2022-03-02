public class PacmanMain{
    public static void main(String[] args) {
        Pacman p1 = new Pacman();
        p1.moveLeft(1);
        p1.moveRight(10);
        p1.moveDown(5);
        p1.moveUp(7);
        p1.printPotition();
    }
}