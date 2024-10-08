package pack;

public abstract class Item {
private int uid;
private String name;
private int noc;
public Item(int uid, String name, int noc) {
	super();
	this.uid = uid;
	this.name = name;
	this.noc = noc;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getNoc() {
	return noc;
}
public void setNoc(int noc) {
	this.noc = noc;
}
public void checkIn() {
	setNoc(getNoc()+1);
}

public void checkOut() {
	setNoc(getNoc()-1);
}
@Override
public boolean equals(Object obj) {
	if(obj instanceof Item)
		{
			Item i=(Item)obj;
			if(this.uid==i.uid&&this.name.equals(i.name)&&this.noc==i.noc)
				return true;
			else
				return false;
		}
	else
		return false;

	}
@Override
public String toString() {
	return "Item [uid=" + uid + ", name=" + name + ", noc=" + noc + "]";
}

public abstract void print();

}
