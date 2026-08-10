package com.otus.dihomework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.otus.dihomework.di.MainActivityModule
import com.otus.dihomework.ui.theme.DIHomeworkTheme

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (application as ProductsApplication).component
            .mainActivityComponent()
            .create(MainActivityModule(this))
            .inject(this)

        enableEdgeToEdge()

        setContent {
            DIHomeworkTheme {
                MainNavigation()
            }
        }
    }
}
