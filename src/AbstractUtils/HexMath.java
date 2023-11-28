package AbstractUtils;

import StringUtils.MathFunctions;

public class HexMath extends MathAbstract<String> {

    @Override
    public String add(String hexNumA, String hexNumB) {
        return MathFunctions.addHex(hexNumA,hexNumB);
    }

    @Override
    public String subtract(String hexNumA, String hexNumB) {//(hexNumA-hexNumB)
        return MathFunctions.addHex(hexNumA,hexNumB);
    }

    @Override
    public String multiply(String hexNumA, String hexNumB) {
        return MathFunctions.addHex(hexNumA,hexNumB);
    }

    @Override
    public String divide(String hexNumA, String hexNumB) {//(hexNumA/hexNumB)
        return MathFunctions.addHex(hexNumA,hexNumB);
    }
}
