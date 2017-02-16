(ns rna.core)

(def dna->rna
  {\G \C})

(defn transcribe [dna]
  (map dna->rna dna))