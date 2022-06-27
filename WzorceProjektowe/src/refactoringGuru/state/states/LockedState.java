package refactoringGuru.state.states;

import refactoringGuru.state.ui.Player;

public class LockedState extends State {

    public LockedState(Player player) {
        super(player);
        player.setPlaying(true);
    }

    @Override
    public String onLock() {
        if (player.isPlaying()) {
            player.changeState(new ReadyState(player));
            return "Stop playing";
        } else {
            return "Locked...";
        }
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player));
        return "Ready";
    }

    @Override
    public String onPrevious() {
        return "Locked....";
    }

    @Override
    public String onNext() {
        return "Locked...";
    }

}
