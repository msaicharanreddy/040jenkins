def main():
    # Hardcoded numbers for operations
    num1 = 10
    num2 = 5

    # Performing arithmetic operations
    addition = num1 + num2
    subtraction = num1 - num2
    multiplication = num1 * num2

    if num2 != 0:
        division = num1 / num2
    else:
        print("Error: Division by zero is not allowed.")
        division = None  # Prevents printing division result if by zero

    # Displaying the results
    print("Addition:", addition)
    print("Subtraction:", subtraction)
    print("Multiplication:", multiplication)
    
    if division is not None:
        print("Division:", division)

if __name__ == "__main__":
    main()

