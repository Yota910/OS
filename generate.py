import secrets
import string

def generate(length):
    character = string.ascii_letters + string.digits + string.punctuation
    password = ''.join(secrets.choice(character) for _ in range(int(length)))
    print(password)

if __name__=='__main__':
    length = input("Enter number of digits:")
    generate(length)