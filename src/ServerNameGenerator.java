public class ServerNameGenerator {
    public static String[] adj = {
            "Adorable",
            "Delightful",
            "Impossible",
            "Scary",
            "Quaint",
            "Obedient",
            "Funny",
            "Clumsy",
            "Dark",
            "Zealous"
    };
    public static String[] noun = {
            "Ice",
            "Lion",
            "Nest",
            "Oil",
            "School",
            "Machine",
            "Parrot",
            "Eyeball",
            "Girlfriend",
            "Pool"
    };

    public static String randomString(String[] array){
//        Random rnd = new Random();
//        return array[rnd.nextInt(array.length)];
        return array[(int)Math.floor(Math.random() * array.length)-1];
    }

    public static void main(String[] args) {
        System.out.println("Here is your server name:\n"+randomString(adj).toLowerCase() +
                "-" + randomString(noun).toLowerCase());
    }
}
