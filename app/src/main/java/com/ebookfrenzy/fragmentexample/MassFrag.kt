package com.ebookfrenzy.fragmentexample
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.widget.Button
import kotlinx.android.synthetic.main.length_frag.*
import kotlinx.android.synthetic.main.length_frag.dollarText
import kotlinx.android.synthetic.main.length_frag.textView
import kotlinx.android.synthetic.main.mass_frag.*

class MassFrag : Fragment() {
    override fun onCreateView(inﬂater: LayoutInﬂater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
// Inﬂate the layout for this fragment
        val view = inﬂater.inﬂate(R.layout.mass_frag,
            container, false)
        return view
    }
    fun convertMass(view: View) {

        if (dollarText.text.isNotEmpty()) {

            val massValue = dollarText.text.toString().toFloat()

            val LBValue = massValue * 2.205

            textView.text = LBValue.toString()
        } else {
            textView.text = getString(R.string.no_value_string)
        }
}