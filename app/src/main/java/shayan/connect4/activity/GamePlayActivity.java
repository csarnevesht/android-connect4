package shayan.connect4.activity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import shayan.connect4.R;
import shayan.connect4.controller.GamePlayController;
import shayan.connect4.rules.GameRules;
import shayan.connect4.view.BoardView;


public class GamePlayActivity extends AppCompatActivity {

    private GamePlayController mGameController;
    private final GameRules mGameRules = new GameRules();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        BoardView boardView = (BoardView) findViewById(R.id.gameView);
        getDefaultGameRules();
        mGameController = new GamePlayController(this, boardView, mGameRules);
    }

    @NonNull
    private GameRules getDefaultGameRules() {
        mGameRules.setRule(GameRules.FIRST_TURN, GameRules.FirstTurn.PLAYER1);
        mGameRules.setRule(GameRules.LEVEL, GameRules.Level.HARD);
        mGameRules.setRule(GameRules.OPPONENT, GameRules.Opponent.AI);
        mGameRules.setRule(GameRules.DISC, GameRules.Disc.RED);
        mGameRules.setRule(GameRules.DISC2, GameRules.Disc.YELLOW);
        return mGameRules;
    }
}
