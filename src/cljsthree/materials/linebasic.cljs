(ns cljsthree.materials.linebasic
  (:use [cljsthree.util :only [map->js]]))

(defn linebasic 
  ([] (linebasic {}))
  ([opts]
     (js/THREE.LineBasicMaterial. (map->js opts))))
