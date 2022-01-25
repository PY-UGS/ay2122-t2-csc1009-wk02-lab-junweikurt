public class Q3 {
    public static void main(String[] args) { 
        long currentMillis = System.currentTimeMillis();
        long currentSec = currentMillis / 1000;
        long displaySec = currentSec % 60;
        long currentMin = currentSec / 60;
        long displayMin = currentMin % 60;
        long currentHr = currentMin / 60;
        long displayHr = currentHr % 24;

        System.out.format("Current time is %d:%d:%d GMT", 
            displayHr,
            displayMin,
            displaySec);
        
    }
}
