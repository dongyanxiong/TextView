# TextView
的TextView中的图文居中对齐
查看源码你会发现 ImageSpan构造中可以添加另外的一个参数  就是对其方式
public ImageSpan(Context context, int resourceId, int verticalAlignment) {  
    super(verticalAlignment);  
    mContext = context;  
    mResourceId = resourceId;  
} 
verticalAlignment表示垂直对齐方式，有两个参数 ALIGN_BASELINE、ALIGN_BOTTOM 分别为顶部、底部对齐，但是没有居中对齐的参数（其实会找到这篇文章的人应该知道这点了。。）
通过自定义一个ImageSpan 重写getSize和draw 来实现  具体就不做阐述了。
