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

Schedule page with exit and back button to navigate to home and main page
*/

@Composable
fun ScheduleScreen(
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
            Text(stringResource(R.string.schedule),
                style = MaterialTheme.typography.headlineSmall)

            Text(stringResource(R.string.scheduleInfo))

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
fun ScheduleScreenPreview() {
    MyStudentPortalTheme {
        ScheduleScreen(
            onExitButtonClicked = {},
            onBackButtonClicked = {},
            modifier = Modifier.fillMaxHeight()
        )
    }
}

