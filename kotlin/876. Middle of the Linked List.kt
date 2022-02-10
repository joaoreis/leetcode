class ListNode(var value: Int) {
    var next: ListNode? = null
}

class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        var fast = head
        var slow = head

        while (fast?.next != null ) {
            slow = slow?.next
            fast = fast.next?.next
        }
        return slow
    }
}
