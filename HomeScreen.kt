package com.example.mystudentportal
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
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

Home Screen page created to have buttons that allow you to
navigate to the Student Profile Page, Class Schedule Page, back and an exit.
*/


@Composable
fun HomeScreen(
    onProfileButtonClicked: () -> Unit = {},
    onScheduleButtonClicked: () -> Unit = {},
    onBackButtonClicked: () -> Unit = {},
    onExitButtonClicked: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Column(modifier = modifier
        .fillMaxSize()
        .wrapContentSize(Alignment.Center))
    {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            //title text
            Text(stringResource(R.string.home),
                style = MaterialTheme.typography.headlineSmall)


            //buttons labeled profile, schedule , back, exit
            Button(
                modifier = Modifier.fillMaxWidth(.5f),
                onClick = onProfileButtonClicked
            ) {

                Text(stringResource(R.string.profile))

            }
            Button(
                modifier = Modifier.fillMaxWidth(.5f),
                onClick = onScheduleButtonClicked
            ) {
                Text(stringResource(R.string.schedule))

            }
            Button(
                modifier = Modifier.fillMaxWidth(.5f),
                onClick = onBackButtonClicked
            ) {
                Text(stringResource(R.string.back))
            }
            Button(
                modifier = Modifier.fillMaxWidth(.5f),
                onClick = onExitButtonClicked
            ) {
                Text(stringResource(R.string.exit))
            }
        }
    }
}



@Preview
@Composable
fun HomeScreenPreview() {
    MyStudentPortalTheme {
        HomeScreen(
            onProfileButtonClicked = {},
            onScheduleButtonClicked = {},
            onBackButtonClicked = {},
            onExitButtonClicked = {},


            modifier = Modifier.fillMaxHeight()
        )
    }
}

