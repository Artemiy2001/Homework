package home_work_1;

public class NumberFormat {

    public static void main(String[] args) {

        int[] arr = new int[]{6,7,8,2,9,3,4,6,7,2};

        String res = createPhoneNumber(arr);

        System.out.println(res);
    }

    public static String createPhoneNumber(int[] arr){
        StringBuilder phoneNumber = new StringBuilder();
        for (int i = 0; i < arr.length; i++){
            if (i == 0){
                phoneNumber.append("(");
                phoneNumber.append(arr[i]);
            } else if (i == 2) {
                phoneNumber.append(arr[i]);
                phoneNumber.append(") ");
            } else if (i == 5) {
                phoneNumber.append(arr[i]);
                phoneNumber.append("-");
            }else {
                phoneNumber.append(arr[i]);
            }
        }
        return phoneNumber.toString();
    }
}
