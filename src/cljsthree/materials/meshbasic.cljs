(ns cljsthree.materials.meshbasic
  (:use [cljsthree.util :only [map->js]]))

(defn meshbasic 
  ([] (meshbasic {}))
  ([opts]
     (js/THREE.MeshBasicMaterial. (map->js opts))))
