(ns tic-tac-toe.board-test
  (:require [clojure.test :refer :all]
            [tic-tac-toe.board :refer :all]
            ))

(deftest board-size-test
    (is (= 9 board-size)))

(deftest board-test
    (is (= [0 1 2 3 4 5 6 7 8] (board board-size))))

(deftest board-to-string-test
    (is (= "   |   |   \n-----------\n   |   |   \n-----------\n   |   |   " (board-to-s (board board-size)))))

