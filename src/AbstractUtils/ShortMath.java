package AbstractUtils;

public class ShortMath extends MathAbstract<Short> {

	@Override
	public Short add(Short a, Short b) {
		return (short) (a+b);
	}

	@Override
	public Short subtract(Short a, Short b) {//(a-b)
		return (short) (a-b);
	}

	@Override
	public Short multiply(Short a, Short b) {
		return (short) (a*b);
	}

	@Override
	public Short divide(Short a, Short b) {//(a/b)
		return (short) (a/b);
	}

}
