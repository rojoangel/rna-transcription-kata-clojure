(ns rna.core)

(def dna->rna
  {\G \C
   \C \G
   \T \A
   \A \U})

(defn- valid-dna-nucleotide? [nucleotide]
  (contains? dna->rna nucleotide))

(defn transcribe [dna]
  {:pre [(every? valid-dna-nucleotide? dna)]}
  (map dna->rna dna))
