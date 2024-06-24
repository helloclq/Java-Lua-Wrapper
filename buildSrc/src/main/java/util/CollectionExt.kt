package util

fun <T> List<T>.getSafe(index: Int) : T? {
  return if (this.size > index) {
    this[index]
  } else {
    null
  }
}