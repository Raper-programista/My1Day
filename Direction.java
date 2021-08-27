public enum Direction{
	L("left"),
	R("right");

	String dir;

	Direction(String dir){
		this.dir = dir;
	}

	public static Direction parseDir(String dir){
		if(dir.toUpperCase().equals("L"))		return L;
		if(dir.toUpperCase().equals("R"))		return R;
		return null;
	}
}