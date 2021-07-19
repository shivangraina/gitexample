(ns gitexample.core-test
  (:require
    [clojure.test :refer [deftest is testing]]
    [gitexample.core :as ep]))


(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))


(deftest fizzbuzz-test
  (is (= [1 2 "FIZZ" 4 "BUZZ" "FIZZ" 7 8 "FIZZ"] (ep/generate-fizzbuzz 9)))
  (is (= [] (ep/generate-fizzbuzz 0)))
  (is (= [1 2 "FIZZ" 4 "BUZZ" "FIZZ" 7 8 "FIZZ" "BUZZ" 11 "FIZZ" 13 14 "FIZZBUZZ" 16] (ep/generate-fizzbuzz 16))))


(deftest get-first-n-fibonacci-test
  (is (= '(1 1 2) (ep/get-first-n-fibonacci 3)))
  (is (= '(1 1 2 3 5 8) (ep/get-first-n-fibonacci 6)))
  (is (= '(1 1 2 3 5 8 13 21) (ep/get-first-n-fibonacci 8)))
  (is (= '(1 1 2 3 5 8 13 21 34 55)
         (ep/get-first-n-fibonacci 10))))


(deftest get-frequency-count-test
  (is (= {"clap" 1, "are" 2, "it" 2, "you" 4, "if" 2, "and" 2, "your" 1, "know" 2, "happy" 2, "hands," 1} (ep/get-frequency-count "if you are happy and you know it clap your hands, if you are happy and you know it")))
  (is (= {"hello" 5 "yes" 1 "you" 4} (ep/get-frequency-count "hello you hello you yes hello hello you hello you")))
  (is (=  {"quick" 2, "fox" 2, "lazy" 1, "dog" 1, "donkey" 1, "fire" 1}
          (ep/get-frequency-count "quick fox lazy dog quick donkey fire fox")))
  (is (= {"hello" 3 , "hi" 2}
         (ep/get-frequency-count "hi hello hi hello hello "))))

