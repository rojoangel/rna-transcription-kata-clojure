(ns rna.core-test
  (:require [clojure.test :refer :all]
            [rna.core :refer :all]))

(deftest rna-transcription-test

  (testing "empty strand transcription"
    (is (= [] (transcribe []))))

  (testing "single element transcription"
    (is (= [\C] (transcribe [\G])))
    (is (= [\G] (transcribe [\C])))
    (is (= [\A] (transcribe [\T])))
    (is (= [\U] (transcribe [\A]))))

  (testing "multiple element transcription"
    (is (= [\C \C] (transcribe [\G \G])))
    (is (= [\C \G] (transcribe [\G \C])))
    (is (= [\C \G \A] (transcribe [\G \C \T])))
    (is (= [\C \G \A \U] (transcribe [\G \C \T \A]))))

  (testing "error conditions"
    (is (thrown-with-msg? Exception #"Invalid dna strand" (transcribe [\S])))
    (is (thrown-with-msg? Exception #"Invalid dna strand" (transcribe [1])))
    (is (thrown-with-msg? Exception #"Invalid dna strand" (transcribe [:a])))
    (is (thrown-with-msg? Exception #"Invalid dna strand" (transcribe ["G"])))))
