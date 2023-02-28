public class BalancoTrimestral {

    public static void main(String args[]) {

     int gastoJaneiro = 15000;
     int gastoFevereiro = 23000;
     int gastoMarço = 17000;
     int gastoTrimestre;

     gastoTrimestre=gastoJaneiro+gastoFevereiro+gastoMarço;

     int media = gastoTrimestre/3 ;

    System.out.println("Os gastos do trimestre são: R$ "+ gastoTrimestre );
    System.out.println("A média dos gastos do trimestre são: R$ "+ media );

    }
    }