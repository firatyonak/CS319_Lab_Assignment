import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ArrayList1 = new ArrayList<Integer>();
        ArrayList1.add(100);
        ArrayList1.add(500);
        ArrayList1.add(900);
        ArrayList<Integer> ArrayList2 = new ArrayList<Integer>();
        ArrayList2.add(800);
        ArrayList2.add(600);
        ArrayList2.add(300);
        ArrayList<Integer> ArrayList3 = new ArrayList<Integer>();
        ArrayList3.add(400);
        ArrayList3.add(700);
        ArrayList3.add(200);
        ArrayOrganizer org = new ArrayOrganizer();
        org.concatAndSort(ArrayList1,ArrayList2,ArrayList3);
        Player Tom = new Player("Tom");
        Player John = new Player("John");
        Player James = new Player("James");
        Player Henry = new Player("Henry");
        Die die = new Die();
        for ( int i = 0; i < 5; i++){
            for ( int j = 0; j < 4; i++){
                if( j == 0){
                    Tom.addScore(die.rollDie());
                }
                else if( j == 1){
                    John.addScore(die.rollDie());
                }
                else if( j == 2){
                    James.addScore(die.rollDie());
                }
                else{
                    Henry.addScore(die.rollDie());
                }

            }
        }
        Tom.toString();
        John.toString();
        James.toString();
        Henry.toString();
        System.out.println("Successfully reverted in Git");

    }
}
