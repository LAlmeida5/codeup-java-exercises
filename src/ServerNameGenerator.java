public class ServerNameGenerator {
    public static String[] adjectives =
            {"affable", "amicable", "caring", "thoughtful", "beautiful", "precious", "trustworthy", "irreplaceable", "impressive", "understanding"};

    public static String[] nouns =
            {"time", "person", "year", "way", "day", "thing", "world", "life", "place", "work"};

    public static  int randomNumGen(int min, int max) {
         int randomIndex = (int)Math.floor(Math.random() * max-min) + min;
         return randomIndex;
    }

    public static String serverNameGen(String[] adj, String[] noun) {
         int result = randomNumGen(0, adj.length);
         int result2 = randomNumGen(0, noun.length);
         return adj[result] + "-" + noun[result2];
    }

    public static void main(String[] args) {
        System.out.println(serverNameGen(adjectives, nouns));
    }

}
