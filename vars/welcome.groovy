def call(name) {
  echo "Hey ${name}, how are you?"
}

def calculator(x,y){
  echo "${x} + ${y} is ${x+y}"
}

def maven_build(){
  maven clean install
}
