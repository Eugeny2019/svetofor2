import static java.lang.Thread.sleep;

public class Color implements Runnable {
    String color;
    int luminescenceTime = 1; //в минутах
    int multiplier = 600; //60000 для преобразования в милисекунды, 600 - чтобы по-меньше ждать

    public Color(String color, int luminescenceTime){
        this.color = color;
        this.luminescenceTime = luminescenceTime;
    }
    @Override
    public void run() {
        try {
            System.out.println("Горит " + color);
            sleep(luminescenceTime * multiplier);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
