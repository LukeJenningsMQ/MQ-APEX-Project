import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Academic> academics = new ArrayList<Academic>();
        academics.add(new Academic("Rex"));
        academics.add(new Academic("Nick"));
        academics.add(new Academic("Hazer"));

        ArrayList<ThesisTopic> thesisTopics = new ArrayList<ThesisTopic>();
        thesisTopics.add(new ThesisTopic("I love Software Engineering", "Research your love for Software Engineering", Profession.SOFTWARE_ENGINEERING));
        thesisTopics.add(new ThesisTopic("SE0", "epicSETIME", Profession.SOFTWARE_ENGINEERING));
        thesisTopics.add(new ThesisTopic("SE1", "epicSETIME", Profession.SOFTWARE_ENGINEERING));
        thesisTopics.add(new ThesisTopic("SE2", "epicSETIME", Profession.SOFTWARE_ENGINEERING));
        thesisTopics.add(new ThesisTopic("SE3", "epicSETIME", Profession.SOFTWARE_ENGINEERING));
        thesisTopics.add(new ThesisTopic("ME0", "epicMETIME", Profession.MECHANICAL_ENGINEERING));
        thesisTopics.add(new ThesisTopic("ME1", "epicMETIME", Profession.MECHANICAL_ENGINEERING));
        thesisTopics.add(new ThesisTopic("ME2", "epicMETIME", Profession.MECHANICAL_ENGINEERING));
        thesisTopics.add(new ThesisTopic("SEME0", "epicSEMETIME", new Profession[] {Profession.SOFTWARE_ENGINEERING, Profession.MECHANICAL_ENGINEERING}));
        thesisTopics.add(new ThesisTopic("SEME1", "epicSEMETIME", new Profession[] {Profession.SOFTWARE_ENGINEERING, Profession.MECHANICAL_ENGINEERING}));
        thesisTopics.add(new ThesisTopic("SEME2", "epicSEMETIME", new Profession[] {Profession.SOFTWARE_ENGINEERING, Profession.MECHANICAL_ENGINEERING}));
    
        for (int i = 0; i < 4; i++) {
            academics.get(0).addTopic(thesisTopics.get(i));
        }

        for (int i = 4; i < 7; i++) {
            academics.get(1).addTopic(thesisTopics.get(i));
        }

        for (int i = 7; i < 11; i++) {
            academics.get(2).addTopic(thesisTopics.get(i));
        }

        for (int i = 0; i < academics.size(); i++) {
            academics.get(i).printTopics();
            System.out.println();
        }

        academics.get(0).printScore(Profession.SOFTWARE_ENGINEERING);
        academics.get(1).printScore(Profession.SOFTWARE_ENGINEERING);
        academics.get(2).printScore(Profession.SOFTWARE_ENGINEERING);
    }
}
