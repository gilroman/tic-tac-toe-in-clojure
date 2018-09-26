(defproject tic-tac-toe "0.1.0-SNAPSHOT"
  :description "Tic Tac Toe"
  :url "https://github.com/gilroman/tic-tac-toe-in-clojure"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot tic-tac-toe.core
  :profiles {:dev {:plugins [[venantius/ultra "0.5.2"] [com.jakemccrary/lein-test-refresh "0.23.0"]]}}
   )
