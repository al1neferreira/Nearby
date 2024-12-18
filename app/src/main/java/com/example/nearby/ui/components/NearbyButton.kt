package com.example.nearby.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun NearbyButton(
    modifier: Modifier = Modifier,
    text: String? = null,
    @DrawableRes iconRes: Int? = null,
    onClick: () -> Unit
) {
    Button(modifier = modifier, onClick = onClick) {
        text?.let { Text(text = text) }

    }

}

@Preview
@Composable
private fun NearbyButtonPreview() {
    NearbyButton(modifier = Modifier.fillMaxWidth(), text = "Confirmar", iconRes = null) { }

}