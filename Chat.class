
package chat;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;


class Message {

    Message(int par, String string, String hi_Mike_can_you_join_us_for_dinner_tonigh) {
    }
   

    public String generateMessageID() {

        Random random = new Random();

        long number = 1000000000L
                + (long) (random.nextDouble() * 9000000000L);

        return String.valueOf(number);
    }

    public String checkRecipientCell(String cell) {

        if (cell.matches("\\+27\\d{9}")) {

            return "Cell phone number successfully captured.";
        }

        return "Cell phone number is incorrectly formatted or does not contain an international code.";
    }

    public String createMessageHash(String id, int count, String message) {

        if (message.trim().isEmpty()) {

            return "INVALID MESSAGE";
        }

        String[] words = message.trim().split("\\s+");

        String firstWord = words[0];
        String lastWord = words[words.length - 1];

        String hash = id.substring(0, 2)
                + ":" + count
                + ":" + firstWord + lastWord;

        return hash.toUpperCase();
    }

    public void saveMessageToJSON(String id, String hash,
                                  String recipient, String message) {

        try {

            FileWriter writer = new FileWriter("messages.json", true);

            writer.write("{\n");
            writer.write("  \"MessageID\": \"" + id + "\",\n");
            writer.write("  \"MessageHash\": \"" + hash + "\",\n");
            writer.write("  \"Recipient\": \"" + recipient + "\",\n");
            writer.write("  \"Message\": \"" + message + "\"\n");
            writer.write("}\n\n");

            writer.close();

        } catch (IOException e) {

            System.out.println("Error writing to JSON file.");
        }
    }

    

    
}
