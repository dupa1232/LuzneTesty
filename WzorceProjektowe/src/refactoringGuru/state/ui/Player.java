package refactoringGuru.state.ui;

import refactoringGuru.state.states.ReadyState;
import refactoringGuru.state.states.State;

import java.util.ArrayList;
import java.util.List;

/*
G��wny kod odtwarzacza
 */

public class Player {

    private State state;
    private boolean playing = false;
    private List<String> playlist = new ArrayList<>();
    private int currentTrack = 0;

    public Player() {
        this.state = new ReadyState(this);
        setPlaying(true);
        for(int i = 1; i<=12; i++) {
            playlist.add("Track " +i);
        }
    }

    public State getState() {
        return state;
    }

    public void changeState(State state) {
        this.state = state;
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public List<String> getPlaylist() {
        return playlist;
    }

    public void setPlaylist(List<String> playlist) {
        this.playlist = playlist;
    }

    public int getCurrentTrack() {
        return currentTrack;
    }

    public void setCurrentTrack(int currentTrack) {
        this.currentTrack = currentTrack;
    }

    public String startPlayback() {
        return "Playing " +playlist.get(currentTrack);
    }

    public String nextTrack() {
        currentTrack++;
        if(currentTrack > playlist.size()-1)
            currentTrack = 0;
        return "Playing " +playlist.get(currentTrack);
    }

    public String previousTrack() {
        currentTrack--;
        if(currentTrack < 0)
            currentTrack = playlist.size() -1;
        return "Playing " +playlist.get(currentTrack);
    }

    public void setCurrentTrackAfterStop() {
        this.currentTrack = 0;
    }
}
