
    public class Triangulo {

        double  a1;

        double  a2;

        double  a3;



        public double p() {

            double p = (this.a1 + this.a2 + this.a3) / 2;

            return p;

        }



        public double areadoTriangulo() {

            double p = p();

            double area = Math.sqrt(p * (p- this.a1) * (p- this.a2) * (p- this.a3));

            return area;

        }

        public void areaMaior(double x, double y) {

            if (x > y) { System.out.println("O t1 é maior");}

            else{ System.out.println("O t1 é maior");}









        }





    }

