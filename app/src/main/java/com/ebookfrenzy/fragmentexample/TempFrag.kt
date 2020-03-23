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
import kotlinx.android.synthetic.main.temp_frag.*

class TempFrag : Fragment() {
    override fun onCreateView(inﬂater: LayoutInﬂater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
// Inﬂate the layout for this fragment
        val view = inﬂater.inﬂate(R.layout.temp_frag,
            container, false)
        return view
    }
    fun convertLength(view: View) {

        if (dollarText.text.isNotEmpty()) {

            val TempValue = dollarText.text.toString().toFloat()

            val TValue =(TempValue -32)/1.800

            textView.text = TempValue.toString()
        } else {
            textView.text = getString(R.string.no_value_string)
        }
}