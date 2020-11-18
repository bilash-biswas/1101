package main

import (
	"fmt"
)

func main() {
	var i, a, b, sum int
	sum = 0
	for true {
		fmt.Scan(&a)
		fmt.Scan(&b)
		if a <= 0 || b <= 0 {
			break
		} else if a < b {
			for i = a; i <= b; i++ {
				fmt.Printf("%d ", i)
				sum = sum + i
			}
		} else if a > b {
			for i = b; i <= a; i++ {
				fmt.Printf("%d ", i)
				sum = sum + i
			}
		}
		fmt.Printf("Sum=%d\n", sum)
		sum = 0
	}

}
