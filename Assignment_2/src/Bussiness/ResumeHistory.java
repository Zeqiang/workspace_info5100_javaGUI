/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class ResumeHistory {
    
    private ArrayList<Resume> resumeHistory;
    
    public ResumeHistory()
    {
        resumeHistory = new ArrayList<Resume>();
    }

    public ArrayList<Resume> getResumeHistory() {
        return resumeHistory;
    }

    public void setResumeHistory(ArrayList<Resume> resumeHistory) {
        this.resumeHistory = resumeHistory;
    }
    
    public Resume addResume()
    {
        Resume re = new Resume();
        resumeHistory.add(re);
        return re;
    }
    
    public void deleteResume(Resume re)
    {
        resumeHistory.remove(re);
    }
    
}
