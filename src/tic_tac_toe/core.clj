(ns tic-tac-toe.core
  (:require [tic-tac-toe.output :refer :all] [tic-tac-toe.board :refer :all])
  (:gen-class))

(defn -main
  []
  (say-welcome)
  (print-board (board-to-s (board board-size))))
