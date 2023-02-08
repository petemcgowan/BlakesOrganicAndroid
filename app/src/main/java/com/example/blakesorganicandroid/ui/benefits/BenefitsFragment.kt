package com.example.blakesorganicandroid.ui.benefits


import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.blakesorganicandroid.R
import com.example.blakesorganicandroid.databinding.FragmentBenefitsBinding
import com.example.blakesorganicandroid.ui.*


class BenefitsFragment : Fragment(), ItemClickListener {

    private var _binding: FragmentBenefitsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBenefitsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        if (benefitsList.size == 0)
            populateBenefits()

        binding.recyclerview.layoutManager = GridLayoutManager(activity, 1)
        binding.recyclerview.adapter = CardAdapter(benefitsList, this)
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onClick(book: Item)
    {
        val intent = Intent(activity, BenefitDetailActivity::class.java)
        intent.putExtra(ITEM_ID_EXTRA, book.id)
        startActivity(intent)
    }

    private fun populateBenefits()
    {
        val benefit1 = Item(
            R.drawable.benefit1_kefir_nutrients,
            "Kefir originated from parts of Eastern Europe and Southwest Asia. Its name comes from the Turkish word “keyif,” which refers to feeling good after eating.\n" +
                    "\n" +
                    "This is a fermented drink, traditionally made with cow’s milk or goat’s milk.\n" +
                    "\n" +
                    "It is made by adding kefir grains to the milk. These are not cereal grains, but grain-like colonies of yeast and lactic acid bacteria that resemble a cauliflower in appearance.\n" +
                    "\n" +
                    "Over approximately 24 hours, the microorganisms in the kefir grains multiply and ferment the sugars in the milk, turning it into kefir. Then, the grains are removed from the liquid and can be used again.\n" +
                    "\n" +
                    "In other words, kefir is the drink, but kefir grains are the starter culture that used to produce the beverage.\n" +
                    "\n" +
                    "The grains’ lactic acid bacteria turn the milk’s lactose into lactic acid. This is what makes kefir taste sour like yogurt — but it has a thinner consistency.\n" +
                    "\n" +
                    "A 1 cup serving of low fat kefir contains:\n" +
                    "\n" +
                    "Protein: 9 grams\n" +
                    "Calcium: 24% of the daily value (DV)\n" +
                    "Phosphorus: 20% of the DV\n" +
                    "Vitamin B12: 29% of the DV\n" +
                    "Riboflavin (B2): 25% of the DV\n" +
                    "Magnesium: 7% of the DV\n" +
                    "Vitamin D: 12% of the DV\n" +
                    "In addition, kefir has about 104 calories, 11.6 grams of carbs, and 2–3 grams of fat, depending on the type of milk used.\n" +
                    "\n" +
                    "Kefir also contains a wide variety of bioactive compounds, including organic acids and peptides that contribute to its health benefits.\n" +
                    "\n" +
                    "Dairy-free versions of kefir can be made with coconut water, coconut milk, or other sweet liquids. These will not have the same nutrient profile as dairy-based kefir.",
            "Kefir is a fantastic source of many nutrients",
            "Kefir originated from parts of Eastern Europe and Southwest Asia. Its name comes from the Turkish word “keyif,” which refers to feeling good after eating.\n" +
                    "\n" +
                    "This is a fermented drink, traditionally made with cow’s milk or goat’s milk.\n" +
                    "\n" +
                    "It is made by adding kefir grains to the milk. These are not cereal grains, but grain-like colonies of yeast and lactic acid bacteria that resemble a cauliflower in appearance.\n" +
                    "\n" +
                    "Over approximately 24 hours, the microorganisms in the kefir grains multiply and ferment the sugars in the milk, turning it into kefir. Then, the grains are removed from the liquid and can be used again.\n" +
                    "\n" +
                    "In other words, kefir is the drink, but kefir grains are the starter culture that used to produce the beverage.\n" +
                    "\n" +
                    "The grains’ lactic acid bacteria turn the milk’s lactose into lactic acid. This is what makes kefir taste sour like yogurt — but it has a thinner consistency.\n" +
                    "\n" +
                    "A 1 cup serving of low fat kefir contains:\n" +
                    "\n" +
                    "Protein: 9 grams\n" +
                    "Calcium: 24% of the daily value (DV)\n" +
                    "Phosphorus: 20% of the DV\n" +
                    "Vitamin B12: 29% of the DV\n" +
                    "Riboflavin (B2): 25% of the DV\n" +
                    "Magnesium: 7% of the DV\n" +
                    "Vitamin D: 12% of the DV\n" +
                    "In addition, kefir has about 104 calories, 11.6 grams of carbs, and 2–3 grams of fat, depending on the type of milk used.\n" +
                    "\n" +
                    "Kefir also contains a wide variety of bioactive compounds, including organic acids and peptides that contribute to its health benefits.\n" +
                    "\n" +
                    "Dairy-free versions of kefir can be made with coconut water, coconut milk, or other sweet liquids. These will not have the same nutrient profile as dairy-based kefir.",
            "B1"
        )
        benefitsList.add(benefit1)

        val benefit2 = Item(
            R.drawable.benefit2_probiotics_gut_microbiome,
            "Some microorganisms can have beneficial effects on health when ingested.\n" +
                    "\n" +
                    "Known as probiotics, these microorganisms may influence health in numerous ways, aiding digestion, weight management, and mental health.\n" +
                    "\n" +
                    "Yogurt is the best-known probiotic food in the Western diet, but kefir is actually a much more potent source.\n" +
                    "\n" +
                    "Kefir grains contain up to 61 strains of bacteria and yeasts, making them a very rich and diverse probiotic source, though this diversity may vary.\n" +
                    "\n" +
                    "Other fermented dairy products are made from far fewer strains and don’t contain any yeasts.\n" +
                    "\n" +
                    "Tl;dr\n" +
                    "Kefir may contain up to 61 different microorganisms, making it a much more potent source of probiotics than many other fermented dairy products",
            "Kefir is a more powerful probiotic than yogurt",
            "Some microorganisms can have beneficial effects on health when ingested.\n" +
                    "\n" +
                    "Known as probiotics, these microorganisms may influence health in numerous ways, aiding digestion, weight management, and mental health.\n" +
                    "\n" +
                    "Yogurt is the best-known probiotic food in the Western diet, but kefir is actually a much more potent source.\n" +
                    "\n" +
                    "Kefir grains contain up to 61 strains of bacteria and yeasts, making them a very rich and diverse probiotic source, though this diversity may vary.\n" +
                    "\n" +
                    "Other fermented dairy products are made from far fewer strains and don’t contain any yeasts.\n" +
                    "\n" +
                    "Tl;dr\n" +
                    "Kefir may contain up to 61 different microorganisms, making it a much more potent source of probiotics than many other fermented dairy products",
            "B2"
        )
        benefitsList.add(benefit2)

        val benefit3 = Item(
            R.drawable.benefit3_bacteria_allv1,
            "Certain probiotics in kefir are believed to protect against infections.\n" +
                    "\n" +
                    "This includes the probiotic Lactobacillus kefiri, which is unique to kefir.\n" +
                    "\n" +
                    "Studies demonstrate that this probiotic can inhibit the growth of various harmful bacteria, including Salmonella, Helicobacter pylori, and E. coli.\n" +
                    "\n" +
                    "Kefiran, a type of carbohydrate present in kefir, also has antibacterial properties.\n" +
                    "\n" +
                    "Tl;dr\n" +
                    "Kefir contains the probiotic Lactobacillus kefiri and the carbohydrate kefiran, both of which protect against harmful bacteria.",
            "Kefir has potent antibacterial properties\n",
            "Certain probiotics in kefir are believed to protect against infections.\n" +
                    "\n" +
                    "This includes the probiotic Lactobacillus kefiri, which is unique to kefir.\n" +
                    "\n" +
                    "Studies demonstrate that this probiotic can inhibit the growth of various harmful bacteria, including Salmonella, Helicobacter pylori, and E. coli.\n" +
                    "\n" +
                    "Kefiran, a type of carbohydrate present in kefir, also has antibacterial properties.\n" +
                    "\n" +
                    "Tl;dr\n" +
                    "Kefir contains the probiotic Lactobacillus kefiri and the carbohydrate kefiran, both of which protect against harmful bacteria.",
            "B3"
        )
        benefitsList.add(benefit3)

        val benefit4 = Item(
            R.drawable.benefit4_healthy_bones_skeleton,
            "Osteoporosis is characterized by deterioration of bone tissue and is a major concern in Western countries. It is especially common among older women and dramatically raises the risk of fractures.\n" +
                    "It is, however, more probable that what kefir can do is that it can heal the gut and in turn a healthy gut can ward of many diseases.\n" +
                    "Ensuring an adequate calcium intake is one of the most effective ways to improve bone health and slow the progression of osteoporosis." +
                    "Full fat kefir is not only a great source of calcium but also vitamin K2 — which plays a central role in calcium metabolism. Supplementing with K2 has been shown to reduce your risk of fractures by as much as 81%" +
                    "Recent animal studies associate kefir with increased calcium absorption in bone cells. This leads to improved bone density, which should help prevent fractures\n" +
                    "Tl;dr\n" + "Kefir made from dairy is an excellent source of calcium, and full-fat dairy kefir also contains vitamin K2. These nutrients have major benefits for bone health.",
            "Kefir can improve bone health and lower the risk of osteoporosis",
            "Osteoporosis is characterized by deterioration of bone tissue and is a major concern in Western countries. It is especially common among older women and dramatically raises the risk of fractures.\n" +
                    "It is, however, more probable that what kefir can do is that it can heal the gut and in turn a healthy gut can ward of many diseases.\n" +
            "Ensuring an adequate calcium intake is one of the most effective ways to improve bone health and slow the progression of osteoporosis." +
                    "Full fat kefir is not only a great source of calcium but also vitamin K2 — which plays a central role in calcium metabolism. Supplementing with K2 has been shown to reduce your risk of fractures by as much as 81%" +
            "Recent animal studies associate kefir with increased calcium absorption in bone cells. This leads to improved bone density, which should help prevent fractures\n" +
                    "Tl;dr\n" + "Kefir made from dairy is an excellent source of calcium, and full-fat dairy kefir also contains vitamin K2. These nutrients have major benefits for bone health.",
            "B4"
        )
        benefitsList.add(benefit4)

        val benefit5 = Item(
            R.drawable.benefit5_cancer_anti_oxidant_fermentation,
            "Cancer is one of the world’s leading causes of death. It occurs when abnormal cells in your body grow uncontrollably, such as in a tumor.\n" +
                    "\n" +
                    "The probiotics in fermented dairy products are believed to reduce tumor growth by stimulating your immune system. So, it is possible that kefir may fight cancer.\n" +
                    "\n" +
                    "This protective role has been demonstrated in several test-tube studies.\n" +
                    "\n" +
                    "One study found that kefir extract reduced the number of human breast cancer cells by 56%, compared with only 14% for yogurt extract.\n" +
                    "\n" +
                    "Keep in mind that human studies are needed before firm conclusions can be made.\n" +
                    "\n" +
                    "Tl;dr\n" +
                    "Some test-tube and animal studies indicate that kefir can inhibit cancer cell growth. However, no current studies have included people, so more research is needed.",
            "Kefir may be protective against cancer",
            "Cancer is one of the world’s leading causes of death. It occurs when abnormal cells in your body grow uncontrollably, such as in a tumor.\n" +
                    "\n" +
                    "The probiotics in fermented dairy products are believed to reduce tumor growth by stimulating your immune system. So, it is possible that kefir may fight cancer.\n" +
                    "\n" +
                    "This protective role has been demonstrated in several test-tube studies.\n" +
                    "\n" +
                    "One study found that kefir extract reduced the number of human breast cancer cells by 56%, compared with only 14% for yogurt extract.\n" +
                    "\n" +
                    "Keep in mind that human studies are needed before firm conclusions can be made.\n" +
                    "\n" +
                    "Tl;dr\n" +
                    "Some test-tube and animal studies indicate that kefir can inhibit cancer cell growth. However, no current studies have included people, so more research is needed.",
            "B5"
        )
        benefitsList.add(benefit5)

        val benefit6 = Item(
            R.drawable.benefit6_good_digestive_system,
            "Probiotics such as kefir can help restore the balance of friendly bacteria in your gut.\n" +
                    "\n" +
                    "This is why they are highly effective at treating many forms of diarrhea.\n" +
                    "\n" +
                    "What’s more, ample evidence suggests that probiotics and probiotic foods can alleviate many digestive concerns\n" +
                    "\n" +
                    "These include irritable bowel syndrome, ulcers caused by H. pylori infection, and many others.\n" +
                    "\n" +
                    "For this reason, kefir may be useful if you have trouble with digestion.\n" +
                    "\n" +
                    "Tl;dr\n" +
                    "Probiotics like kefir can treat several forms of diarrhea. They can also lead to improvements in various digestive conditions.",
            "Kefir’s probiotics may help with various digestive concerns",
            "Probiotics such as kefir can help restore the balance of friendly bacteria in your gut.\n" +
                    "\n" +
                    "This is why they are highly effective at treating many forms of diarrhea.\n" +
                    "\n" +
                    "What’s more, ample evidence suggests that probiotics and probiotic foods can alleviate many digestive concerns\n" +
                    "\n" +
                    "These include irritable bowel syndrome, ulcers caused by H. pylori infection, and many others.\n" +
                    "\n" +
                    "For this reason, kefir may be useful if you have trouble with digestion.\n" +
                    "\n" +
                    "Tl;dr\n" +
                    "Probiotics like kefir can treat several forms of diarrhea. They can also lead to improvements in various digestive conditions.",
            "B6"
        )
        benefitsList.add(benefit6)

        val benefit7 = Item(
            R.drawable.benefit7_cow_low_lactose,
            "Regular dairy foods contain a natural sugar called lactose.\n" +
                    "\n" +
                    "Many people, especially adults, are unable to break down and digest lactose properly. This condition is called lactose intolerance (25).\n" +
                    "\n" +
                    "The lactic acid bacteria in fermented dairy foods — like kefir and yogurt — turn the lactose into lactic acid, so these foods are much lower in lactose than milk.\n" +
                    "\n" +
                    "They also contain enzymes that can help break down the lactose even further.\n" +
                    "\n" +
                    "That’s why kefir is generally well tolerated by people with lactose intolerance, at least compared with regular milk.\n" +
                    "\n" +
                    "Keep in mind that it is possible to make kefir that is 100% lactose-free by using coconut water, fruit juice, or another nondairy beverage.\n" +
                    "\n" +
                    "Tl;dr\n" +
                    "Kefir is low in lactose because its lactic acid bacteria have already pre-digested the lactose. People who have lactose intolerance can often drink kefir without problems.",
            "Kefir is low in lactose",
            "Regular dairy foods contain a natural sugar called lactose.\n" +
                    "\n" +
                    "Many people, especially adults, are unable to break down and digest lactose properly. This condition is called lactose intolerance (25).\n" +
                    "\n" +
                    "The lactic acid bacteria in fermented dairy foods — like kefir and yogurt — turn the lactose into lactic acid, so these foods are much lower in lactose than milk.\n" +
                    "\n" +
                    "They also contain enzymes that can help break down the lactose even further.\n" +
                    "\n" +
                    "That’s why kefir is generally well tolerated by people with lactose intolerance, at least compared with regular milk.\n" +
                    "\n" +
                    "Keep in mind that it is possible to make kefir that is 100% lactose-free by using coconut water, fruit juice, or another nondairy beverage.\n" +
                    "\n" +
                    "Tl;dr\n" +
                    "Kefir is low in lactose because its lactic acid bacteria have already pre-digested the lactose. People who have lactose intolerance can often drink kefir without problems.",
            "B7"
        )
        benefitsList.add(benefit7)

        val benefit8 = Item(
            R.drawable.benefit8_asthma_great_lungs,
            "Allergic reactions are caused by inflammatory responses against certain foods or substances.\n" +
                    "\n" +
                    "People with an oversensitive immune system are more prone to allergies, which can provoke conditions like asthma.\n" +
                    "\n" +
                    "In animal studies, kefir has been shown to suppress inflammatory responses related to allergies and asthma.\n" +
                    "\n" +
                    "Human studies are needed to better explore these effects.\n" +
                    "\n" +
                    "Tl;dr\n" +
                    "Limited evidence from animal studies suggests that drinking kefir may reduce allergic reactions.",
            "Kefir may improve allergy and asthma symptoms",
            "Allergic reactions are caused by inflammatory responses against certain foods or substances.\n" +
                    "\n" +
                    "People with an oversensitive immune system are more prone to allergies, which can provoke conditions like asthma.\n" +
                    "\n" +
                    "In animal studies, kefir has been shown to suppress inflammatory responses related to allergies and asthma.\n" +
                    "\n" +
                    "Human studies are needed to better explore these effects.\n" +
                    "\n" +
                    "Tl;dr\n" +
                    "Limited evidence from animal studies suggests that drinking kefir may reduce allergic reactions.",
            "B8"
        )
        benefitsList.add(benefit8)
    }


}
