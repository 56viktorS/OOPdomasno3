package zadaca1;

public class Avtomobil {

	public static void main(String[] args) {}
		// TODO Auto-generated method stub
		public String marka;
		public String model;
		public String boja;
		public double pominatiKm;
		public int godinaNaProizvodstvo;
		public String registracija;
		
		public Avtomobil(String marka,String model, String boja, double pominatiKm,
		int godinaNaProizvodstvo, String registracija) {
			
			this.marka=marka;
			this.model=model;
			this.boja=boja;
			this.pominatiKm=pominatiKm;
			
			this.godinaNaProizvodstvo=godinaNaProizvodstvo;
			this.registracija=registracija;
			
		}
		public void pMetod() {
			System.out.println(this.marka+ ", "+this.model+", "+this.boja);
			
		}
		public double vMetod() {
			double pKm;
			pKm=this.pominatiKm+1520.25;
			return pKm;
	}

}