package com.project.assignment.data

import com.project.assignment.model.ImageData

class DataSource {

    fun loadImages(): List<ImageData> {

        return listOf(
                ImageData("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-1_1.jpg"),
                ImageData("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-2_1.jpg"),
                ImageData("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-3_1.jpg"),
                ImageData("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-4_1.jpg"),
                ImageData("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-5_1.jpg"),
                ImageData("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-6_1.jpg"),
                ImageData("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-7_0.jpg"),
                ImageData("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-8_1.jpg"),
                ImageData("https://gamedata.britishcouncil.org/sites/default/files/attachment/number-9_1.jpg")

        )

    }

}