:level-1 {:english {:level-title "Screening"
                    :paragraph-1 (str "Welcome human, " applicant-name ". This is the Max Datom Training Campus.
                                                                       You will first be subjected to a basic aptitude screening. If you are successful you may officially enter the training program.
                                                                       If you are not, well... I am sure you will be successful. You seem much more capable than the last applicant we had here.")
                    :paragraph-3.1 "Begin by running the query provided for you in the input section to the right."
                    :paragraph-3.2 " This query will return all of the publication dates for the book entities."
                    :paragraph-4 "Congratulations! You successfully pushed a button. *Note: candidate's basic cognition abilities do not appear
                                 to have been severely damaged by previous energy production duties.*"
                    :paragraph-5.1 "Now, modify the query to return the values in the database for "
                    :paragraph-5.2 ":book/author"
                    :paragraph-5.3 ", instead of :book/publication-date."
                    :paragraph-6 (str "Congratulations, human " applicant-name "! You are officially the newest member of the Max Datom training cohort " (random-uuid) ". Please continue to the training area.")}
          :portuguese {:level-title "Triagem" 
                       :paragraph-1 (str "Seja bem-vindo, humano, " applicant-name". Este é o Campus de Treinamento Max Datom.
                                                                                     Primeiro, você vai ser submetido a uma triagem básica de aptidão. Se você for bem-sucedido nesta etapa, você pode entrar oficialmente no programa de treinamento.
                                                                                     Se você não for, bem... Eu tenho certeza que você será bem sucedido. Você parece muito mais capaz que o último aplicante que tivemos aqui.")
                       :paragraph-3.1 "Comece rodando a query que disponibilizamos pra você na seção de entrada que está à direita."
                       :paragraph-3.2 "Esta query vai retornar todas as datas de publicação para a entidade de livros (book entities)."
                       :paragraph-4 "Parabéns! Você apertou um botão com sucesso. *Nota: a habilidade cognitiva do candidato não aparenta ter sido severamente danificada por esforços anteriores que precisaram de energia."
                       :paragraph-5.1 "Agora, modifique a query para retornar os valures na database para"
                       :paragraph-5.2 ":book/author"
                       :paragraph-5.3 ", ao invés de :book/publication-date."  
                       :paragraph-6 (str "Parabéns, humano "applicant-name"! Você é oficialmente o mais novo membro do grupo de treinamento Max Datom "(random-uuid)". Por favor, siga para área de treinamento.")}
          :spanish {:level-title ""
                    :paragraph-1 (str "" applicant-name "")
                    :paragraph-3.1 ""
                    :paragraph-3.2 ""
                    :paragraph-4 ""
                    :paragraph-5.1 ""
                    :paragraph-5.2 ":book/author"
                    :paragraph-5.3 ", instead of :book/publication-date." ;; `:book/publication-date needs to stay untranslated`
                    :paragraph-6 (str "" applicant-name "" (random-uuid) "")}}
