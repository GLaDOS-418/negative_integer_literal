func f() -> Int64 {
    return -1
}

func g() -> Int64 {
    return 0xffffffff
}

func main() {
    print(f())
    print(g())
}

main()
