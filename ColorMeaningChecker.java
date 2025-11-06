import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ColorMeaningChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Define color meanings using a HashMap
        Map<String, String> colorMeanings = new HashMap<>();
        colorMeanings.put("red", "Represents energy, passion, and love ❤️");
        colorMeanings.put("blue", "Symbolizes calmness, trust, and intelligence 💙");
        colorMeanings.put("green", "Represents nature, growth, and harmony 💚");
        colorMeanings.put("yellow", "Symbolizes happiness, optimism, and positivity 💛");
        colorMeanings.put("orange", "Represents enthusiasm, creativity, and warmth 🧡");
        colorMeanings.put("purple", "Symbolizes luxury, power, and ambition 💜");
        colorMeanings.put("black", "Represents elegance, mystery, and strength 🖤");
        colorMeanings.put("white", "Symbolizes purity, simplicity, and peace 🤍");
        colorMeanings.put("pink", "Represents love, kindness, and compassion 💗");
        colorMeanings.put("brown", "Symbolizes stability, reliability, and comfort 🤎");

        System.out.println("==========================================");
        System.out.println("     🎨 COLOR MEANING CHECKER (JAVA)");
        System.out.println("==========================================");

        while (true) {
            System.out.print("\nEnter a color name (or type 'exit' to quit): ");
            String color = sc.nextLine().trim().toLowerCase();

            if (color.equals("exit")) {
                System.out.println("👋 Exiting... Stay colorful!");
                break;
            }

            if (colorMeanings.containsKey(color)) {
                System.out.println("💡 Meaning of " + color.substring(0, 1).toUpperCase() + color.substring(1) + ":");
                System.out.println(colorMeanings.get(color));
            } else {
                System.out.println("⚠️ Sorry, color not found in database. Try another color!");
            }
        }

        sc.close();
    }
}
