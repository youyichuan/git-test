package cn.yyc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 一致性Hash，每添加一个节点会产生64个虚拟节点（版本控制）
 * Created by Administrator on 2017/9/23.
 */
public class ConsistencyHash {
    // list_0 = "192.168.137.1"
    // list_1 = "192.168.137.2"
    // map是按照key值排序
    private static final Map<Integer, String> map = new LinkedHashMap<Integer, String>();

    // 转换node,获取一个数字(0~2的31次方-1)
    public static Integer hash(Object node) {
        return 0;
    }
    // 添加节点
    public static Integer addNode(Object node) {
        /** 该过程需添加虚拟节点
         *  [自身一种思考思路->整个环%64，使用位操作保证不溢出]
         */
        return 0;
    }
    // 删除节点
    public static Boolean deleteNode(Object node) {
        return true;
    }
    // 查找key位置
    public static Integer lookUp(Object key) {
        // 计算hash(key)在map中的位置
        return 0;
    }
}
