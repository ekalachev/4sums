import java.util.HashMap;

public class FourSum {
    private final HashMap<Integer, PairNumSum> sums;

    public FourSum(int[] a) {
        int n = a.length;

        this.sums = new HashMap<>();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                PairNumSum ps = new PairNumSum(a[i], a[j]);
                this.sums.put(ps.getSum(), ps);
            }
        }
    }

    public boolean existDistinctIndices() {
        return this.sums.size() > 1;
    }
}
