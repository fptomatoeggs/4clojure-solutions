(defn c2w [a b]
    (cond
      (empty? a) (count b)
      (empty? b) (count a)
      :else (let [
                  na (next a)
                  nb (next b)
                  cost (if (= (first a) (first b)) 0 1)]
                 (min (+ 1 (c2w na b)) (+ 1 (c2w a nb)) (+ cost (c2w na nb))))))

(let [x (first xs) ys (disj xs x)]
  ())
