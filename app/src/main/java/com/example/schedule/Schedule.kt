package com.example.schedule

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.util.*


@Composable
fun ScheduleItemLive() {
    val configuration = LocalConfiguration.current

    val screenWidth = configuration.screenWidthDp.dp
    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(5.dp))
            .background(colorResource(id = R.color.item_background))
            .width(screenWidth * 75 / 100)
    ) {
        Surface(
            modifier = Modifier.width(screenWidth * 75 / 100),
            color = colorResource(id = R.color.header_background)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.padding(12.dp)
            ) {
                Row {
                    Text(
                        text = "1/22",
                        color = Color.White,
                    )
                    Text(
                        text = "LIVE",
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                }
                Text(
                    text = "ABC / ESPN+",
                    color = Color.White,
                )

            }

        }
//        TeamDetailLive()
//        TeamDetailLive()
        Button(
            onClick = { },
            colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.item_background)),
            border = BorderStroke(1.dp, colorResource(id = R.color.border_background)),
            modifier = Modifier
                .width(screenWidth * 75 / 100)
                .padding(horizontal = 10.dp)


        ) {
            Text(text = "Go to game center",
                color = Color.White)
        }
    }

}


@Composable
fun ScheduleItem() {
    val configuration = LocalConfiguration.current

    val screenWidth = configuration.screenWidthDp.dp
    Column(
        modifier = Modifier
            .clip(RoundedCornerShape(5.dp))
            .background(colorResource(id = R.color.item_background))
            .width(screenWidth * 75 / 100)

    ) {
        Surface(
            modifier = Modifier.width(screenWidth * 75 / 100),
            color = colorResource(id = R.color.header2_background)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.padding(12.dp)
            ) {
                Row {
                    Text(
                        text = "1/22",
                        color = Color.White,
                    )
                    Text(
                        text = "8pm EST",
                        color = Color.White,
                        modifier = Modifier.padding(horizontal = 8.dp)
                    )
                }
                Text(
                    text = "ABC / ESPN+",
                    color = Color.White,
                )

            }

        }
//        TeamDetailLive()
//        TeamDetailLive()
        Row(horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .width(screenWidth * 75 / 100)) {
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.item_background)),
                border = BorderStroke(1.dp, colorResource(id = R.color.border_background)),
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)

            ) {
                Text(text = "Buy Tickets",
                    color = Color.White)
            }
            Button(
                onClick = { },
                colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = R.color.item_background)),
                border = BorderStroke(1.dp, colorResource(id = R.color.border_background)),
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Text(text = "Set Alert",
                    color = Color.White)
            }
        }

    }

}

@Composable
fun TeamDetail() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp)
    ) {

        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = null,
            modifier = Modifier.size(40.dp)
        )
        Text(
            text = "Capital".uppercase(Locale.getDefault()),
            fontWeight = FontWeight.Bold,
            color = Color.White,
            fontSize = 20.sp

        )}

}

//
//@Composable
//fun TeamDetailLive() {
//    Row(
//        horizontalArrangement = Arrangement.SpaceBetween,
//        verticalAlignment = Alignment.CenterVertically,
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(horizontal = 12.dp)
//    ) {
//        Row(verticalAlignment = Alignment.CenterVertically) {
//
//            Image(
//                painter = painterResource(id = R.drawable.team1_logo),
//                contentDescription = null,
//                modifier = Modifier.size(40.dp)
//            )
//            Text(
//                text = "Capital".uppercase(Locale.getDefault()),
//                fontWeight = FontWeight.Bold,
//                style = MaterialTheme.typography.h5,
//                color = Color.White,
//                fontSize = 20.sp
//
//            )
//        }
//        Text(
//            text = "1",
//            fontWeight = FontWeight.Bold,
//            color = Color.White,
//            fontSize = 20.sp
//
//        )
//
//
//    }
//}
