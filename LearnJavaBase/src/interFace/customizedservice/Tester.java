package interFace.customizedservice;

public class Tester {

	public static void main(String[] args) {
		Payment payment = new Payment(Payment.TYPE_PER_YEAR,2999);
		BroadbandService broadbandService = new BroadbandServiceImpl(2);
		MailboxService mailboxService = new MailboxServiceImpl(50);
		VirusKillingService virusKillingService= new VirusKillingServiceImpl();
		
		SuperSpeedCombo s = new SuperSpeedComboImpl(broadbandService, virusKillingService, mailboxService, payment);
		s.connect("q", "user");

	}

}
