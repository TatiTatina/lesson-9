public class Sauce {
    private String name;
    private String spiciness;

    public Sauce(String name, String spiciness) {
        this.name = name;
        if (!spiciness.equals("очень острый") && !spiciness.equals("острый") && !spiciness.equals("не острый")) {
            throw new IllegalArgumentException("Invalid spiciness level");
        }
        this.spiciness = spiciness;
    }

    @Override
    public String toString() {
        return "Соус " + name + ": " + spiciness;
    }
}

