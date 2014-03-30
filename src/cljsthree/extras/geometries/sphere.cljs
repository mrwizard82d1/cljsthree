(ns cljsthree.extras.geometries.sphere)

(defn sphere
  ([] (sphere {}))
  ([radius segments-width segments-height]
     (js/THREE.SphereGeometry. radius segments-width segments-height)))

