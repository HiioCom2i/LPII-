package visao;

import dao.Database;
import modelo.CD;
import modelo.DVD;
import modelo.Item;

public class ColectionView {

	public static void main(String[] args) {
		
		CD it1 = new CD();
		DVD it2 = new DVD();
		
		Database db = new Database(); 
		
		it1.setTitle("Cavaleiros do Forro");
		it1.setGotIt(true);
		it1.setPlayingTime(40);
		it1.setComment("Muito bom!!!");
		it1.setArtist("Jailson Santos");
		it1.setNumberOfTracks(7);
		
		
		it2.setTitle("Transformers 3");
		it2.setGotIt(true);
		it2.setPlayingTime(120);
		it2.setComment("Muito bom!!!");
		it2.setDirector("Michel Bay");
		
		db.addItem(it1);
		db.addItem(it2);
		
		db.list();
	}

}
