public class Sum2 {

        public static void main(String[] args) {
            double sum = 0;
            for (String arg : args) {
                if (arg.matches("-?\\d+(\\.\\d+)?")) {
                    sum += Double.parseDouble(arg);
                }
            }
            System.out.println(sum);
        }
    }

