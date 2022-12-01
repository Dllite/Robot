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
		System.out.println("Robot " +this.nom);
	}
	
	public Robot fire(Robot a){
		Robot R = new Robot();
		R.nom="Rob 2";
		R.nbVie=this.nbVie;
		
		//this.nbVie-=R.nbVie;
		System.out.println(this.nom + " a recu un coup de " + R.nom);
		System.out.println(this.nom + " Niveau de vie : " + (R.nbVie-2));
		//System.out.println(this.nbVie);
		return R;
	}
	public Boolean isDead() {
		int a = 0;
		//public Boolean a;
		if(a==0) {
			return true;
		}return false;
	}
	public static void main(String[] args) {

        Robot bob = new Robot("Bob");
        Robot bob2 = new Robot();
        
       bob.fire(bob2);
       
        
        
    }

}

