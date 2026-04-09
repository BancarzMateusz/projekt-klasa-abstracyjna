abstract public class Figura {
	private String kolor;
	public Figura(String kolor){
	this.kolor = kolor;
}

	abstract public double obliczObwod();
	abstract public double obliczPole();

	public String getKolor() {
	return kolor;
}
@Override
public String toString(){
	return "Figura[kolor=" +kolor+"}";
}
}
