import java.util.List;

// The main method must be in a class named "Main".
class binary {
    public static void main(String[] args) {
        List<String> list = List.of("100", "100");
        List<Integer> res = solve(list);

        System.out.println(res.toString());
    }

    public static List<Integer> solve(List<String> topics) {
        int people = topics.size();
        int nbTopics = topics.get(0).length();

        int resTeams = 0;
        int maxVal = 0;

        // finding max
        for (int i = 0; i < topics.size(); i++) {
            for (int j = i + 1; j < topics.size(); j++) {
                Integer int1 = Integer.valueOf(topics.get(i), 2);
                Integer int2 = Integer.valueOf(topics.get(j), 2);
                if ((int1 | int2) > maxVal) {
                    maxVal = int1 | int2;
                }
            }
        }

        // Finding nb teams
        for (int i = 0; i < topics.size(); i++) {
            for (int j = i + 1; j < topics.size(); j++) {
                Integer int1 = Integer.valueOf(topics.get(i), 2);
                Integer int2 = Integer.valueOf(topics.get(j), 2);
                if ((int1 | int2) >= maxVal)
                    resTeams++;
            }
        }


        // 500 is has 9 digit bits
        // so and operator should be with 2^9 = 511
        int nbTopicsRes = maxVal & 511;
        nbTopicsRes = Integer.toBinaryString(nbTopicsRes).length();

        return List.of(resTeams, nbTopicsRes);
    }
}