import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Svetofor {

    private String[] colors = {"зеленый", "желтый", "красный"};
    private Color[] svetofor = new Color[colors.length];

    public void init() { //без проверок на правильность введения, надо правильно вводить целые цифры
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        for (int i = 0; i < colors.length; i++) {
            System.out.println("Введите длительность (в минутах) горения для цвета \"" + colors[i] + "\": ");
            try {
                String line = bufferedReader.readLine();
                svetofor[i] = new Color(colors[i], Integer.parseInt(line));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void start(){
        for (Color color : svetofor) {
            color.run();
        }
    }



}
