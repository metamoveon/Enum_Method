
package learningjavabasic;
public class Program {
    public static void main(String[] args) {
        enum grade{
            A,B,C,D,E,F;
            double getPoint(){  //buid method in enum
                return switch (this){
                    case A -> 4.0;
                    case B -> 3.0;
                    case C -> 2.0;
                    case D -> 1.0;
                    default -> 0.0;
                };
            }
        }
        
        grade mygrade = grade.A;
        System.out.println("Grade = "+mygrade+" , "+mygrade.getPoint());
    }

}
