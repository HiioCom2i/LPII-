package modelo;

public class DVD extends Item{
    
    private String director;

    public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	/**
     * Print details about this DVD to the text terminal.
     */
	@Override
    public void print(){
    	super.print();
        System.out.println("    " + director);
        System.out.println("    " + comment);
    }
}
