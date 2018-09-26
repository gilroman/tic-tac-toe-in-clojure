(ns tic-tac-toe.core
  (:require [tic-tac-toe.output :refer :all])
  (:gen-class))

(defn -main
  []
  (say-welcome))
