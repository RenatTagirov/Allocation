import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Person person = null;

        String key;
        while (true){
            key = reader.readLine();
            switch (key) {
                case "user" -> person = new User();
                case "loser" -> person = new Loser();
                case "coder" -> person = new Coder();
                case "proger" -> person = new Proger();
            }
            doWork(person);
        }
    }
    public static void doWork(Person person){
        if (person instanceof User){
            User user = (User) person;
            user.live();
        }else if (person instanceof Loser){
            Loser loser = (Loser) person;
            loser.doNothing();
        }else if (person instanceof Coder){
            Coder coder = (Coder) person;
            coder.writeCode();
        }else if (person instanceof Proger){
            Proger proger = (Proger) person;
            proger.enjoy();
        }
    }
}
