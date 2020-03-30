package lv.javaguru.homework.lesson6.level1;

//lieto "crtl + alt + l"
public class NumberService{

    public int sumInRange(int first, int second) {
        int sum = 0;
        //šie mainīgie nav nepieciešami, jo ciklā ir savi mainīgie
        //un pārbaudīt vari arī parametru vai nosacījum izpildās
        int from;
        int to;
        if (first < second) {
            from = first;
            to = second;
        } else {
            from = second;
            to = first;
        }

        //šo var iznest atsevišķā metodē un izmantot to atkārtoti
        //samainot "from" un "to" vietām
        for (int i = from; i <= to; i++) {
            sum = sum + i;
        }


        return sum;
    }

    public int getEvenNumberCount(int first, int second) {
        int count = 0;
        //šie mainīgie nav nepieciešami, jo ciklā ir savi mainīgie
        //un pārbaudīt vari arī parametru vai nosacījum izpildās
        int from;
        int to;
        if (first < second) {
            from = first;
            to = second;
        } else {
            from = second;
            to = first;
        }
        //šo var iznest atsevišķā metodē un izmantot to atkārtoti
        //samainot "from" un "to" vietām
        for (int i = from; i <= to; i++) {
            if(i%2==0){
                count++;
            }
        }

        return count;
    }
}
