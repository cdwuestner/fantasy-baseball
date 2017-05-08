/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fantasy.baseball;

/**
 *
 * @author cdwue
 */
public class PlayerTeam {
    
    private int rowId;
    private String first_name;
    private String last_name;
    private String team_name;

    public PlayerTeam(int rowId, String first_name, String last_name, String team_name) {
        this.rowId = rowId;
        this.first_name = first_name;
        this.last_name = last_name;
        this.team_name = team_name;
    }

    public int getRowId() {
        return rowId;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getTeam_name() {
        return team_name;
    }

    public void setTeam_name(String team_name) {
        this.team_name = team_name;
    }
    
    @Override
    public String toString() {
      return this.first_name + " " + this.last_name + ", " + this.team_name;
    }
    
}
