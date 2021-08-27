public enum Degrees{
	D0("0°"),
	D90("90°"),
	D180("180°"),
	D270("270°");

	private String display;

	Degrees(String display){
		this.display = display;
	}

	public String getDisplay(){
		return display;
	}

	public Degrees next(){

		 return this.ordinal() < Degrees.values().length - 1
         ? Degrees.values()[this.ordinal() + 1]
         : Degrees.D0;
	}

	public Degrees previous(){

		 return this.ordinal() > 0
         ? Degrees.values()[this.ordinal() - 1]
         : Degrees.D270;
	}

	@Override
	public String toString(){
		return display;
	}

}