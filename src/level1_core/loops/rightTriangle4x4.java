package level1_core.loops;

public class rightTriangle4x4 {
    public static void main(String [] args){
        for(int i=1; i <= 4; i++){
            for(int j=1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
