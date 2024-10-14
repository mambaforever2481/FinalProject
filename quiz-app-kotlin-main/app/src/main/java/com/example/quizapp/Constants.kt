package com.example.quizapp

object Constants {
    val USER_NAME: String = "user_name"
    val TOTAL_QUESTIONS: String = "total_questions"
    val SCORE: String = "score"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val questionOne = Question(
            1,
            "Where is this national park located?",
            R.drawable.au_park,
            arrayListOf("Argentina", "Australia", "Canada", "Germany"),
            1,
        )
        questionsList.add(questionOne)

        // 2
        val questionTwo = Question(
            2,
            "In what national park was this photo taken?",
            R.drawable.banff_park,
            arrayListOf("Banff National Park", "Rocky Mountain National Park",
            "Great Sand Dunes National Park", "Jordan National Park"),
            0
        )
        questionsList.add(questionTwo)

        // 3
        val questionThree = Question(
            3,
            "Which North American National Park is this?",
            R.drawable.bigbend_park,
            arrayListOf("Arches National Park", "Carlsbad Caverns National Park",
            "Big Bend National Park", "Brazil National Park"),
            2
        )
        questionsList.add(questionThree)

        // 4
        val questionFour = Question(
            4,
            "Which southeast Asian national park is this?",
            R.drawable.bataan_park,
            arrayListOf("Khao Yai National Park", "Bataan National Park",
            "Komodo National Park", "Kelimutu National Park"),
            1
        )
        questionsList.add(questionFour)

        // 5
        val questionFive = Question(
            5,
            "Which US national park is in this photo?",
            R.drawable.in_park,
            arrayListOf("Indiana Dunes National Park", "Great Sand Dunes National Park",
            "Olympic National Park", "Grand Teton National Park"),
            0
        )
        questionsList.add(questionFive)

        // 6
        val questionSix = Question(
            6,
            "From what country is this national park located?",
            R.drawable.ut_park,
            arrayListOf("Germany", "Georgia",
            "Greece", "none of these"),
            3
        )

        questionsList.add(questionSix)

        // 7
        val questionSeven = Question(
            7,
            "In what continent is this National Park Located?",
            R.drawable.thai_park,
            arrayListOf("North America", "South America",
            "Europe", "Asia"),
            3
        )
        questionsList.add(questionSeven)

        // 8
        val questionEight = Question(
            8,
            "What country lays claim to this National Park?",
            R.drawable.ph_park,
            arrayListOf("Hungary", "Iran",
            "India", "The Philippines"),
            3
        )
        questionsList.add(questionEight)

        // 9
        val questionNine = Question(
            9,
            "In which US state is this National Park Located?",
            R.drawable.arch_park,
            arrayListOf("Indiana", "Utah",
            "California", "Colorado"),
            1
        )
        questionsList.add(questionNine)

        // 10
        val questionTen = Question(
            10,
            "What is the name of this National Park?",
            R.drawable.rmnp_park,
            arrayListOf("Rocky Mountain National Park", "Great Smoky Mountains National Park",
            "Glacier National Park", "Badlands National Park"),
            0
        )
        questionsList.add(questionTen)

        return questionsList
    }
}