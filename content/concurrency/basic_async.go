go fmt.Println("Hello async!")
for i:=0; i<5; i++ {
	fmt.Print("Hey! ")
	time.Sleep(100 * time.Millisecond)
}
// Hey! Hello async!
// Hey! Hey! Hey! Hey!