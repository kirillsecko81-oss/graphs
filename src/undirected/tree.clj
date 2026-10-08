(ns undirected.tree
  (:require [undirected.connected :refer [connected-components connected?]]
            [undirected.graph :as g]
            [utils :refer [???]]))

(defn edge-count-tree? [graph]
  (= (g/edge-count graph)
     (dec (g/order graph))))

(defn tree? [graph]
  (and (connected? graph)
       (edge-count-tree? graph)))

(defn forest? [graph]
  (=(g/edge-count graph)
    (-(g/order graph) (count (connected-components graph)))))
