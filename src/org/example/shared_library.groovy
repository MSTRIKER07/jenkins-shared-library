package src.org.example

class shared_library implements Serializable {
private steps

shared_library(steps) {
    this.steps = steps
}

def some_func(){
  println steps.globals.my_global()
}
