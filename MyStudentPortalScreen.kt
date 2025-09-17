package com.example.mystudentportal
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.mystudentportal.ui.theme.MyStudentPortalTheme

/*Amber Rodriguez
9.16.25
CMSC 425

Main / start page with Enter button to navigate to Home Page
*/

@Composable
fun MyStudentPortalScreen(
    onEnterButtonClicked: () -> Unit = {},
    modifier: Modifier = Modifier
) {

    Column (modifier = modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center))
    {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            //title text
            Text(
                text = "Welcome to myStudent Portal",
                modifier = modifier
            )//enter button

            Button(
                modifier = Modifier.fillMaxWidth(.5f),
                onClick = onEnterButtonClicked
            ) {
                Text(stringResource(R.string.enter))
            }
        }

    }

}

@Preview(showBackground = true)
@Composable
fun MyStudentPortalScreenPreview() {
    MyStudentPortalTheme {
        MyStudentPortalScreen(
            onEnterButtonClicked = {})
    }
}