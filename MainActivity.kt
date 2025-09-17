package com.example.mystudentportal
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.mystudentportal.ui.theme.MyStudentPortalTheme

/*Amber Rodriguez
9.16.25
CMSC 425
*/
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyStudentPortalTheme {
                MyStudentPortalApp() //call  MyStudentPortalApp
                }
            }
        }
    }
