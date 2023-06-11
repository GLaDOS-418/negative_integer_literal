f :: IO Integer
f = return (-1) -- `return -1` is compiler error. you need to enclose it in parantheses

g :: IO Integer
g = return 0xffffffff

main :: IO ()
main = do
  rf <- f
  rg <- g
  putStrLn $ show rf
  putStrLn $ show rg
