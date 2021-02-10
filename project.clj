(defproject maelstrom "0.1.1"
  :description "A test bench for writing toy Raft implementations"
  :url "https://github.com/jepsen-io/maelstrom"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :main maelstrom.core
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [jepsen "0.2.3-SNAPSHOT"]
                 [amalloy/ring-buffer "1.3.1"]
                 [cheshire "5.7.0"]
                 [byte-streams "0.2.2"]])
