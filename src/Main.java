import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(summer());
    }

    public static double invalidChecker(double min, double max) {
        double counter = 0.0;
        int counter2 = 0;
        int length;
        String str = "";
        int amt = 0;
        boolean setTrue = false;
        for (double i = min; i <= max; i++) {
            setTrue = false;
            str = new BigDecimal(i).stripTrailingZeros().toPlainString();
            length = str.length();
                for (int j = 1; j <= length / 2 ; j++) {
                    amt = length / j;
                    counter2 = 0;
                    if (length % j == 0) {
                        for (int l = 0; l <= amt - 2; l++) {
                            if (str.substring(l * j, (l + 1) * j).equals(str.substring((l + 1) * j, (l + 2) * j)) ) {
                                //System.out.println(str.substring(l * j, (l + 1) * j));
                                //System.out.println("-------");
                                //System.out.println(str.substring((l + 1) * j, (l + 2) * j));
                                counter2++;
                            }
                        }
                        if (counter2 == amt - 1) {
                            setTrue = true;
                        }
                    }


                }
                if (setTrue) {
                    counter += i;
                }
        }
        return counter;
    }

    public static BigDecimal summer() {
        double sum = 0;
        sum += invalidChecker(3335355312.0, 3335478020.0);
        sum += invalidChecker(62597156,62638027);
        sum += invalidChecker(94888325,95016472);
        sum += invalidChecker(4653,6357);
        sum += invalidChecker(54,79);
        sum += invalidChecker(1,19);
        sum += invalidChecker(314,423);
        sum += invalidChecker(472,650);
        sum += invalidChecker(217886,298699);
        sum += invalidChecker(58843645,58909745);
        sum += invalidChecker(2799,3721);
        sum += invalidChecker(150748,178674);
        sum += invalidChecker(9084373,9176707);
        sum += invalidChecker(1744,2691);
        sum += invalidChecker(17039821,17193560);
        sum += invalidChecker(2140045,2264792);
        sum += invalidChecker(743,1030);
        sum += invalidChecker(6666577818.0,6666739950.0);
        sum += invalidChecker(22946,32222);
        sum += invalidChecker(58933,81008);
        sum += invalidChecker(714665437,714803123);
        sum += invalidChecker(9972438,10023331);
        sum += invalidChecker(120068,142180);
        sum += invalidChecker(101,120);
        sum += invalidChecker(726684,913526);
        sum += invalidChecker(7575737649.0,7575766026.0);
        sum += invalidChecker(8200,11903);
        sum += invalidChecker(81,96);
        sum += invalidChecker(540949,687222);
        sum += invalidChecker(35704,54213);
        sum += invalidChecker(991404,1009392);
        sum += invalidChecker(335082,425865);
        sum += invalidChecker(196,268);
        sum += invalidChecker(3278941,3383621);
        sum += invalidChecker(915593,991111);
        sum += invalidChecker(32,47);
        sum += invalidChecker(431725,452205);
        return BigDecimal.valueOf(sum);


    }
}


