(defproject rna "0.1.0-SNAPSHOT"
  :description "rna transcription kata"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]]
  :main ^:skip-aot rna.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}
             :dev     {:dependencies [[midje "1.5.1"] [dire "0.5.4"]]}}
  :plugins [[lein-auto "0.1.2"]])
