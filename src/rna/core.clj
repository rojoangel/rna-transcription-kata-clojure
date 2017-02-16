(ns rna.core)

(def dna->rna
  {\G \C
   \C \G})

(defn transcribe [dna]
  (map dna->rna dna))