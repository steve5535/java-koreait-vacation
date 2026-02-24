package _27_Lambda;

@FunctionalInterface
public interface PersonModifier<R> {
    R modify(Person p);
}
