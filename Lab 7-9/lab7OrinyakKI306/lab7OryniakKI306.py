# Opening a file for writing
with open("MyFile.txt", "w") as fout:
    # Initializing variables and entering the matrix size and filler symbol
    arr = []
    n_ROWS = 0

    print("Enter the size of the square matrix: ")
    n_ROWS = int(input())
    print("Enter the filling symbol: ")
    symbol = input()

    # Checking the filler symbol
    if len(symbol) != 1:
        print("\nThe filling symbol is entered incorrectly.")
        fout.write("\nThe filling symbol is entered incorrectly")

    checking_of_the_array = 0

    # Filling the matrix with the filler symbol and displaying it on the screen and writing to a file
    for i in range(n_ROWS):
        arr.append([' ' for _ in range(n_ROWS // 2)])
        # For the first n_ROWS // 2 rows
        if checking_of_the_array < n_ROWS // 2:
            for j in range(n_ROWS // 2):
                arr[i][j] = symbol

                print(arr[i][j], end='')
                fout.write(arr[i][j])
            for k in range(n_ROWS // 2, n_ROWS):
                print(" ", end='')
                fout.write(" ")

            print()
            fout.write("\n")
        # For the rest of the rows
        else:
            arr[i] = [' ' for _ in range(n_ROWS // 2)]
            for k in range(n_ROWS // 2):
                print(" ", end='')
                fout.write(" ")

            for j in range(n_ROWS // 2):
                arr[i][j] = symbol
                print(arr[i][j], end='')
                fout.write(arr[i][j])
            print()
            fout.write("\n")

        checking_of_the_array += 1
