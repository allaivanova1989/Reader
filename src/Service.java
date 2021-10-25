
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Service {
    public void getFromConsole() {


        String text = " Марс — четвёртая по удалённости от Солнца (после Меркурия, Венеры и Земли) и седьмая по размеру (превосходит по массе и диаметру только Меркурий) планета Солнечной системы. Масса Марса составляет 0,107 массы Земли, объём — 0,151 объёма Земли, а средний линейный диаметр — 0,53 диаметра Земли. Рельеф Марса обладает многими уникальными чертами. Марсианский потухший вулкан гора Олимп — самая высокая известная гора на планетах Солнечной системы (самая высокая известная гора в Солнечной системе — на астероиде Веста), а долины Маринер — самый крупный известный каньон на планетах (самый большой каньон в Солнечной системе обнаружен на спутнике Плутона — Хароне). Помимо этого, южное и северное полушария планеты радикально отличаются по рельефу; существует гипотеза, что Великая Северная равнина, занимающая 40 % поверхности планеты, является импактным кратером; в этом случае она оказывается самым крупным известным ударным кратером в Солнечной системе.";
        try {
            FileWriter fileWriter = new FileWriter("/Users/SpecFason8/pewFile/logfile");
            fileWriter.write(text);
            fileWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
    public void readFromFile() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("/Users/SpecFason8/pewFile/logfile"));
            String s = br.readLine();
            br.close();

            Pattern pattern = Pattern.compile("З.+?и");

            Matcher matcher = pattern.matcher(s);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                System.out.println(matcher.replaceAll("НАШЕЙ ПЛАНЕТЫ"));

            }
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }

}
