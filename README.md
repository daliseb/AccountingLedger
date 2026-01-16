# Accounting Ledger Application (Dalis' Smoothie Shop)
The objective of this project, was to create an accounting application that helps the user store,organize and display transactions.

-it is important to identify the first step, "What do we need our application to do exactly?"
This, sets us up with a game plan, we can then start thinking on the steps that we need to achieve our requirements! 

<img width="450" height="450" alt="Making my board jira" src="https://github.com/user-attachments/assets/47755d74-8d86-4364-95a6-977df80ab6c1" />

*** Above, I have added a picture of my Jira boards, Jira helped my tremendosly when it came to sorting things out, I am a visual learner so it was helpful to see all of my steps displayed out for me. The boards, as shown above are where you can put an overview of your steps. 

<img width="450" height="450" alt="Making my timeline" src="https://github.com/user-attachments/assets/325a372f-8475-4eab-9888-9a54e275a95f" />

*** Above, we have an image of the timeline, as I mentioned before, the boards in Jira gave me an overview of larger tasks while the timeline went into more detail. 

<img width="450" height="450" alt="setting up my workbooks" src="https://github.com/user-attachments/assets/04c4c357-c144-49a5-8cb2-49f8f5486426" />

*** What else do we need to properly game plan? Above, I have my set up, I have two screens and I was able to pull up all of my resources to be able to switch from each workbook back and forth! This way, I can use one of my screens soley for having intelliJ and Zoom pulled up. I have stated before that I am a visual learner so it is important to me that I can easily refer back to my workbooks and reference them when needed. 

<img width="450" height="450" alt="making my csv file" src="https://github.com/user-attachments/assets/e1274a44-3b12-4d00-a69f-51da404efba1" />

***I have added a way that I used ChatGPT for learning purposes (: , I used it to help generate my transactions for my imaginary smoothie shop, as you can see, I prompted Chat to give me a wide variety of dates that can be used when it is time to create my csv file!


<img width="450" height="450" alt="stuck on reading csv file" src="https://github.com/user-attachments/assets/aca3f4ee-d04d-47da-bf79-878b765af80d" />

***This was the first problem that I encountered, I understood that I needed to create a file reader and buffered reader to read the csv file that I had created, I attempted to do this but after some advice from my classmates, I figured that at the moment it was not the most important thing and decided to prioritize other things such as building my menus. 

<img width="450" height="450" alt="moving onto my main menu" src="https://github.com/user-attachments/assets/dbec2bbc-ad9d-4dd6-b90f-9968e5b74126" />

****I decided to move onto creating my main menu screen! After all, this is the home screen for our overall application, without this screen, the user cannot input options.

<img width="450" height="450" alt="creating methods for my options" src="https://github.com/user-attachments/assets/a6dc3fe0-cd29-4dab-be46-7ef0c0ea5c94" />

****After creating a switch/case for each of my options, I found it easier to input my method for reading the csv file, because NOW, I finally had a spot to put it and a place where it NEEDED to be called!

<img width="450" height="450" alt="creating method to read csv" src="https://github.com/user-attachments/assets/64d44840-4865-4b2d-835a-4eea1281fefa" />

*****As you can see above, I had to create a brand new method to be able to pull the text from my csv AND add onto it. For example, when the options such as add deposit or add payment are selected, the user input can then go back into the csv file. 


<img width="450" height="450" alt="creating my previous month display" src="https://github.com/user-attachments/assets/4037a56e-1dd3-46d3-827f-2624e4beb3ea" />

****A requirement for our capstone was to create a reports menu, within the ledger menu, that was able to filter out dates, such as month to date, previous month, year to date and previous year! I did some research on W3 schools, I used the java oracle website and a website called geeks for geeks that explained "Is After", "Is Before" and "Is Equal To" methods. This made it easier to understand and broke things down for me.

<img width="450" height="450" alt="trouble shooting" src="https://github.com/user-attachments/assets/e1b28386-3a1c-4eee-8a1b-2496f6e20a55" />

****Although this method was easier to understand, I still ran into trouble along the way, Here I am trouble shooting the issue and seeing if my prompts are pulling my files from csv correctly. As shown above, I was able to write system.out.println(dateStart) and system.out.println("monthStart") to be able to isolate these dates to make sure it was pulling the correct ones. 


<img width="450" height="450" alt="more troubleshooting" src="https://github.com/user-attachments/assets/6c6a22ab-6499-49f8-a9e2-6485766d668a" />

****Another example of my trouble shooting^^^^



<img width="450" height="450" alt="monthto date finally worked" src="https://github.com/user-attachments/assets/ae93622b-8267-4458-9af0-5b3e7ff9303b" />

****I finally got it to work here! ◝(ᵔᗜᵔ)◜


<img width="450" height="450" alt="There is patterns in my code" src="https://github.com/user-attachments/assets/544da018-a782-40b0-9d45-4cad03793ce1" />

****This was relevent to most of my methods but was shown very well here, the structure was the same, for example, the same method I used for my month to date, I was able to apply it to my previous month, year to date and previous year! This made things so much easier and faster as I kept going.


<img width="450" height="450" alt="setting a reminder comment" src="https://github.com/user-attachments/assets/41edcadd-b531-436a-952f-198784c702aa" />

****At the end of the day, It is important to add reminders of what needs to be done, this helped me greatly as I was able to remember what I was working on at the next day. 

<img width="450" height="450" alt="realizing that there was getters and setters that werent needed" src="https://github.com/user-attachments/assets/f268d5b1-c045-4115-a85a-615b81382329" />

****After I began to polish and take out everything that was not used, with this project I was able to see how not all getters and setters were used, I went ahead and deleted them to clean up my screen. 

<img width="450" height="450" alt="all 3 completed screens " src="https://github.com/user-attachments/assets/0d1e5a22-8fb2-4610-8468-c842f76254fc" />

****I am very proud of my screens!! Here is an example on how I was able to call back the previous screen. This also took some tweaking, mainly using my return function or simply calling it back in the switch case.

<img width="450" height="450" alt="my peers helping me condense for a better view" src="https://github.com/user-attachments/assets/41ebe930-c75b-4e8f-a842-dbfe589b276b" />


***My final steps to get ready for presentation day!!!! At the last day, I gathered with my classmates to present and rehearse our presentations, I was suggested to condense everything, to make it easier to read and present, an amazing suggestion! (thank you Muhammed M!) 

Although this project proved to be rigourous, I made it through with the help of my tutor, my classmates and my instructor. There is SO many ways to do the same things. Moral of the story is to ask for help when it is needed. THANK YOU





