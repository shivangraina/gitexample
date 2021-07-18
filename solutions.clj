(ns task.solutions)


(defn count-word-frequency

  [word wordlist]
  (count (filter #{word} wordlist)))


(defn get-frequency-count

  [wordlist]
  (into {}
        (map #(vector % (count-word-frequency % wordlist))
             (into #{} wordlist))))


(defn first-n-fibonacci
  [n]
  (loop [final '[]
         a  0
         b  1
         count 0]
    (if (= count n)
      final
      (recur (conj final b)
             b
             (+ a b)
             (inc count)))))


(defn get-first-n-fibonacci
  [n]
  (apply list (first-n-fibonacci n)))


(defn check-fizzbuzz
  [n]
  (if (and (zero? (rem n 3))
           (zero? (rem n 5)))
    "FIZZBUZZ"
    (if (zero? (rem n 3))
      "FIZZ"
      (if (zero? (rem n 5))
        "BUZZ"
        n))))


(defn get-fizzbuzz
  [n]
  (map #(check-fizzbuzz %) (map inc (range n))))
