(require '[clojure.string :as str])
(ns example-programs.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

;; Program 1

(defn fizzbuzz
  [n]
  (cond (= 0 (mod n 15))
        "FIZZBUZZ"
        (= 0 (mod n 3))
        "FIZZ"
        (= 0 (mod n 5))
        "BUZZ"
        :else n))
(defn generate-fizzbuzz
  [n]
  (vec (map fizzbuzz (range 1 (inc n)))))

;;Program 2

(defn fibo
  "This function takes three values: `n`, `x` and `y` and generates the `n`th fibonacci number . This is a helper function for `fibo-seq`."
  [n x y]
  (if (< n 2) x (fibo (- n 1) y (+ x y))))

(defn fibo-seq
  "This function generates the fibonacci sequence for the first n numbers."
  [n]
  (map #(fibo % 1 1) (range 1 (+ n 1))))


;; Program 3: finding frequency of each word in a string
(defn split
  [string]
  (str/split string #" "))

(defn count-freq
  [string word]
  (count (filter #{word} (split string))))

(defn count-words
  [string]
  (zipmap (distinct (split string)) (map #(count-freq string %) (distinct (split string)))))


