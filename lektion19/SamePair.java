import java.util.*;

public record SamePair<T>(T first, T second) {
    public SamePair {
        if (first.getClass() != second.getClass()) {
            throw new IllegalArgumentException("must be exactly the same class");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) { return true; }
        if (obj == null) { return false; }

        if (!(obj instanceof SamePair<?> p)) {
            return false;
        }

        if (Objects.equals(this.first, p.first)) {
            return Objects.equals(this.second, p.second);
        }

        return false;
    }

    @Override
    public int hashCode() {
        // TODO Auto-generated method stub
        return super.hashCode();
    }

}
