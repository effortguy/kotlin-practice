package practice

class DelegatingCollection<T> (
    innerList: Collection<T> = ArrayList<T>()
) : Collection<T> by innerList