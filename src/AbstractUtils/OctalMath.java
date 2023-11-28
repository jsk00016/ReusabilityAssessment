package AbstractUtils;

import StringUtils.MathFunctions;

public class OctalMath extends MathAbstract<String>{


    @Override
    public String add(String octNumA, String octNumB) {
        return MathFunctions.addOctal(octNumA,octNumB);
    }

    @Override
    public String subtract(String octNumA, String octNumB) {//(octNumA-octNumB)
        return MathFunctions.subOctal(octNumA,octNumB);
    }

    @Override
    public String multiply(String octNumA, String octNumB) {
        return MathFunctions.mulOctal(octNumA,octNumB);
    }

    @Override
    public String divide(String octNumA, String octNumB) {//(octNumA/octNumB)
        return MathFunctions.divOctal(octNumA,octNumB);
    }
}
