package home_work_4;

public class StringComparatorByAlphabet implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
        o1 = o1.toLowerCase();
        o2 = o2.toLowerCase();
        if (o1.equals(o2)){
            return 0;
        }
        byte[] v1 = o1.getBytes();
        byte[] v2 = o2.getBytes();

        for (int i = 0; i < v1.length && i < v2.length; i++){
            if (v1[i] - v2[i] == 0){
                continue;
            }
            if (v1[i] - v2[i] < 0){
                return -1;
            }else {
                return 1;
            }
        }

        return 0;
    }
}
