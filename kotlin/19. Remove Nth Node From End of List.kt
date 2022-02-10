class ListNode(var value: Int) {
    var next: ListNode? = null
}

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {

        val start = ListNode(0)
        start.next = head

        var current : ListNode? = start
        var next : ListNode? =  start

        for (i in 0 until n) {
            next = next?.next
        }

        while (next?.next != null) {
            current = current?.next
            next = next.next
        }
        current?.next = current?.next?.next
        return start.next
    }
}
