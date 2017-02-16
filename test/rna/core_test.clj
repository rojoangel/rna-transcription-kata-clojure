(ns rna.core-test
  (:require [clojure.test :refer :all]
            [rna.core :refer :all]))

(deftest rna-transcription-test
  (testing "single element transcription"
    (is (= [\C] (transcribe [\G])))
    (is (= [\G] (transcribe [\C])))))
