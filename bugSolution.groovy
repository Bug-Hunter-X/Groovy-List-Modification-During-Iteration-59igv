```groovy
def myMethod(List<String> list) {
  Iterator<String> iterator = list.iterator();
  while (iterator.hasNext()) {
    String item = iterator.next();
    println "Item: $item"
    if (item == "someValue") {
      iterator.remove();
    }
  }
}

List<String> myList = ['one', 'two', 'someValue', 'four']
myMethod(myList)
```