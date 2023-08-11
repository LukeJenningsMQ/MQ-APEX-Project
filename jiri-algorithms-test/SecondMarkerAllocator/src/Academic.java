import java.util.ArrayList;

public class Academic {
    String name;
    ArrayList<ThesisTopic> involvedThesisTopics = new ArrayList<ThesisTopic>();

    public Academic(String name) {
        this.name = name;
    }

    public void addTopic(ThesisTopic topic) {
        involvedThesisTopics.add(topic);
    }

    public double getScore(Profession profession) {
        double score = 0;
        for (int i = 0; i < involvedThesisTopics.size(); i++) {
            score += involvedThesisTopics.get(i).hasProfession(profession);
        }
        score /= involvedThesisTopics.size();
        return score;
    }

    public void printTopics() {
        System.out.println(name + " is supervising:");
        for (int i = 0; i < involvedThesisTopics.size(); i++) {
            involvedThesisTopics.get(i).print();
        }
    }

    public void printScore(Profession profession) {
        System.out.print(name + " has a score of " + getScore(profession) + " in professions: ");
        printProfession(profession);
        System.out.println();
    }

    public void printProfession(Profession profession) {
        switch (profession) {
            case SOFTWARE_ENGINEERING:
                System.out.print("SE");
                break;
            case MECHANICAL_ENGINEERING:
                System.out.print("ME");
                break;
            case GABAGOO:
                System.out.println("GG");
                break;
            case WABADOO:
                System.out.println("WD");
                break;
        }
    }
}
