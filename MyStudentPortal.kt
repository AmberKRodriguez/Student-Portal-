package com.example.mystudentportal
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController

/*Amber Rodriguez
9.16.25
CMSC 425

Main Navigation Page that connects all classes 
*/

enum class MyStudentPortal() {
                             Start, Home, Profile, Schedule

}
@Composable
fun MyStudentPortalApp(
    navController: NavHostController = rememberNavController()
) {
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = MyStudentPortal.valueOf(
        backStackEntry?.destination?.route ?: MyStudentPortal.Start.name)
//Navigation start
    NavHost(
        navController = navController,
        startDestination = MyStudentPortal.Start.name,
        modifier = Modifier.padding()
    ) {
//when click enter button navigate to home page
        composable(route = MyStudentPortal.Start.name) {
            MyStudentPortalScreen(
                onEnterButtonClicked = {
                    navController.navigate(MyStudentPortal.Home.name)
                }
            )
        }

       //Home Screen page navigate to the Student Profile Page, Class Schedule Page, back and an exit.
        composable(route = MyStudentPortal.Home.name) {
            HomeScreen(
                onProfileButtonClicked ={
                    navController.navigate(MyStudentPortal.Profile.name)},
                onScheduleButtonClicked = {
                    navController.navigate(MyStudentPortal.Schedule.name)},
                onBackButtonClicked = {
                    navController.navigate(MyStudentPortal.Start.name)},
                onExitButtonClicked ={
                        navController.navigate(MyStudentPortal.Start.name)},
            )
        }
        // back and an exit navigation to home and main screen from schedule page

        composable(route = MyStudentPortal.Schedule.name) {
            ScheduleScreen(
                onBackButtonClicked = {
                    navController.navigate(MyStudentPortal.Home.name)
                },
                onExitButtonClicked = {
                    navController.navigate(MyStudentPortal.Start.name)
                }
            )
        }

        // back and an exit navigation to home and main screen from profile page

        composable(route = MyStudentPortal.Profile.name) {
            ProfileScreen(
                onExitButtonClicked = {
                    navController.navigate(MyStudentPortal.Start.name)},
                onBackButtonClicked = {
                    navController.navigate(MyStudentPortal.Home.name)
                }
            )
        }

    }

}


