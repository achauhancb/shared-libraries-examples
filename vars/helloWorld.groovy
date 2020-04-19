def call(Map config){
  sh "echo Hello ${config.name}. It is ${config.dayOfWeek}"
}
