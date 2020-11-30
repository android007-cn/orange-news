package cn.cxy.wanandroid.base


/**
 *@创建者wwy
 *@创建时间 2019/9/17 14:53
 *@描述
 */
abstract class BaseVMFragment<VM : BaseViewModel> : BaseFragment() {
    protected lateinit var mViewModel: VM

    override fun onFragmentFirstVisible() {
        mViewModel = initVM()
        startObserve()
        super.onFragmentFirstVisible()
    }


    abstract fun initVM(): VM

    abstract fun startObserve()

}