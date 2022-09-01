from PIL import Image

im = Image.open(r"C:\Users\DEVANSH SHARMA\Downloads\car.jpg")  
#Show actual Image  
im.show()  
#Show rotated Image  
imim = im.rotate(45)  
im.show()  