public class main3 {
    public static void main(String[] args){
        String first = "Cod";
        String second = "ingal";
        String codingal = first+second;
        String codingalTrick = "Welcome"+"to"+"Codingal";
        String codingalCapital = codingal.toUpperCase();
        String codingalSmall = codingal.toLowerCase();

        int LengthOfCodingal = codingal.length();
        int LengthOfCodingalTrick = codingalTrick.length();
        int sum = LengthOfCodingal + LengthOfCodingalTrick ;


        System.out.println(codingal);
        System.out.println(codingalTrick);
        System.out.println(codingalCapital);
        System.out.println(codingalSmall);
        System.out.println(sum);
    }
}
