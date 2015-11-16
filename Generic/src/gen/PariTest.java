package gen;

import javax.sound.midi.MidiDevice.Info;

public class PariTest {
	public static void main(String[] args) {
		
		 
		
		Pair<String,String> para1 = new Pair<>("kek", "kek");
		Pair<Integer, Integer> para2 = new Pair<>(555,5551111);
		 Pair<String, Integer> p1 = new Pair<>("Ania", 1987);
		 
		 PariTest.info(para1);
		 PariTest.info(para2);
		 PariTest.info(p1);
	
	}
		
		static <T,V> void info(Pair<T,V> para) {
			System.out.println("<" + para.getT()+ ";" + para.getV() + ">");
		}
		
		
	}
