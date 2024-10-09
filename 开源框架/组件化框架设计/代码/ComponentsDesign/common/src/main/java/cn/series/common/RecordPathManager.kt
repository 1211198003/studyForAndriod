package cn.series.common

class RecordPathManager {

    companion object{
        private val tag = "RecordPathManager"

        val recordMap = HashMap<String, MutableList<PathBean>>()

        /**
         * TODO 注册类
         *
         * @param groupName 组名， 如：ktv
         * @param pathName 路径名  ktv_KtvNewsActivity
         * @param clazz 类字节码文件
         */
        fun registerRecord(groupName: String, pathName: String, clazz: Class<*>){
            val pathBeanList = recordMap.getOrDefault(groupName, ArrayList<PathBean>())
            pathBeanList.add(PathBean(pathName, clazz))
            recordMap.put(groupName, pathBeanList)
        }

        /**
         * TODO 将已经注册的类，取消注册
         *
         * @param groupName
         * @param pathName
         * @return
         */
        fun unRegisterRecord(groupName: String, pathName: String): Class<*>?{
            if(!recordMap.containsKey(groupName)){
                throw Exception("$groupName: $pathName 没有组册进来哦～")
            }
            val pathBeanLists = recordMap.get(groupName)
            if (pathBeanLists != null) {
                val iterator = pathBeanLists.iterator()
                while (iterator.hasNext()){
                    val bean = iterator.next()
                    if(bean.path.equals(pathName)){
                        iterator.remove()
                        return bean.clazz
                    }
                }
            }
            throw Exception("$groupName: $pathName 没有组册进来哦～")
        }

        /**
         * TODO 通过 groupName_pathName 获取注册进去的类
         *
         * @param groupName
         * @param pathName
         * @return
         */
        fun getClass(groupName: String, pathName: String): Class<*>{
            if(!recordMap.containsKey(groupName)){
                throw Exception("$groupName: $pathName 没有组册进来哦～")
            }
            val pathBeanLists = recordMap.get(groupName)
            if (pathBeanLists != null) {
                val iterator = pathBeanLists.iterator()
                while (iterator.hasNext()){
                    val bean = iterator.next()
                    if(bean.path.equals(pathName)){
                        return bean.clazz
                    }
                }
            }
            throw Exception("$groupName: $pathName 没有组册进来哦～")
        }
    }


}