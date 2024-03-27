package modelo;

/**
 * The CD class represents a CD object. Information about the 
 * CD is stored and can be retrieved.
 * 
 * @author Michael Kolling and David J. Barnes
 * @version 2008.03.30
 */
public class CD extends Item{
    
    private String artist;
    private int numberOfTracks;
    
    public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public int getNumberOfTracks() {
		return numberOfTracks;
	}

	public void setNumberOfTracks(int numberOfTracks) {
		this.numberOfTracks = numberOfTracks;
	}

	/**
     * Print details about this CD to the text terminal.
     */
	@Override
    public void print(){
    	super.print();
        System.out.println("    " + artist);
        System.out.println("    tracks: " + numberOfTracks);
        System.out.println("    " + comment);
    }
}
