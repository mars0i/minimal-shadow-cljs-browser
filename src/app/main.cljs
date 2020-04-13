(ns app.main
  (:require [app.lib :as lib]))

(def a 82)

(defonce b 2)

(def e "Yow, baby! whateva, uh huh.")

(defn main! []
  (let [x (.getElementById js/document "x")]
    (set! (.-innerHTML x) "Jes startin'"))
  (println "[main]: Yow!"))

(defn reload! []
  (let [x (.getElementById js/document "x")]
    (set! (.-innerHTML x) e))
  (println "[main] reloaded lib:" lib/c lib/d)
  (println "[main] reloaded:" a b))
