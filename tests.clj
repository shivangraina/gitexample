(ns task.tests
 (:use clojure.test)
 (:require [task.solutions :as t]))


(deftest test-frequency-count
  (is (=  {"quick" 2, "fox" 2, "lazy" 1, "dog" 1, "donkey" 1, "fire" 1}
          (t/get-frequency-count
            ["quick" "fox" "lazy" "dog" "quick" "donkey" "fire" "fox"])))

  (is (= {"hello" 3 , "hi" 2}
         (t/get-frequency-count
           ["hi" "hello" "hi" "hello" "hello"]))))


(deftest test-fibonacci
  (is (= '(1 1 2 3 5 8 13 21 34 55)
         (t/get-first-n-fibonacci 10))))


(deftest test-fizzbuzz
  (is (= '(1 2 "FIZZ" 4 "BUZZ" "FIZZ" 7 8 "FIZZ" "BUZZ" 11 "FIZZ" 13 14 "FIZZBUZZ")
         (t/get-fizzbuzz 15))))









