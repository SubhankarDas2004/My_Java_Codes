interface Speaker {
    void speak(String text);
}

interface Translator {
    void translate(String text, String language);
}


class AIAssistant implements Speaker, Translator {
    String assistantName;

    AIAssistant(String assistantName) {
        this.assistantName = assistantName;
    }

    public void speak(String text) {
        System.out.println(assistantName + " is speaking:");
        System.out.println("\"" + text + "\"");
        System.out.println("Voice synthesis complete.");
    }

   
    public void translate(String text, String language) {
        System.out.println(assistantName + " is translating to " + language + ":");
        System.out.println("Original: " + text);
        
        String translated = "";
        if(language.equals("Spanish")) {
            translated = "[Translated to Spanish] " + text;
        } 
        else if(language.equals("French")) {
            translated = "[Translated to French] " + text;
        }
        else {
            translated = "[Translated to " + language + "] " + text;
        }
        
        System.out.println("Translated: " + translated);
    }
}

public class a3q6 {
    public static void main(String[] args) {
        AIAssistant ai = new AIAssistant("Muse");
        
        ai.speak("Hello, how can I help you today?");
        
        System.out.println("\n\n");
        

        ai.translate("Good morning", "Spanish");
    }
}