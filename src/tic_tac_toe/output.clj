(ns tic-tac-toe.output)

(def game-name "Tic-Tac-Toe")

(defn welcome [name] (str "Welcome to " name "!"))

(defn say-welcome [] (println (welcome game-name)))

(defn print-board [string] (println string))