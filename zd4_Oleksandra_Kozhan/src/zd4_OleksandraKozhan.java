import java.util.Random;

public class zd4_OleksandraKozhan {

    public static void main(String args[]) {
        Random nieparzystą_OleksandraKozhan = new Random();
        int maximum_OleksandraKozhan = 100;
        int minimum_OleksandraKozhan = 50;
        if(maximum_OleksandraKozhan % 2 == 1) maximum_OleksandraKozhan = maximum_OleksandraKozhan + 1;
        if(minimum_OleksandraKozhan % 2 == 0) minimum_OleksandraKozhan = minimum_OleksandraKozhan - 1;
        int range_OleksandraKozhan = (maximum_OleksandraKozhan - minimum_OleksandraKozhan + 1) / 2;
        int randomNum_nieparzystą_OleksandraKozhan =  nieparzystą_OleksandraKozhan.nextInt(range_OleksandraKozhan) * 2 + minimum_OleksandraKozhan;
        System.out.println("Wybieramy nieparzystą liczbę całkowitą za pomocą Random,");
        System.out.println();
        System.out.println("Mamy "+randomNum_nieparzystą_OleksandraKozhan+" klocków Lego");
        System.out.println();

        Random parzystą_OleksandraKozhan = new Random();
        int Low = 5;
        int High = 10;
        int randomNumber_OleksandraKozhan = parzystą_OleksandraKozhan.nextInt(High-Low) + Low;
        if(randomNumber_OleksandraKozhan % 2 != 0){
            randomNumber_OleksandraKozhan = randomNumber_OleksandraKozhan + 1;
        }
        System.out.println(randomNumber_OleksandraKozhan+" klocków Lego mieści się w jednym pojemniku");
        System.out.println();
        System.out.println("Mamy " + randomNum_nieparzystą_OleksandraKozhan/randomNumber_OleksandraKozhan + " pełnych pojemników" +
                " i jeden niekompletny, w którym: " + randomNum_nieparzystą_OleksandraKozhan%randomNumber_OleksandraKozhan + " klocków");

    }
}

