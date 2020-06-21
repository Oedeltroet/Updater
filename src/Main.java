public class Main {

	public static void main(String[] args) {
		
		System.out.println(Settings.VERSION);
		System.out.println("Remote: " + Settings.URL_REMOTE);
		
		Updater.refresh();
		System.out.println(Updater.check());
	}
}