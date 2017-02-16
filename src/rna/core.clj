(ns rna.core)

(def dna->rna
  {\G \C
   \C \G
   \T \A})

(defn transcribe [dna]
  (map dna->rna dna))