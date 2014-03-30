(ns cljsthree.extras.geometries.plane-geometry)

(defn plane-geometry
  "Creates a plane geometry of width x height with optional segments."
  ([w h] (js/THREE.PlaneGeometry. w h))
  ([w h width-segments] (js/THREE.PlaneGeometry w h width-segments))
  ([w h width-segments height-segments]
     (js/THREE.PlaneGeometry w h width-segments height-segments)))
