package com.chess.engine;

/**
 * "JavaEnums is a special Java type used to define collections of constants"
 * An enum can contain constants, methods etc..
 */

public enum Alliance {

    WHITE {
        @Override
        public int getDirection() {
            return 0;
        }

        @Override
        public boolean isWhite() {
            return true;
        }

        @Override
        public boolean isBlack() {
            return false;
        }
    },
    BLACK {
        @Override
        public int getDirection() {
            return 0;
        }

        @Override
        public boolean isWhite() {
            return false;
        }

        @Override
        public boolean isBlack() {
            return true;
        }
    };


    public abstract int getDirection();
    public abstract boolean isWhite();
    public abstract boolean isBlack();
}
