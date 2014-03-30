(ns cljsthree.scene.scene)

(defn scene []
  (js/THREE.Scene.))

(defn add [s & os]
  (doseq [o os]
    (.add s o))
  s)

;; Although I would prefer the simple name 'remove,' this choice hides
;; clojure.core/remove resulting in warnings when consumed in other code.
(defn scene-remove [s & os]
  (doseq [o os]
    (.remove s o))
  s)

(defn children [s]
  (.-children s))

(defn lights [s]
  (into [] (.-__lights s)))

(defn light-count [s]
  (count (lights s)))

(defn objects [s]
  (into [] (.-__objects s)))

(defn object-count [s]
  (count (objects s)))

(extend-type js/THREE.Scene 
  ICounted
  (-count [o]
    (+ (light-count o) (object-count o))))
