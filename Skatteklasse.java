public class Skatteklasse {

    public static void main(String[] args) {

        int indkomst = 120000;
        int personfradrag = 33400;
        double ambi,pension,bundskat;

        ambi = indkomst * 8.0 /100;
        pension = indkomst * 1.0/100;



        bundskat = ((indkomst-(ambi+pension+personfradrag))*0.07);

        System.out.println(bundskat);

        //System.out.println(ambi);
        //System.out.println(pension);




 }
}
