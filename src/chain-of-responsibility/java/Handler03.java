package CoR;

public class Handler03 extends AbstractHandler {
	@Override
	protected int getHandlerLevel() {
		return Levels.LEVEL_03;
	}
	@Override
	protected void handle(AbstractRequest request) {
		System.out.println("Handler-03 handling " + request.getContent());
	}
}
