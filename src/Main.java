
public class Main {

    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 1, 2};

        FourSum fs = new FourSum(a);

        System.out.println(fs.existDistinctIndices());
    }
}
