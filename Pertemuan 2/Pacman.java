public class Pacman{
    int x = 0, y = 0;
    int weidth = 0;
    int height = 0;
    void moveLeft(int a) {
        x = x - a;
    }
    void moveRight(int b){
        x = x + b;
    }
    void moveUp(int c){
        y = y + c;
    }
    void moveDown(int d){
        y = y - d;
    }
    void printPotition(){
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }

}