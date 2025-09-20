import java.util.Scanner;
public class TrianguloPrincipal {







        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            Triangulo t1 = new Triangulo();

            Triangulo t2 = new Triangulo();




            System.out.print("Inf o primeiro lado do T1: ");
            t1.a1 = sc.nextDouble();
            System.out.print("Inf o segundo lado do T1: ");
            t1.a2 = sc.nextDouble();
            System.out.print("Inf o terceiro lado do T1: ");
            t1.a3 = sc.nextDouble();
            System.out.println("-------------------------------------");

            System.out.print("Inf o primeiro lado do T2: ");
            t2.a1 = sc.nextDouble();
            System.out.print("Inf o segundo lado do T2: ");
            t2.a2 = sc.nextDouble();
            System.out.print("Inf o terceiro lado do T2: ");
            t2.a3 = sc.nextDouble();


            double areaT1 = t1.p();

            double areaT2 = t2.p();


            t1.areaMaior(areaT1, areaT2);


            System.out.println("Valor de T1 :" + areaT1);

            System.out.println("Valor de T2 :" + areaT2);


        }


    }
