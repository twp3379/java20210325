package p06.lecture.p3constructor;

public class Computer {
	String model;
	int memory;
	String cpu;
	int ssd;
<<<<<<< HEAD
	
	Computer(String model, int memory, String cpu, int ssd) {
		this.model = model;
		this.memory = memory;
		this.cpu = cpu;
		this.ssd = ssd;
	}
	
	Computer(String model, int memory, String cpu) {
		this.model = model;
		this.memory = memory;
		this.cpu = cpu;
		this.ssd = 128;
	}

	Computer(String model, int memory) {
		this.model = model;
		this.memory = memory;
		this.cpu = "intel";
		this.ssd = 128;
	}
	
	Computer(int memory, String model) {
		
	}
	
	/*
	Computer(String cpu, int ssd) {
		
	}
	/*
	
	Computer(String model) {
		this.model = model;
		this.memory = 4;
		this.cpu = "intel";
		this.ssd = 128;
	}
	
	/*
	Computer(String cpu) {
		this.model = "hp";
		this.memory = 4;
		this.ssd = 128;
	}
	*/
}





=======

	Computer(String model, int memory, String cpu, int ssd) {
		this.model = model;
		this.memory = memory;
		this.cpu = cpu;
		this.ssd = ssd;

	}

	Computer(String model, int memory, String cpu) {
		this.model = model;
		this.memory = memory;
		this.cpu = cpu;
		this.ssd = 128;
	}

	Computer(String model, int memory) {
		this.model = model;
		this.memory = memory;
		this.cpu = "intel";
		this.ssd = 128;
	}

	
	Computer(int memory, String model) {

	}

//      Computer(String cpu, int ssd) {
//    	  
//      }

	Computer(String model) {
		this.model = model;
		this.memory = 4;
		this.cpu = "intel";
		this.ssd = 128;
	}

//      Computer(String cpu){
//    	  this.model = "hp";
//    	  this.memory = 4;
//    	  this.ssd = 128;
//      }
}
>>>>>>> branch 'master' of https://github.com/twp3379/java20210325.git
