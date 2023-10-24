import java.util.*;

public class EnumTest {
    private static enum TestEnum {
        BOSSE, NISSE, LENA
    }

    public static void main(String[] args) {
        System.out.println(TestEnum.BOSSE);
        System.out.println(TestEnum.LENA);

        System.out.println(TestEnum.BOSSE.ordinal());
        System.out.println(TestEnum.LENA.ordinal());

        System.out.println(Arrays.toString(TestEnum.values()));
        System.out.println(TestEnum.values());
    }
}
