Create a Product class with name, price, and id fields. Implement the equals() method to check only the id field.
Implement the hashCode() method to use the id field to calculate the hash code. Test that two instances with the same id
return true for equals() and have the same hash code. Then change the id of one instance and test that they are no
longer equal and have different hash codes.