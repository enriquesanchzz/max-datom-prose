:level-10 {:english {:level-title "Level 10"
                     :paragraph-1 (str "Congratulations, human " applicant-name "! You have completed the new associate entry program and are now an official junior member of
                                                                                the Max Datom (TM) team. I am sure your parental units would be proud. I would send them word of your accomplishment if all communications into and out
                                                                                of work farms were not strictly prohibited. To commemorate your new status I am presenting you with your very own Max Datom (TM) polo shirt. We understand
                                                                                for some reason polo shirts make humans feel as though they are part of a team. It is yours to keep. The cost of which will be deducted from future earned credits. ")
                     :paragraph-2 "Enough celebration. You still have much to learn. An "
                     :paragraph-2.1 "aggregate function"
                     :paragraph-2.2 " appears in the find clause and transforms a result. Aggregate functions can take variables, constants, or src-vars as arguments."
                     :paragraph-3 "For example, to return a count of workers assigned to each energy farm along with the farm name the following query can be issued;"
                     :paragraph-4 "(d/q '[:find (count ?workers) ?farm-name\n       :where [?e :farm/name ?farm-name]\n              [:?e :farm/workers ?workers]] db)"
                     :paragraph-5 "After you inspect the new data set schema. Update the query to return the "
                     :paragraph-5.1 ":user/first+last-name"
                     :paragraph-5.2 " and count of "
                     :paragraph-5.3 ":post/author"
                     :paragraph-5.4 " for the user associated with "
                     :paragraph-5.5 ":user/id #uuid \"1B341635-BE22-4ACC-AE5B-D81D8B1B7678\""
                     :paragraph-6 "You may now continue to level 11."}
           :portuguese {:level-title "Nível 10"
                        :paragraph-1 (str "Parabéns, humano " applicant-name "! Você completou o programa de entrada para novos associados e agora é oficialmente um membro júnior do time Max Datom (TM). 
                                                                                Eu tenho certeza que seus pais ficariam orgulhosos. Eu enviaria a eles a notícia da sua conquista se todas as comunicações de entrada e saída
                                                                                de fazendas de trabalho não fossem estritamente proibidas. Para comemorar seu novo status eu estou presenteando você com sua própria camiseta polo do Max Datom (TM). Nós entendemos
                                                                                que por alguma razão, camisetas polo fazem humanos se sentirem parte de um time. A camiseta é sua. O custo dela vai ser deduzido de seus futuros créditos ganhos.")
                        :paragraph-2 "Chega de comemorações. Você ainda tem muito a aprender. Uma"
                        :paragraph-2.1 "função agregada"
                        :paragraph-2.2 "aparece em uma cláusula de busca e transforma um resultado. Funções agregadas podem receber variáveis, constantes ou src-vars como argumentos."
                        :paragraph-3 "Por exemplo, para retornar uma contagem de trabalhadores atribuídos a cada fazenda de energia junto com o nome da fazenda, a seguinte query poderia ser feita;"
                        :paragraph-4 "(d/q '[:find (count ?workers) ?farm-name\n       :where [?e :farm/name ?farm-name]\n              [:?e :farm/workers ?workers]] db)"
                        :paragraph-5 "Depois de inspecionar o novo schema do conjunto de dados, atualize a query para retornar o"
                        :paragraph-5.1 ":user/first+last-name"
                        :paragraph-5.2 "e contagem de"
                        :paragraph-5.3 ":post/author"
                        :paragraph-5.4 "para o usuário associado com"
                        :paragraph-5.5 ":user/id #uuid \"1B341635-BE22-4ACC-AE5B-D81D8B1B7678\""
                        :paragraph-6 "Você pode seguir para o nível 11."}
           :spanish {:level-title ""
                     :paragraph-1 (str "" applicant-name "")
                     :paragraph-2 ""
                     :paragraph-2.1 ""
                     :paragraph-2.2 ""
                     :paragraph-3 ""
                     :paragraph-4 "(d/q '[:find (count ?workers) ?farm-name\n       :where [?e :farm/name ?farm-name]\n              [:?e :farm/workers ?workers]] db)"
                     :paragraph-5 ""
                     :paragraph-5.1 ":user/first+last-name"
                     :paragraph-5.2 ""
                     :paragraph-5.3 ":post/author"
                     :paragraph-5.4 ""
                     :paragraph-5.5 ":user/id #uuid \"1B341635-BE22-4ACC-AE5B-D81D8B1B7678\""
                     :paragraph-6 ""}}
