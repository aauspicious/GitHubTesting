class NumberToWord {
    public static void main(String[] args) {
        String[] arr = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
                "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Ninteen" };

        String[] tens = { "", "Ten", "Twenty", "Thirty", "Fourthy", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety",
                "Hundred" };

        // System.out.println(java.util.Arrays.toString(arr));
        int num = 94;
        
       
        System.out.println();
        if (num < 1 && num > 1000) {
            System.out.println("INVALID INPUT");
        } else {
            int a = num % 10; // 0
            int b = num / 10; // 2
            int c = b % 10; // 2
            int d = num / 100;
            if (num < 20) {
                System.out.println(arr[num]);
            } else if (num >= 20 && num <= 100) {
                System.out.println(tens[c] + " " + arr[a]);
            }
        }

    }

}