package br.senai.sp.jandira.telalogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.telalogin.ui.theme.ui.theme.TelaLoginTheme

class Tela02 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TelaLoginTheme {
                SecondScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SecondScreen() {
    Surface(
        modifier = Modifier.fillMaxSize()
    ) {

        Row(
            horizontalArrangement = Arrangement.End
        ) {
            Surface(
                modifier = Modifier
                    .width(120.dp)
                    .height(40.dp),
                shape = RoundedCornerShape(bottomStart = 16.dp),
                color = colorResource(id = R.color.rosa)
            ) {}
        }



        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center
                ){
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Text(
                    text = stringResource(id = R.string.signUp),
                    fontSize = 40.sp,
                    color = colorResource(id = R.color.rosa),
                    letterSpacing = 1.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = stringResource(id = R.string.createNewAccount),
                    fontSize = 20.sp,
                    color = Color.Gray,
                    fontWeight = FontWeight.Light
                )
            }

            Column(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    shape = RoundedCornerShape(16.dp),
                    label = { (Text(stringResource(id = R.string.username))) },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id= R.drawable.baseline_person_24),
                            contentDescription = null,
                            modifier = Modifier.size(32.dp),
                            tint = colorResource(id = R.color.rosa)
                        )
                    }
                )

                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    shape = RoundedCornerShape(16.dp),
                    label = { (Text(stringResource(id = R.string.phone))) },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_phone_24),
                            contentDescription = null,
                            modifier = Modifier.size(32.dp),
                            tint = colorResource(id = R.color.rosa)
                        )
                    }
                )

                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    shape = RoundedCornerShape(16.dp),
                    label = { (Text(stringResource(id = R.string.email))) },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_email_24),
                            contentDescription = null,
                            modifier = Modifier.size(32.dp),
                            tint = colorResource(id = R.color.rosa)
                        )
                    }
                )

                Spacer(modifier = Modifier.height(20.dp))
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    shape = RoundedCornerShape(16.dp),
                    label = { (Text(stringResource(id = R.string.password))) },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.baseline_lock_24),
                            contentDescription = null,
                            modifier = Modifier.size(32.dp),
                            tint = colorResource(id = R.color.rosa)
                        )
                    }
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Start
                ) {
                    Checkbox(
                        checked = true,
                        onCheckedChange = {},
                    )
                    Text(
                        text = stringResource(id = R.string.over18),
                        color = Color.Gray,
                        fontWeight = FontWeight.Light,
                        fontSize = 15.sp
                    )
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(colorResource(id = R.color.rosa)),
                        modifier = Modifier
                            .height(50.dp)
                            .width(270.dp),
                        shape = RoundedCornerShape(15.dp)
                    ) {
                        Text(
                            text = stringResource(id = R.string.createNewAccount).uppercase(),
                            color = Color.White,
                            fontSize = 15.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.End
            ) {
                Text(
                    text = stringResource(id = R.string.alreadyHave),
                    color = Color.Gray,
                    letterSpacing = 1.sp,
                    fontWeight = FontWeight.Light,
                    fontSize = 15.sp
                )
                Spacer(modifier = Modifier.width(3.dp))
                Text(
                    text = stringResource(id = R.string.signIn),
                    color = colorResource(id = R.color.rosa),
                    letterSpacing = 1.sp,
                    fontWeight = FontWeight.Bold,
                    fontSize = 15.sp
                )
            }
        }


        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.Bottom
        ) {
            Surface(
                modifier = Modifier
                    .width(120.dp)
                    .height(40.dp),
                shape = RoundedCornerShape(topEnd = 16.dp),
                color = colorResource(id = R.color.rosa)
            ) {}
        }
    }
}