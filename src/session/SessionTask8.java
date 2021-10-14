package session;

import java.util.ArrayList;

import java.util.ConcurrentModificationException;
import java.util.Iterator;

public class SessionTask8 {
	public static void main(String[] args)throws ConcurrentModificationException {
		ArrayList<TrainerCLass> trainers = new ArrayList<TrainerCLass>();
		trainers.add(new TrainerCLass(1,"yogesh","java  ",21000));
		trainers.add(new TrainerCLass(2,"jayesh","python",20000));
		trainers.add(new TrainerCLass(3,"suresh","java  ",10000));
		trainers.add(new TrainerCLass(4,"ramesh","c++   ",32000));
		trainers.add(new TrainerCLass(5,"mitesh","c    ",32000));

		ArrayList<TrainerCLass> filtered_trainers = new ArrayList<TrainerCLass>();
		Iterator<TrainerCLass> itr = trainers.iterator();
		while(itr.hasNext()) {
			TrainerCLass trainer = itr.next();
			if(trainer.salary>20000 && trainer.courses=="java  ") {
				itr.remove();
			}
			else {
				filtered_trainers.add(trainer);
			}
		}
		Iterator<TrainerCLass> itr1 = filtered_trainers.iterator();
		while(itr1.hasNext()) {
			TrainerCLass f_trainer = itr1.next();
			System.out.println(f_trainer);
		}
	}
}
class TrainerCLass{
	int tr_id;
	String name;
	String courses;
	int salary;
	public TrainerCLass(int tr_id, String name, String courses, int salary) {
		super();
		this.tr_id = tr_id;
		this.name = name;
		this.courses = courses;
		this.salary = salary;
	}
	public Iterator<TrainerCLass> iterator(){
		return null;
	}
	public String toString() {
		return "ID : "+tr_id+"     Name : "+name+"       Course : "+courses+"      Salary :  "+salary;
	}
}