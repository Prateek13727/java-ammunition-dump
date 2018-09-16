public class Main {
    public static void main(String[] args) {
    	Counter counter = new Counter("count-tracker");
    	counter.Increment();
    	System.out.println(counter.getCurrentValue());
    	System.out.println(counter.toString());
    }
}
