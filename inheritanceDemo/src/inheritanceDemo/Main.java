package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
		ogretmenKrediManager.hesapla();
		
		KrediUI krediUi = new KrediUI();
		krediUi.krediHesapla(ogretmenKrediManager);
		krediUi.krediHesapla(new TarimKrediManager());
		krediUi.krediHesapla(new AskerKrediManager());

	}

}
