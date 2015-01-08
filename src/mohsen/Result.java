package mohsen;

import java.util.HashSet;

public class Result {
    HashSet[][] matrix;
    boolean status;

    public Result(HashSet[][] matrix, boolean status) {
        this.matrix = matrix;
        this.status = status;
    }

    public HashSet[][] getMatrix() {
        return matrix;
    }

    public boolean getStatus() {
        return status;
    }
}
