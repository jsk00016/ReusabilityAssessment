package AbstractUtils;

public class LongMath extends MathAbstract<Long> {

	@Override
	public Long add(Long a, Long b) {
		return a+b;
	}

	@Override
	public Long subtract(Long a, Long b) {//(a-b)
		return a-b;
	}

	@Override
	public Long multiply(Long a, Long b) {
		return a*b;
	}

	@Override
	public Long divide(Long a, Long b) {//(a/b)
		return a/b;
	}

}
