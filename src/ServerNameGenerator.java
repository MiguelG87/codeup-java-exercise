public class ServerNameGenerator {
    private static String[] adjectives = {"strict", "jumbled", "adamant", "bustling", "aggressive", "savory", "unadvised", "medical", "foreign", "aboard"};
    private static String[] nouns = {"method", "volume", "tension", "power", "ad", "exam", "basis", "negotiation", "baseball", "childhood"};
    private static String randomElement(String[] strings){
        int randomNumber = (int) (Math.random() * strings.length);
        return strings[randomNumber];
    }
    public static void main(String[] args){
        String adj = randomElement(adjectives);
        String noun = randomElement(nouns);
        System.out.println("Here is your server name: ");
        System.out.println(adj + "-" + noun);
    }
}
