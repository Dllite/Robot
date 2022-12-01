package Robot;

public class Robot {
	protected String nom;
	protected int nbVie;
	Robot(){
		this.nom="";
		this.nbVie=10;
	}
	Robot(String nom){
		this.nom=nom;
		this.nbVie=10;
		//System.out.println("Robot " +this.nom);
	}
	
	public void fire(Robot robotAttaque){
		robotAttaque.nom="Rob 2";
		/*Robot robotAttaque = new Robot();*/
		//robotAttaque.="Rob 2";
		//Robot robotAttaque = new Robot();
		if(robotAttaque.nbVie<=0) {
			System.out.println(robotAttaque.nom + " est deja mort");
		}else {
			robotAttaque.nbVie -=2;
			System.out.println(robotAttaque.nom + " a ete touche par le robot " + this.nom);
			System.out.println("Au " + robotAttaque.nom + " reste " + robotAttaque.nbVie);
			
		}
		
	
		
		
		//robotAttaque.setNbVie(robotAttaquenbVie()- 2); 
		//System.out.println(robotAttaque.getNom() + " a ete touche par le robot " + this.nom); 
		//System.out.println("Au  " + robotAttaque.getNomRobot()  + " il reste " + robotAttaque.getNbreVie()); 
		//this.nbVie-=R.nbVie;
		//System.out.println(this.nom + " a recu un coup de " + R.nom);
		//System.out.println(this.nom + " Niveau de vie : " + (R.nbVie-2));
		//System.out.println(this.nom + " Niveau de vie : " + (R.nbVie-2));
		//System.out.println(this.nbVie);
		//System.out.println(this.nom + " est envie ? :  " +isDead(this.nbVie));
		//System.out.println(R.nom + " est envie ? :  " +isDead(R.nbVie));
		

	}
	
	public Boolean isDead(int a) {
		//int a <= 0;
		//public Boolean a;
		if(a<=0) {
			return false;
		}return true;
	}
	public void setNbVie(int vie) {
		this.nbVie=vie;
	}
	public int getNbVie() {
		return nbVie;
	}
	public void setNom(int vie) {
		this.nom=nom;
	}
	public String getNom() {
		return nom;
	}
	public static void main(String[] args) {

        Robot bob = new Robot("Bob");
        Robot bob2 = new Robot();
        
       bob.fire(bob2);
       bob.fire(bob2);
       
       
        
        
    }

}

