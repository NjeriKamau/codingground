/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simulation3;

//import com.mtsystems.coot.NativeHelper;

import java.io.RandomAccessFile;

public class Simulation3 {

 


public class DemoTranslation {
	/*static {
		// The online demo uses the example library "libc.so.6".
		// Have a look at the translated programs for real values.
		NativeHelper h = NativeHelper.get("libc.so.6");
		h.addRename("updateTimeAv9Stats", "update_time_av9_stats");
		h.bindDirect(DemoTranslation.class);
	}*/

	public final static int Q_LIMIT = 100;

	int nextEventType, numCustsDelayed, numDelaysRequired, numEvents, nurnInQ, serverStatus;

	float areaNurnInQ;

	float areaServerStatus;

	float meanInterarrival;

	float meanService;

	float timex;

	float[] timeArrival = new float[Q_LIMIT + 1];

        float timeLastEvent;

	float[] timeNextEvent = new float[3];

	float totalOfDelays;

	RandomAccessFile infile, outfile;

	public void initialize();

	public void timing();

	public  void arrive();

	public void depart();

	public void report();

	public void updateTimeAv9Stats();

	public float expon(float mean);
}
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
