package AbstractUtils;

import StringUtils.MathFunctions;

public class BinaryMath extends MathAbstract<String>{

    @Override
    public String add(String binNumA, String binNumB) {
        return MathFunctions.addBinary(binNumA,binNumB);
    }

    @Override
    public String subtract(String binNumA, String binNumB) {//(binNumA-binNumB)
        return MathFunctions.subBinary(binNumA,binNumB);
    }

    @Override
    public String multiply(String binNumA, String binNumB) {
        return MathFunctions.mulBinary(binNumA,binNumB);
    }

    @Override
    public String divide(String binNumA, String binNumB) {//(binNumA/binNumB)
        return MathFunctions.divBinary(binNumA,binNumB);
    }
}
