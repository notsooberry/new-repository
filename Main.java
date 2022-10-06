import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ValueConverter converter = new ValueConverter();
        Scanner in = new Scanner(System.in);
        System.out.println("ЧИСЛО");
        double number = in.nextDouble();
        System.out.println("Выберите величину, которую хотите конвертировать:");
        System.out.println("1 - Гигакалории в Килокалорий");
        System.out.println("2 - Килокалорий в Гигакалорий");
        System.out.println("3 - Килокалорий в Калорий");
        System.out.println("4 - Калорий в Килокалорий");
        System.out.println("5 - Гривны в Доллары");
        System.out.println("6 - Доллары в Гривны");
        System.out.println("7 - Гривны в Евро");
        System.out.println("8 - Евро в Гривны");
        System.out.println("9 - Килотонны в Тонны");
        System.out.println("10 - Тонны в Килотонны");
        System.out.println("11 - Центнеры в Килограмм");
        System.out.println("12 - Килограмм в Центнер");
        System.out.println("13 - Мегаватт в Киловатт");
        System.out.println("14 - Киловатт в Мегаватт");
        System.out.println("15 - Киловатт в Ватт");
        System.out.println("16 - Ватт в Киловатт");
        System.out.println("17 - Мегаватт в Ватт");
        System.out.println("18 - Ватт в Мегаватт");
        System.out.println("19 - Литр в Миллилитр");
        System.out.println("20 - Миллилитр в Литр");
        System.out.println("21 - Литр в Кубический метр");
        System.out.println("22 - Кубический метр в Литр");
        System.out.println("23 - Кубический сантиметр в Кубический метр");
        System.out.println("24 - Кубический метр в Кубический сантиметр");
        System.out.println("25 - Мегабайт в Килобайт");
        System.out.println("26 - Килобайт в Мегабайт");
        System.out.println("27 - Гигабайт в Гигабит");
        System.out.println("28 - Гигабит в Гигабайт");
        System.out.println("29 - Гектар в Декар");
        System.out.println("30 - Декар в Гектар");
        int choose = in.nextInt();
        switch (choose){
            case 1:
                converter.GigiacaloriesToCalories(number);
                break;
            case 2:
                converter.KilocaloriesToGigiacalories(number);
                break;
            case 3:
                converter.KilocaloriesToCalories(number);
                break;
            case 4:
                converter.CaloriesToKilocalories(number);
                break;
            case 5:
                converter.UAHtoUSD(number);
                break;
            case 6:
                converter.USDtoUAH(number);
                break;
            case 7:
                converter.UAHtoEUR(number);
                break;
            case 8:
                converter.EURtoUAH(number);
                break;
            case 9:
                converter.KilotonToTon(number);
                break;
            case 10:
                converter.TonToKiloton(number);
                break;
            case 11:
                converter.CentsToKillogram(number);
                break;
            case 12:
                converter.KillogramToCents(number);
                break;
            case 13:
                converter.MegawattsToKilowatts(number);
                break;
            case 14:
                converter.KilowattsToMegawatts(number);
                break;
            case 15:
                converter.KilowattToWatt(number);
                break;
            case 16:
                converter.WattToKilowatt(number);
                break;
            case 17:
                converter.MegawattsToWatts(number);
                break;
            case 18:
                converter.WattsToMegawatts(number);
                break;
            case 19:
                converter.LiterToMilliliter(number);
                break;
            case 20:
                converter.MilliliterToLiter(number);
                break;
            case 21:
                converter.LiterToCubicMeter(number);
                break;
            case 22:
                converter.CubicMeterToLiter(number);
                break;
            case 23:
                converter.CubicCentimeterToCubicMeter(number);
                break;
            case 24:
                converter.CubicMeterToCubicCentimeter(number);
                break;
            case 25:
                converter.MegabytesToKilobytes(number);
                break;
            case 26:
                converter.KilobytesToMegabytes(number);
                break;
            case 27:
                converter.GigabyteToGigabit(number);
                break;
            case 28:
                converter.GigabitToGigabyte(number);
                break;
            case 29:
                converter.HectareToDecar(number);
                break;
            case 30:
                converter.DecarToHectare(number);
                break;
        }
    }
}
