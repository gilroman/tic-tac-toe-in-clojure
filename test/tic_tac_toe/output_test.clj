(ns tic-tac-toe.output-test
  (:require [clojure.test :refer :all]
            [tic-tac-toe.board :refer :all]
            [tic-tac-toe.output :refer :all]
            ))

(deftest game-name-test
  (is (= "Tic-Tac-Toe" (str game-name))))

(deftest welcome-test
  (is (= "Welcome to Tic-Tac-Toe!" (welcome game-name))))

(deftest say-welcome-test
  (is (= "Welcome to Tic-Tac-Toe!\n" (with-out-str(say-welcome)))))

(deftest print-empty-board-test
  (is (= "   |   |   \n-----------\n   |   |   \n-----------\n   |   |   \n" (with-out-str(print-board(board-to-s (board board-size)))))))