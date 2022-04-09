--Distancia Hamming

hamming :: String -> String -> Int
hamming xs [] = distancia xs
hamming [] ys = distancia ys
hamming (x:xs) (y:ys) | x==y = 0 + hamming xs ys
                      | otherwise = 1 + hamming xs ys


--Funcion auxiliar para contar la distancia
distancia :: String -> Int
distancia [] = 0
distancia (x:xs) = 1 + distancia xs