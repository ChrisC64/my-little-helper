package com.lunasol.babyhelper.ui.data

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.lunasol.babyhelper.R

class BabyDetail : Fragment() {

    companion object {
        fun newInstance() = BabyDetail()
    }

    private lateinit var viewModel: BabyDetailViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.baby_detail_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(BabyDetailViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
