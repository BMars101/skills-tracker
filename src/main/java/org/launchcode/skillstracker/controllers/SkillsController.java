package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class SkillsController {

    @GetMapping
    public String displaySkills(){
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn</h2>" +
                "<ol>" +
                "<li> Java </li>" +
                "<li> JavaScript </li>" +
                "<li> Python </li>" +
                "</ol>" +
                "</body>" +
                "</html>";
    }

    @PostMapping("favorites")
    public String displayFavoriteSkills(@RequestParam String name, @RequestParam String favoriteSkill, @RequestParam String secondFavSkill, @RequestParam String thirdFavSkill){

        return "<html>" +
                "<body>" +
                "<h1>" + name + "</h1>" +
                "<table>" +
                "<tr>" +
                "<th>First Favorite </th>" +
                "<th>Second Favorite </th>" +
                "<th>Third Favorite </th>" +
                "</tr>" +
                "<tr>" +
                "<td>" + favoriteSkill + "</td>" +
                "<td>" + secondFavSkill + "</td>" +
                "<td>" + thirdFavSkill + "</td>" +
                "</tr>"+
                "</body>" +
                "</html>";
    }



    @GetMapping("form")
    public String getUserSkills(){
        return "<html>" +
                "<body>" +
                "<form method='post' action='/favorites'>" +
                "<label for='name'>Enter Name: </label>" +
                "<input type='text' name='name' /><br>" +
                "<label for='favorite'>My favorite language</label>" +
                "<select name='favoriteSkill'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<label for='favorite'>My second favorite language</label>" +
                "<select name='secondFavSkill'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<label for='favorite'>My third favorite language</label>" +
                "<select name='thirdFavSkill'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Python'>Python</option>" +
                "</select><br>" +
                "<input type='submit' value='Rank Favorites'/>" +
                "</form>" +
                "</body>" +
                "</html>";

    }


}
