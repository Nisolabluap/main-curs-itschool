package session15.practice.team.domain;

import java.util.ArrayList;
import java.util.List;

public class Wall {

    private List<Post> theWall = new ArrayList<>();

    public List<Post> getTheWall() {
        return theWall;
    }

    public void setTheWall(List<Post> theWall) {
        this.theWall = theWall;
    }

    @Override
    public String toString() {
        return "Wall{" +
                "theWall=" + theWall +
                '}';
    }
}