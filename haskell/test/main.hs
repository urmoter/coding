main = do
   putStrLn "Minimum"
   m <- getLine
   putStrLn "Maximum"
   a <- getLine
   let mi = (read m :: Int)
   let ma = (read a :: Int)
   print [mi..ma]
