package LabQ3;

import java.util.Objects;

public abstract class MediaItem extends Item {
	private int runtime;

	public MediaItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public MediaItem(int runtime) {
		super();
		this.runtime = runtime;
	}



	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		MediaItem other = (MediaItem) obj;
		return runtime == other.runtime;
	}

	@Override
	public void print() {
		System.out.println("The media runtime is:"+runtime);
	}

	@Override
	public String toString() {
		return "MediaItem [runtime=" + runtime + "]";
	}
	
	
	
	

}