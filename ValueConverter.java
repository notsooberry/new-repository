class ValueConverter {
    public void GigiacaloriesToCalories(double number){
        number = number * 1000000;
        System.out.println("Гигакалории в Килокалорий: " + number);
    }
    public void KilocaloriesToGigiacalories(double number){
        number = number / 1000000;
        System.out.println("Килокалорий в Гигакалорий: " + number);
    }

    public void KilocaloriesToCalories(double number){
        number = number * 1000;
        System.out.println("Килокалорий в Калорий: " + number);
    }
    public void CaloriesToKilocalories(double number){
        number = number / 1000;
        System.out.println("Калорий в Килокалорий: " + number);
    }

    public void UAHtoUSD(double number){
        number = number * 0.034;
        System.out.println("Гривны в Доллары: " + number);
    }
    public void USDtoUAH(double number){
        number = number / 0.034;
        System.out.println("Доллары в Гривны: " + number);
    }

    public void UAHtoEUR(double number){
        number = number * 0.032;
        System.out.println("Гривны в Евро: " + number);
    }
    public void EURtoUAH(double number){
        number = number / 0.032;
        System.out.println("Евро в Гривны: " + number);
    }

    public void KilotonToTon(double number){
        number = number * 1000;
        System.out.println("Килотонны в Тонны: " + number);
    }
    public void TonToKiloton(double number){
        number = number / 1000;
        System.out.println("Тонны в Килотонны: " + number);
    }

    public void CentsToKillogram(double number){
        number = number * 100;
        System.out.println("Центнеры в Килограмм: " + number);
    }
    public void KillogramToCents(double number){
        number = number / 100;
        System.out.println("Килограмм в Центнер: " + number);
    }

    public void MegawattsToKilowatts(double number){
        number = number * 1000;
        System.out.println("Мегаватт в Киловатт: " + number);
    }
    public void KilowattsToMegawatts(double number){
        number = number / 1000;
        System.out.println("Киловатт в Мегаватт: " + number);
    }

    public void KilowattToWatt(double number){
        number = number * 1000;
        System.out.println("Киловатт в Ватт: " + number);
    }
    public void WattToKilowatt(double number){
        number = number / 1000;
        System.out.println("Ватт в Киловатт: " + number);
    }

    public void MegawattsToWatts(double number){
        number = number * 1000000;
        System.out.println("Мегаватт в Ватт: " + number);
    }
    public void WattsToMegawatts(double number){
        number = number / 1000000;
        System.out.println("Ватт в Мегаватт: " + number);
    }

    public void LiterToMilliliter(double number){
        number = number * 1000;
        System.out.println("Литр в Миллилитр: " + number);
    }
    public void MilliliterToLiter(double number){
        number = number / 1000;
        System.out.println("Миллилитр в Литр: " + number);
    }

    public void LiterToCubicMeter(double number){
        number = number * 0.001;
        System.out.println("Литр в Кубический метр: " + number);
    }
    public void CubicMeterToLiter(double number){
        number = number / 0.001;
        System.out.println("Кубический метр в Литр: " + number);
    }

    public void CubicCentimeterToCubicMeter(double number){
        number = number * 0.000001;
        System.out.println("Кубический сантиметр в Кубический метр: " + number);
    }
    public void CubicMeterToCubicCentimeter(double number){
        number = number / 0.000001;
        System.out.println("Кубический метр в Кубический сантиметр: " + number);
    }

    public void MegabytesToKilobytes(double number){
        number = number * 1024;
        System.out.println("Мегабайт в Килобайт: " + number);
    }
    public void KilobytesToMegabytes(double number){
        number = number / 1024;
        System.out.println("Килобайт в Мегабайт: " + number);
    }

    public void GigabyteToGigabit(double number){
        number = number * 8;
        System.out.println("Гигабайт в Гигабит: " + number);
    }
    public void GigabitToGigabyte(double number){
        number = number / 8;
        System.out.println("Гигабит в Гигабайт: " + number);
    }

    public void HectareToDecar(double number){
        number = number * 10;
        System.out.println("Гектар в Декар: " + number);
    }
    public void DecarToHectare(double number){
        number = number / 10;
        System.out.println("Декар в Гектар: " + number);
    }
}