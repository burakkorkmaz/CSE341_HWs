; *********************************************
; *  341 Programming Languages                *
; *  Fall 2017                                *
; *  Author: Yakup Genc                       *
; *  Editor: Burak Kağan Korkmaz              *
; *********************************************

;; utility functions
(load-file "include.clj") ;; "c2i and "i2c"


(use 'clojure.java.io)


(defn read-as-list
	"Reads a file containing one word per line and returns a list of words (each word is in turn a list of characters)."
	[filename]

	;(def strings nil)

		;(println fileRd)
(def str1 (slurp filename))
	(def liste (apply list (clojure.string/split str1 #"\s+")))
					;(with-open [fileRd (reader filename)]
					;	(line-seq fileRd))
		;(doseq [strings ])
		(println liste)
		;	(def mylist (apply list mylist) )

	;(def vect )
	;(println vect)

	;(def liste (list))
	;(loop [i 0]
	;  (when (< i (count vect))
	;    (println
	;			(conj liste
	;						(nth vect i)))
	;
	;    (recur (+ i 1))
	;		)
	;
	;	)
	;(println liste)



	;	'((a b c) (d e f))
	)

;; -----------------------------------------------------
;; HELPERS
;; *** PLACE YOUR HELPER FUNCTIONS BELOW ***

(defn spell-checker-0
	[word]
	;you should implement this function
	)

(defn spell-checker-1
	[word]
	;you should implement this function
	)


;; -----------------------------------------------------
;; DECODE FUNCTIONS

(defn Gen-Decoder-A
	[paragraph]
	;you should implement this function
	)

(defn Gen-Decoder-B-0
	[paragraph]
	;you should implement this function
	)

(defn Gen-Decoder-B-1
	[paragraph]
	;you should implement this function
	)

(defn Code-Breaker
	[document decoder]
	;you should implement this function
	)

;; -----------------------------------------------------
;; Test code...

(defn test_on_test_data
	[]
	(let [doc (read-as-list "document1.txt")]
		;(println doc)
		)
	)


;; test code...
(test_on_test_data)

(defn readFile []

	)
(readFile)
;(clojure.string/split-lines  str)