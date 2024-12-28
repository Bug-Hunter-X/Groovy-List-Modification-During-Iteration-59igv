```groovy
def myMethod(List<String> list) {
  list.eachWithIndex { item, index ->
    println "Item $index: $item"
    if (item == "someValue") {
      list.remove(item) //This is the problematic line
    }
  }
}

List<String> myList = ['one', 'two', 'someValue', 'four']
myMethod(myList)
```