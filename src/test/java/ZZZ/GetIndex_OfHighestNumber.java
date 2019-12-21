package ZZZ;

import java.util.List;

public class GetIndex_OfHighestNumber {

    public static void main(String[] args) {

        //int[] values = {2,117,8,64,77};
        int[] values = {-1, -2};
        int index = 0;
        if (values.length >0) {
            int value = values[0];
            for (int i = 1; i < values.length; i++) {
                if (value < values[i]) {
                    value = values[i];
                    index = i;
                }
            }
            //System.out.println("Value : " + value);
        } else {
            index = -1;
        }
        System.out.println("Index : " + index);
    }


}
