; Burak Kagan Korkmaz
;	141044041
;
(use 'clojure.java.io)


;(defn mySplit [string]
;	(def s "")
;	(def ls '())
;	(println string)
;	(doseq [element string]
;		(case element \(  ( (def ls (conj ls element)) (def s "") )
;
;									\space ((def ls (conj ls element) (def s "")) )
;
;									\) ((def ls (conj ls element)) (def s ""))
;									()
;
;									)
;		)
;	ls
;	)


(defn lexer
	[filename]
	(def str1 (slurp filename))
	;(def liste (mySplit str1))
	(def liste (apply list (clojure.string/split str1 #"\s+")))
	(println liste)
	(def s1 "")
	(def ls1 '())
	(doseq [n liste]
		(if (or (= \( (nth n 0 ) ) (= \) (nth n 0 ) )
						(= \( (nth n (- (count n  ) 1 )  ) ) (= \) (nth n (- (count n) 1) ) ) )
		(do
			(def ls1 (conj ls1 (get n 0 ) ) )

			)
		)
	)
	ls1
	)
(lexer "CoffeeSample.coffee")
