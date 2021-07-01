
public class Pen {

	
	private String pen;
	private int  color;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + color;
		result = prime * result + ((pen == null) ? 0 : pen.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pen other = (Pen) obj;
		if (color != other.color)
			return false;
		if (pen == null) {
			if (other.pen != null)
				return false;
		} else if (!pen.equals(other.pen))
			return false;
		return true;
	}
	
	
	
}
