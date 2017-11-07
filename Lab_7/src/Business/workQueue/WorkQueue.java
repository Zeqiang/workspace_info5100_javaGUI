/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.workQueue;

import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class WorkQueue {
    ArrayList<WorkRequest> workQueue;

    public WorkQueue() {
        workQueue = new ArrayList<WorkRequest>();
    }

    public ArrayList<WorkRequest> getWorkQueue() {
        return workQueue;
    }
    
    public WorkRequest addRequest(){
        WorkRequest wq = new WorkRequest();
        workQueue.add(wq);
        return wq;
    }
}
