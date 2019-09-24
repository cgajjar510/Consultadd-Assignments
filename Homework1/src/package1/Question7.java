package package1;


public class Question7 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        double avg;
        avg = (a + b + c) / 3;
        System.out.println("Average is " + avg);
        if ((avg > a) && (avg > b) && (avg > c)) {
            System.out.println("Average is higher than a,b,c");
        } else {
            if ((avg > a) && (avg > b)) {
                System.out.println("Avg is higher than a,b,c");
            } else {
                if ((avg > a) && (avg > c)) {
                    System.out.println("Avg is higher than a,c");
                } else {
                    if ((avg > b) && (avg > c)) {
                        System.out.println("avg is higher than b,c");
                    } else {
                        if (avg > a) {
                            System.out.println("Avg is higher than a");
                        } else {
                            if (avg > b) {
                                System.out.println("avg is high than b");

                            } else {
                                if (avg > c) {
                                    System.out.println("avg is higher than c");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
