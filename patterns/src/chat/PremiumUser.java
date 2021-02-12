package chat;

public class PremiumUser implements IUser {
	private static ChatMediator chatMediator = new ChatMediator();
	private String name;

	@Override
	public void receiveMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println(name + " : " + msg);

	}

	@Override
	public void sendMessage(String msg) {
		chatMediator.sendMessage(msg);
	}

	public PremiumUser(String name) {
		this.name = name;
	}

}
