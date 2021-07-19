(ns example-programs.core-test
  (:require [clojure.test :refer [deftest is testing]]
            [example-programs.core :as ep]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 1 1))))
(deftest fizzbuzz-test
  (is (= [1 2 "FIZZ" 4 "BUZZ" "FIZZ" 7 8 "FIZZ"] (ep/generate-fizzbuzz 9)))
  (is (= [] (ep/generate-fizzbuzz 0)))
  (is (= [1 2 "FIZZ" 4 "BUZZ" "FIZZ" 7 8 "FIZZ" "BUZZ" 11 "FIZZ" 13 14 "FIZZBUZZ" 16 ] (ep/generate-fizzbuzz 16))))

(deftest fibo-seq-test
  (is (= '(1 1 2) (ep/fibo-seq 3)))
  (is (= '(1 1 2 3 5 8) (ep/fibo-seq 6)))
  (is (= '(1 1 2 3 5 8 13 21) (ep/fibo-seq 8)))
  (is (= '(1 1 2 3 5 8 13 21 34 55)
         (ep/fibo-seq 10))))

(deftest count-words-test
  (is (= {"clap" 1, "are" 2, "it" 2, "you" 4, "if" 2, "and" 2, "your" 1, "know" 2, "happy" 2, "hands," 1} (ep/count-words "if you are happy and you know it clap your hands, if you are happy and you know it")))
  (is (= {"hello" 5 "yes" 1 "you" 4} (ep/count-words "hello you hello you yes hello hello you hello you")))
  (is (=  {"quick" 2, "fox" 2, "lazy" 1, "dog" 1, "donkey" 1, "fire" 1}
          (ep/count-words "quick fox lazy dog quick donkey fire fox")))
  
(is (= {"hello" 3 , "hi" 2}
       (ep/count-words "hi hello hi hello hello "))))

