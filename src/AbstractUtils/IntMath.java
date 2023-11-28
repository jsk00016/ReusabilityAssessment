package AbstractUtils;

public class IntMath extends MathAbstract<Integer> {

	@Override
	public Integer add(Integer a, Integer b) {
		return a+b;
	}

	@Override
	public Integer subtract(Integer a, Integer b) {//(a-b)
		return a-b;
	}

	@Override
	public Integer multiply(Integer a, Integer b) {
		return a*b;
	}

	@Override
	public Integer divide(Integer a, Integer b) {//(a/b)
		return a/b;
	}

}
