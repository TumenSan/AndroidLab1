package com.example.lab1.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import androidx.lifecycle.ViewModelProvider
import com.example.lab1.R

/**
 * A simple [Fragment] subclass.
 * Use the [VideoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class VideoFragment : Fragment() {
    // TODO: Rename and change types of parameters

    //private var _binding: FragmentNotificationsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    //private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val rootView = inflater.inflate(R.layout.fragment_video, container, false)
        val webView: WebView = rootView.findViewById(R.id.webview)
        //webView.loadUrl("https://developer.android.com/develop/ui/views/layout/webapps/webview")
        webView.loadUrl("https://www.youtube.com/watch?v=mgty3Bgu-YY&ab_channel=LearnEnglishwithEnglishClass101.com")
        return rootView

        //val notificationsViewModel = ViewModelProvider(this).get(NotificationsViewModel::class.java)

        //_binding = FragmentNotificationsBinding.inflate(inflater, container, false)
        //val root: View = binding.root

        //binding.webview.loadUrl("https://developer.android.com/develop/ui/views/layout/webapps/webview")

        //return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        //_binding = null
    }
}