package model;

import org.kordamp.ikonli.javafx.FontIcon;

import java.util.ArrayList;
import java.util.HashMap;

public class Queen extends ChessPiece {
    public Queen(FontIcon icon) {
        super(icon);
    }

    public HashMap<Direction, ArrayList<Action>> createActions(final Board state) {
        return new HashMap<Direction, ArrayList<Action>>() {
            {
                put(Direction.POS_HORIZONTAL, new ArrayList<Action>() {
                    {
                        add(new Action(1, 0));
                        add(new Action(2, 0));
                        add(new Action(3, 0));
                        add(new Action(4, 0));
                        add(new Action(5, 0));
                        add(new Action(6, 0));
                        add(new Action(7, 0));
                    }
                });

                put(Direction.NEG_HORIZONTAL, new ArrayList<Action>() {
                    {
                        add(new Action(-1, 0));
                        add(new Action(-2, 0));
                        add(new Action(-3, 0));
                        add(new Action(-4, 0));
                        add(new Action(-5, 0));
                        add(new Action(-6, 0));
                        add(new Action(-7, 0));
                    }
                });

                put(Direction.POS_VERTICAL, new ArrayList<Action>() {
                    {
                        add(new Action(0, 1));
                        add(new Action(0, 2));
                        add(new Action(0, 3));
                        add(new Action(0, 4));
                        add(new Action(0, 5));
                        add(new Action(0, 6));
                        add(new Action(0, 7));
                    }
                });

                put(Direction.NEG_VERTICAL, new ArrayList<Action>() {
                    {
                        add(new Action(0, -1));
                        add(new Action(0, -2));
                        add(new Action(0, -3));
                        add(new Action(0, -4));
                        add(new Action(0, -5));
                        add(new Action(0, -6));
                        add(new Action(0, -7));
                    }
                });

                put(Direction.POS_HORIZONTAL_AND_POS_VERTICAL, new ArrayList<Action>() {
                    {
                        add(new Action(1, 1));
                        add(new Action(2, 2));
                        add(new Action(3, 3));
                        add(new Action(4, 4));
                        add(new Action(5, 5));
                        add(new Action(6, 6));
                        add(new Action(7, 7));
                        add(new Action(8, 8));
                    }
                });

                put(Direction.NEG_HORIZONTAL_AND_NEG_VERTICAL, new ArrayList<Action>() {
                    {
                        add(new Action(-1, -1));
                        add(new Action(-2, -2));
                        add(new Action(-3, -3));
                        add(new Action(-4, -4));
                        add(new Action(-5, -5));
                        add(new Action(-6, -6));
                        add(new Action(-7, -7));
                        add(new Action(-8, -8));
                    }
                });

                put(Direction.NEG_HORIZONTAL_AND_POS_VERTICAL, new ArrayList<Action>() {
                    {
                        add(new Action(-1, 1));
                        add(new Action(-2, 2));
                        add(new Action(-3, 3));
                        add(new Action(-4, 4));
                        add(new Action(-5, 5));
                        add(new Action(-6, 6));
                        add(new Action(-7, 7));
                        add(new Action(-8, 8));
                    }
                });

                put(Direction.POS_HORIZONTAL_AND_NEG_VERTICAL, new ArrayList<Action>() {
                    {
                        add(new Action(1, -1));
                        add(new Action(2, -2));
                        add(new Action(3, -3));
                        add(new Action(4, -4));
                        add(new Action(5, -5));
                        add(new Action(6, -6));
                        add(new Action(7, -7));
                        add(new Action(8, -8));
                    }
                });
            }
        };
    }
}
