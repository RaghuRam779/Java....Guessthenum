import java.sql.SQLOutput;
import java.util.Scanner;

public class tlsulee {
    public static void main(String[] args){
//        Topics: intro, data types, variables, operators, input/output.
//                Mini-task: Write simple calculator & temperature converter.;
        Scanner sc=new Scanner(System.in);

        String operator ="-";

        System.out.println("okanumber anuko :");
        int bhav= sc.nextInt();
        System.out.println("inkonumber anuko :");
        int pav= sc.nextInt();
        if (operator=="+") {
            int sum = bhav + pav;
            System.out.println(sum);
        }
        if (operator=="-") {
            int diff = bhav - pav;
            System.out.println(diff);
        }
        if (operator=="*") {
        int mul = bhav + pav;
        System.out.println(mul);}

        if (operator=="/") {
        int div = bhav + pav;
        System.out.println(div);
        }


    }
}
