(ns rna.core
  (:require [dire.core :refer [with-precondition! with-handler!]]))

(def dna->rna
  {\G \C
   \C \G
   \T \A
   \A \U})

(defn transcribe [dna]
  (map dna->rna dna))

;;
;; use dire to inject preconditions
;;

(defn- valid-dna-nucleotide? [nucleotide]
  (contains? dna->rna nucleotide))

(with-precondition! #'transcribe
                    :valid-dna-nucleotide
                    (fn [dna & args]
                      (every? valid-dna-nucleotide? dna)))

(with-handler! #'transcribe
               {:precondition :valid-dna-nucleotide}
               (fn [e & args]
                 (throw (Exception. "Invalid dna strand"))))
