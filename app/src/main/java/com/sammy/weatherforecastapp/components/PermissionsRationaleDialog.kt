package com.sammy.weatherforecastapp.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material.AlertDialog
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

@Composable
fun PermissionsRationaleDialog(
    positiveAction: () -> Unit,
    negativeButton: () -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        AlertDialog(
            title = {
                Text(
                    text = "Enable Location",
                    style = TextStyle(
                        color = Color.Black,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold
                    )
                )
            },
            text = {
                Text(
                    text = "Location Permission is needed in order to use this application",
                )
            },
            onDismissRequest = {

            },
            confirmButton = {
                TextButton(
                    onClick = {
                        positiveAction.invoke()
                    }) {
                    Text("Ok", style = TextStyle(color = Color.Black))
                }
            },
            dismissButton = {
                TextButton(
                    onClick = {
                        negativeButton.invoke()
                    }) {
                    Text("CANCEL", style = TextStyle(color = Color.Black))
                }
            }
        )
    }
}