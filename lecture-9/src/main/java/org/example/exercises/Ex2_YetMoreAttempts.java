package org.example.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex2_YetMoreAttempts
{
    public static void main(String[] args)
    {

        // This is a continuation from Ex2_FurtherAttemptLecturer, which itself is a continuation from Ex2_ExtraStuff.

        String ifsOutlook = "Key findings" +
                "1.  The most recent official economic and fiscal forecasts, from March 2022, had the government meeting its fiscal targets with a current budget surplus (i.e. total revenues exceeding day-to-day spending) from 2023–24 onwards and underlying public sector net debt on course to fall, albeit modestly, as a fraction of national income from the same year. The Office for Budget Responsibility (OBR) calculated that the government’s mandate to have debt forecast to fall was met by a margin of £28 billion. " +
                "" +
                "2.  Much has changed. Under Citi’s macroeconomic forecast, which underpins our analysis of the public finances, rising inflation and interest rates will add to public spending on working-age benefits, state pensions and debt interest. Recent policy decisions, such as the Energy Price Guarantee and the new government’s package of permanent tax cuts, will also add to borrowing. Overall, we forecast that borrowing this year will be £194 billion, which would be £94 billion higher than the £99 billion forecast in March. Of this increase, £68 billion is explained by support for energy bills announced since March (net of revenues from the new energy profits levy). " +
                "" +
                "3.  But more important for the sustainability of the public finances is the outlook for borrowing in the medium term. Even once the energy support packages are assumed to expire, borrowing remains elevated. There is huge uncertainty around the exact magnitude, but under a central forecast in 2026–27 we expect borrowing of £103 billion, which would be £71 billion higher than forecast in March. Much of this increase is uncertain – it will in particular depend on the path of the economy, inflation and interest rates – but less uncertain is £43 billion of the increase in borrowing, which is explained by the direct impact of the permanent tax cuts announced by the new Chancellor, Kwasi Kwarteng. " +
                "" +
                "4.  We forecast that spending on debt interest will be £103 billion in 2023–24, double the £51 billion forecast by the OBR in March and which was already an upwards revision on the £39 billion the OBR forecast in October 2021. Much of this increase in debt interest spending will dissipate as long as inflation falls back. But even in 2026–27 we forecast that debt interest spending will be £66 billion, some £18 billion higher than forecast by the OBR in March, £26 billion more than forecast in October 2021 and £9 billion more than was spent in 2021–22, as a result of higher interest rates and a higher level of accumulated debt." +
                "" +
                "5.  In line with stated government policy, we assume that the government keeps broadly to the departmental spending plans set out a year ago. This is despite rising inflation eating into the implied real increases: restoring their generosity would require an additional £14 billion of spending in 2023–24 and £23 billion in 2024–25. Keeping to the existing cash spending plans is essentially imposing a rather hidden form of austerity on departments, and doing so in a rather arbitrary way, as it depends on the extent to which rising prices are adding to the spending pressures of each department – which will not be equivalent across the public sector." +
                "" +
                "6.  The Chancellor has promised a ‘fully costed plan to get debt falling in the medium-term’. Pushing back the definition of the medium term from three years to five years could make this aim easier, but still far from easy, to meet. Under Citi’s central forecast, it would require a fiscal tightening of £62 billion in 2026–27 to stabilise debt as a fraction of national income – so even reversing all of the permanent tax cuts in Mr Kwarteng’s ‘mini-Budget’ would not be enough. Higher growth would help – but even if growth turned out to be 0.25 percentage points a year stronger than Citi expects, a fiscal tightening of £41 billion would be required to stabilise debt. " +
                "" +
                "7.  The government might be inclined to deliver any fiscal tightening through spending cuts. Supposing £62 billion of cuts were required, one way to achieve this would be as follows. Indexing working-age benefits to growth in earnings rather than prices in the next two years would cut spending by £13 billion, with most of the losses being felt by working-age households in the bottom half of the income distribution. A further £14 billion could come from cutting investment spending plans to 2% of national income, though this might be difficult to square with a government intent on boosting growth. The remaining £35 billion could come from a 15% cut to day-to-day spending on public services outside of the NHS and Ministry of Defence budgets, but this would require cutting spending in many areas where deep cuts were delivered between 2010 and 2019. Such spending cuts could be done, but would be far from easy." +
                "" +
                "8.  Uncertainty around any public finance forecast means it is possible debt will fall as a share of national income. But being able to realistically expect it to fall requires a central view of economic growth and what tax and spending policies will actually be pursued. While we should hope for better growth, the rationale for an independent OBR is to ensure that politically motivated wishful thinking is not incorporated into economic and fiscal forecasts. The OBR should continue its practice of not incorporating hoped-for growth improvements arising from supply-side reforms until evidence of stronger growth starts to emerge." +
                "" +
                "9.  Recent events have illustrated the importance of a credible strategy and plan for fiscal sustainability. Just as financial markets – which ultimately have to lend the money required to plug the gap in the government’s fiscal plans – might be unconvinced by plans underpinned by an assumption of a miraculous uptick in growth, so too might they be unconvinced by plans underpinned by vague promises of public spending cuts far into the future. We need to avoid the situation Mr Kwarteng wrote about in 2012 where ‘in each new budget the government promised their books would balance tomorrow – but tomorrow never seemed to arrive’. The OBR should therefore be very wary of a promise to cut spending in four or five years’ time without sufficient detail of where the axe would fall.";


        List<String> lecturerList = lecturerSplit(ifsOutlook);
        List<String> mazdakList = mazSplit(ifsOutlook);
        List<String> combinedList = combinedPattern(ifsOutlook);


        // replacing the List in the below loop will provide the results for lecturer's RegEx, StackOverflow user 'Maxdak' and also mine
        for (String sentence : combinedList)
        {
            if (CheckIfSentenceContainsWord(sentence, "fiscal"))
            {
                System.out.printf("Sentence %s contains the word fiscal.\n", sentence);
            }
        }
    }

    public static List<String> lecturerSplit(String paragraph)
    {
        //Poached from Lecturer, who poached from https://stackoverflow.com/questions/21430447/how-to-split-paragraphs-into-sentences
        List<String> sl = new ArrayList<>();
        Pattern re = Pattern.compile("[^.!?\\s][^.!?]*(?:[.!?](?!['\"]?\\s|$)[^.!?]*)*[.!?]?['\"]?(?=\\s|$)", Pattern.MULTILINE | Pattern.COMMENTS);
        Matcher reMatcher = re.matcher(paragraph);
        while (reMatcher.find())
        {
            sl.add(reMatcher.group());
        }
        return sl;
    }

    public static List<String> mazSplit(String paragraph)
    {
        //Poached from 'Mazdak' from https://stackoverflow.com/questions/29594776/skipping-sections-dynamically-in-a-regular-expression/
        List<String> sl = new ArrayList<>();
        Pattern mazPattern = Pattern.compile("[^.!?\\s][^.!?]*", Pattern.MULTILINE | Pattern.COMMENTS);
        Matcher reMatcher = mazPattern.matcher(paragraph);
        while (reMatcher.find())
        {
            sl.add(reMatcher.group());
        }
        return sl;
    }

    public static List<String> combinedPattern(String paragraph)
    {
        //combined pattern:
        Pattern combinedPattern = Pattern.compile("[^0-9\\s][^().]*\\([^)]*\\)[^().]*[.]|[^.!?\\s][^.!?]*[^.\\s|^.*][.]", Pattern.MULTILINE | Pattern.COMMENTS);
        List<String> sl = new ArrayList<>();
        Matcher reMatcher = combinedPattern.matcher(paragraph);
        while (reMatcher.find())
        {
            sl.add(reMatcher.group());
        }
        return sl;
    }

    public static boolean CheckIfSentenceContainsWord(String sentence, String word)
    {
        word = word.toLowerCase();
        String[] words = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        for (String w : words)
        {
            if (word.equals(w))
            {
                return true;
            }
        }

        return false;
    }


}
