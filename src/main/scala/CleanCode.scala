class CleanCode {

  object Integer {
    class C {
      val greater = 0
      val smaller = 0
    }

    def func1(arr: Array[Int], n: Int): Integer.C = {
      val c = new Integer.C
      var i = 0
      if (n == 1) {
        c.smaller = arr(0)
        c.greater = arr(0)
        return c
      }
      if (arr(0) > arr(1)) {
        c.smaller = arr(0)
        c.greater = arr(1)
      }
      else {
        c.smaller = arr(1)
        c.greater = arr(0)
      }
      i = 2
      while ( {
        i < n
      }) {
        if (arr(i) > c.smaller) c.smaller = arr(i)
        else if (arr(i) < c.greater) c.greater = arr(i)

        i += 1
      }
      c
    }

    def main(args: Array[String]): Unit = {
      val arr = Array(56, 11, 405, 10, 325, 999, 768,555)
      val s = 8
      val c = func1(arr, s)
      System.out.printf("\na is %d", c.greater)
      System.out.printf("\nb is %d", c.smaller)
    }
  }

}
