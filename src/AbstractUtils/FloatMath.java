package AbstractUtils;

public class FloatMath extends MathAbstract<Float> {

	@Override
	public Float add(Float a, Float b) {
		return a+b;
	}

	@Override
	public Float subtract(Float a, Float b) {//(a-b)
		return a-b;
	}

	@Override
	public Float multiply(Float a, Float b) {
		return a*b;
	}

	@Override
	public Float divide(Float a, Float b) {//(a/b)
		return a/b;
	}

}
