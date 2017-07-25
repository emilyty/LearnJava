package interFace.customizedservice;

public class SuperSpeedComboImpl implements SuperSpeedCombo{//可以看成转换接口的适配器,称作适配器模式
	private BroadbandService broadbandService;
	private VirusKillingService virusKillingService;
	private MailboxService mailboxService;
	private Payment payment;
	
	public SuperSpeedComboImpl(BroadbandService broadbandService,VirusKillingService virusKillingService,MailboxService mailboxService,Payment payment){
		this.broadbandService=broadbandService;
		this.virusKillingService=virusKillingService;
		this.mailboxService=mailboxService;
		this.payment=payment;
	}

	@Override
	public void connect(String username,String password) {
		broadbandService.connect(username, password);
		
	}

	@Override
	public void disconnect() {
		broadbandService.disconnect();
		
	}

	@Override
	public void scanVirus() {
		virusKillingService.scanVirus();
		
	}

	@Override
	public void sendMail() {
		mailboxService.sendMail();
		
	}

	@Override
	public void receiveMail() {
		mailboxService.receiveMail();
		
	}

	@Override
	public void writeMail() {
		mailboxService.writeMail();;
		
	}

	@Override
	public void deleteMail() {
		mailboxService.deleteMail();
		
	}
	
	public Payment payment(){
		return payment;
	}
}
