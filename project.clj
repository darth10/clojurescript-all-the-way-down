(defproject clojurescript-all-the-way-down "1.3.37"
  :plugins [[lein-cljsbuild "0.3.3"]]
  :license {:name "Mozilla Public License"
            :url "http://www.mozilla.org/MPL/2.0/"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [hiccups "0.2.0"]
                 [webfui "0.2.1"]]
  :cljsbuild {:builds
              [{:source-path "src/server"
                :compiler
                {:output-to "js/main.js"
                 :output-dir "js"
                 :optimizations :simple
                 :target :nodejs}}
               {:source-path "src/client"
                :compiler
                {:output-to "static/cljs.js"
                 :output-dir "static/cljs"}}]})
