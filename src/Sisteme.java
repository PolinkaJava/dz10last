import java.util.Objects;

public class Sisteme {
    String name;
    double r;


    public Sisteme(String name, double r) {
        this.name = name;
        this.r = r;

    }

    @Override
    public String toString() {
        return "Sistema{" +
                "name='" + name + '\'' +
                ", r=" + r +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sisteme sistema = (Sisteme) o;
        return Double.compare(r, sistema.r) == 0 && Objects.equals(name, sistema.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, r);
    }
}