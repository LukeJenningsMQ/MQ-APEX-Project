import java.util.ArrayList;

public class ThesisTopic {
    String title;
    String desc;
    ArrayList<Profession> professions = new ArrayList<Profession>();


    public ThesisTopic(String title, String desc, Profession newPro) {
        this.title = title;
        this.desc = desc;

        professions.add(newPro);
    }

    public ThesisTopic(String title, String desc, Profession[] newPro) {
        this.title = title;
        this.desc = desc;

        for (int i = 0; i < newPro.length; i++) {
            professions.add(newPro[i]);
        }
    }

    public void addProfession(Profession newPro) {
        professions.add(newPro);
    }

    public void print() {
        System.out.print(title + " " + desc);

        for (int i = 0; i < professions.size(); i++) {
            Profession pro;
            switch (professions.get(i)) {
                case SOFTWARE_ENGINEERING:
                    System.out.print(", SE");
                    break;
                case MECHANICAL_ENGINEERING:
                    System.out.print(", ME");
                    break;
                case GABAGOO:
                    System.out.println(", GG");
                    break;
                case WABADOO:
                    System.out.println(", WD");
                    break;
            }
        }
        System.out.println();
    }

    public int hasProfession(Profession profession) {
        for (int i = 0; i < professions.size(); i++) {
            if (professions.get(i) == profession) {
                return 1;
            }
        }
        return 0;
    }
}
