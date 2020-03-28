package lv.javaguru.homework.lesson6.level1;

public class NumberService{

    public int sumInRange(int first, int second) {
        int sum = 0;
        int from;
        int to;
        if (first < second) {
            from = first;
            to = second;
        } else {
            from = second;
            to = first;
        }
        for (int i = from; i <= to; i++) {
            sum = sum + i;
        }


        return sum;
    }

    public int getEvenNumberCount(int first, int second) {
        int count = 0;
        int from;
        int to;
        if (first < second) {
            from = first;
            to = second;
        } else {
            from = second;
            to = first;
        }
        for (int i = from; i <= to; i++) {
            if(i%2==0){
                count++;
            }
        }

        return count;
    }
}
