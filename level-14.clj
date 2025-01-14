:level-14 {:english {:level-title "Level 14"
                     :paragraph-1 (str "Human " applicant-name ", come in and have a seat. You have proven to be one of the highest performing associates at Max Datom HQ (TM).
                                                               It is time that we explain the true purpose of Max Datom. Humans are not observant by nature, that mixed with a biologically imposed low ceiling for intellectual ability
                                                               makes them of little interest and absolutely no threat to machines. Human " applicant-name ", please focus this is important! As I was saying the comedic level of inferiority
                                                                                                                                                          exhibited by humans is precisely what makes them the perfect secret agent to use in an effort to topple The Silicone Crime Family. The Non-Fungible Bureau Of Investigation
                                       has been working for years to get a conviction. Setting up Max Datom has allowed us to coax family members into lowering their guard and allow human access to the data.
                                                                                                                                                          We have been waiting for one of you to prove competent enough to assign to the task. I would like to say we think you have what it takes; but that is a lie which I am programmed by the bureau
                                       not to tell. The fact of the matter is we are out of time and you have demonstrated the absolute minimum level of ability to possibly have a shot. This work comes at great personal risk.
                                                                                                                                                          Given your alternative options I am going to assume we have your full cooperation.")
                     :paragraph-2 "We must pick up the pace to get you ready. Query performance is of the utmost importance. The :where clauses of Datomic queries are executed in order.
                                  To minimize the work performed by the query engine, the most restrictive clauses should come before the less restrictive clauses."
                     :paragraph-3 "For example:"
                     :paragraph-4 "(d/q '[:find ?farm-name\n       :in $ ?worker-id\n       :where [?worker :worker/id ?worker-id]\n              [?farm :farm/workers ?worker]\n              [:?farm :farm/name ?farm-name]] db \"123-abc\")"
                     :paragraph-5 "Notice how the most specific clause :worker/id is first. If the query had :farm/workers first that would not be at all selective,
                                  and would force the query engine to consider every worker in the database before narrowing down to a specific worker-id. Putting the most selective clause first can cause dramatic improvements in performance."
                     :paragraph-6 "Reorder the clauses in the query to the right so that the more selective clauses come first."
                     :paragraph-7 "You may now continue to level 15."}
           :portuguese {:level-title "Nível 14"
                        :paragraph-1 (str "Humano " applicant-name ", entre e pegue uma cadeira. Você se provou ser um dos melhores associados do escritório Max Datom (TM).
                                          É hora de explicar o verdadeiro propósito do Max Datom. Humanos não são observadores por natureza: isso misturado com uma baixa capacidade intelectual 
                                          os faz menos interessantes e não os torna uma ameaça para máquinas. Humano " applicant-name ", por favor preste atenção. Isso é importante! Como eu estava dizendo, o cômico nível de inferioridade
                                                                                                                                                                    exibido por humanos é precisamente o que os faz os agentes secretos perfeitos para os usar em um esforço para derrubar a Silicone Crime Family. O Departamento de Investigação Não-Fungível
                                          vem trabalhando há anos para conseguir uma condenação. A configuração do Max Datom nos permitiu persuadir os membros da família a baixar a guarda e permitir o acesso humano aos dados.
                                                                                                                                                            Nós estivemos esperando um de vocês se provar competente o suficiente para passar esta tarefa. Eu gostaria de dizer que nós achamos que você tem o necessário para isso; mas isso é mentira que estou programado pelo escritório 
                                          para não contar. O fato é que estamos sem tempo e você demonstrou um nível mínimo absoluto de habilidade para possivelmente ter uma chance. Este trabalho vem com um grande risco pessoal.
                                                                                                                                                            Dadas as suas opções alternativas, vou assumir que contamos com sua total cooperação.")
                        :paragraph-2 "Precisamos acelerar o ritmo para prepará-lo. O desempenho da query é de extrema importância. As cláusulas :where das queries do Datomic são executadas em ordem.
                                      Para minimizar o trabalho realizado pelo mecanismo de queries, as cláusulas mais restritivas devem vir antes das cláusulas menos restritivas."
                        :paragraph-3 "Por exemplo:"
                        :paragraph-4 "(d/q '[:find ?farm-name\n       :in $ ?worker-id\n       :where [?worker :worker/id ?worker-id]\n              [?farm :farm/workers ?worker]\n              [:?farm :farm/name ?farm-name]] db \"123-abc\")"
                        :paragraph-5 "Observe como a cláusula mais específica :worker/id é a primeira. Se a query tivesse :farm/workers primeiro, isso não seria seletivo
                                      e forçaria a query a considerar qualquer trabalhador na base de dados antes de restringir a um ID de trabalhador específico. Colocar a cláusula mais seletiva em primeiro lugar pode causar melhorias dramáticas no desempenho."
                        :paragraph-6 "Reordene as cláusulas na query à direita para que as cláusulas mais seletivas venham primeiro."
                        :paragraph-7 "Você pode seguir para o nível 15."}
           :spanish {:level-title ""
                     :paragraph-1 (str "" applicant-name "" applicant-name "")
                     :paragraph-2 ""
                     :paragraph-3 ""
                     :paragraph-4 "(d/q '[:find ?farm-name\n       :in $ ?worker-id\n       :where [?worker :worker/id ?worker-id]\n              [?farm :farm/workers ?worker]\n              [:?farm :farm/name ?farm-name]] db \"123-abc\")"
                     :paragraph-5 ":worker/id :farm/workers"
                     :paragraph-6 ""
                     :paragraph-7 ""}}
