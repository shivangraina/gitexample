
(ns example-programs.core)
(require '[clojure.string :as str])

;; Program 1

(defn fizzbuzz
  [n]
  (cond (zero? (rem n 15))
        "FIZZBUZZ"
        (zero? (rem n 3))
        "FIZZ"
        (zero? (rem n 5))
        "BUZZ"
        :else n))
(defn generate-fizzbuzz
  [n]
  (map fizzbuzz (range 1 (inc n))))

;;Program 2

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


;; Program 3: finding frequency of each word in a string
(defn split
  [string]
  (str/split string #" "))

(defn count-freq
  [string word]
  (count (filter #{word} (split string))))

(defn get-frequency-count
  [wordlist]
  (into {}
        (map #(vector % (count-freq wordlist %))
             (into #{} wordlist))))


