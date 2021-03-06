package br.com.stone.emeraldcomponentsandroid

import android.view.View
import android.view.ViewGroup
import br.com.stone.emeraldcomponents.basic.input.EmeraldMaskedEditText
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.TypeSafeMatcher


/**
 * Created by lucasdiego on 11/09/18.
 * Copyright (c) Stone Co. All rights reserved.
 * lucas.amaral@stone.com.br
 */
object CustomMatcher {

    fun hasTextInputLayoutErrorText(expectedErrorText: String) = object : TypeSafeMatcher<View>() {
        override fun describeTo(description: Description?) {}

        override fun matchesSafely(item: View?): Boolean {
            if (item !is EmeraldMaskedEditText) {
                return false
            }
            return expectedErrorText == item.errorMessage
        }
    }
}