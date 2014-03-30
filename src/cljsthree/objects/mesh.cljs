(ns cljsthree.objects.mesh)

(defn mesh 
  ([g] 
     (js/THREE.Mesh. g))
  ([g m]
     (js/THREE.Mesh. g m)))

(defn position [m]
  (.-position m))

;; why can't I call apply here? 
(defn set-position [m v]
  (let [[x y z] v]
    (.set (position m) x y z))
  m)

