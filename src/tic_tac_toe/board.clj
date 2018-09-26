(ns tic-tac-toe.board)

(def board-size 9)

(defn board [size] (range size))

(defn board-to-s [board] "   |   |   \n-----------\n   |   |   \n-----------\n   |   |   ")