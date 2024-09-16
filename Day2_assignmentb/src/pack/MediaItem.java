package pack;

public abstract class MediaItem extends Item{

private int runtime;
	public MediaItem(int uid, String name, int noc,int runtime) {
		super(uid, name, noc);
		// TODO Auto-generated constructor stub
		this.runtime=runtime;
	}
	public int getRuntime() {
		return runtime;
	}
	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}
	@Override
    public String toString() {
        return super.toString() + ", Runtime: " + runtime + " minutes";
    }


}
