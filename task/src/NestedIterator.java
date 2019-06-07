/**
 * leetcode 341. Flatten Nested List Iterator
 *
 * 代码在本地跑不起来，因为缺少一些实现。报错看着心烦所以整体注释掉。
 *
 * 这是一道非常神奇的题目，竟然让写了一个迭代器。
 * 整体思路是在创建迭代器时就将所有结果计算出来存于List，然后利用list的迭代器就OK。list.iterator();
 * 与二叉树的遍历一样，也是在模拟系统栈。
 *
 * 一定要注意：栈的顺序 先进后出！！！先进后出！！！先进后出！！！
 * 在处理嵌套的内部元素时，没注意栈的顺序，导致了结果顺序出错。
 * @author : zgl
 * @date : 2019-06-07
 */
/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return null if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
/*public class NestedIterator implements Iterator<Integer> {
    // 模拟系统栈
    private ArrayList<Integer> res;
    private Iterator<Integer> resIterator;

    public NestedIterator(List<NestedInteger> nestedList) {
        this.res = new ArrayList<>();
        Iterator<NestedInteger> listIterator = nestedList.iterator();
        LinkedList<NestedInteger> stack = new LinkedList<>();
        NestedInteger nestedInteger;
        while (listIterator.hasNext()) {
            stack.push(listIterator.next());
            while (!stack.isEmpty()) {
                nestedInteger = stack.pop();
                if (nestedInteger.isInteger()) {
                    this.res.add(nestedInteger.getInteger());
                }
                List<NestedInteger> list = nestedInteger.getList();
                if (null != list) {
                    for (int i = list.size() - 1; i > -1; i--) {
                        stack.push(list.get(i));
                    }
                }
            }
        }
        this.resIterator = this.res.iterator();
    }

    @Override
    public Integer next() {
        return resIterator.next();
    }

    @Override
    public boolean hasNext() {
        return resIterator.hasNext();
    }
}*/

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */