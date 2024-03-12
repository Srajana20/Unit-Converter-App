package com.example.srajanaapp

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.srajanaapp.ui.theme.SrajanaappTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SrajanaappTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                     userDetails()
                }
            }
        }
    }
}

@Composable
fun userDetails(){
    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment =Alignment.CenterHorizontally
        ){

        Text(text = "Welcome Learners !!")
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Fill the form below:")
        Spacer(modifier = Modifier.height(16.dp))
        Row(){
            Text(text ="Name : " )
//            TextField(value = "Enter your name", onValueChange = {})
//            BasicText(text = "enter the name")
              OutlinedTextField(value = "name here!", onValueChange ={} )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Row(){
            Text(text ="Email : " )
            TextField(value = "Enter your  valid mail id ", onValueChange = {})

        }
        Row() {

            Box() {

                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Gender :")
                    Icon(Icons.Default.ArrowDropDown, contentDescription = "")
                }
                DropdownMenu(expanded = true, onDismissRequest = { /*TODO*/ }) {
                    DropdownMenuItem(text = { Text(text="Male") }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text(text="Female") }, onClick = { /*TODO*/ })
                    DropdownMenuItem(text = { Text(text="Other") }, onClick = { /*TODO*/ })
                    
                }

            }
        }
        Row(){
            Box() {
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Mail us :")
                    Icon(Icons.Default.Email, contentDescription = "")
                }

            }
            Box(){
                Button(onClick = { /*TODO*/ }) {
                    Text(text = "Phone us:")
                    Icon(Icons.Default.Phone, contentDescription = "")
                }
            }





        }


    }
}



@Preview(showBackground = true)
@Composable
fun userDetailsPreview(){
    userDetails()
}