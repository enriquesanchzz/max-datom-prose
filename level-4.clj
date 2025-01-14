:level-4 {:english {:level-title "Level 4"
                    :paragraph-1 (str "Human " applicant-name ", ")
                    :paragraph-1.1 " occurs when a variable appears in more than one data pattern. In the following query, ?e appears twice: "
                    :paragraph-2 "[:find ?e ?farm-id\n :where [?e :worker/age 27] \n        [?e :worker/energy-farm-id ?farm-id]]"
                    :paragraph-3 "Matches for the variable ?e must unify, i.e. represent the same value in every clause in order to satisfy the set of clauses. A matching ?e must have both :worker/age 27 and a value for :worker/energy-farm-id which will be bound to ?farm-id:"
                    :paragraph-4 "Modify the query to return the "
                    :paragraph-4.1 ":book/publication-date "
                    :paragraph-4.2 "for the entity with a "
                    :paragraph-4.3 ":book/name "
                    :paragraph-4.4 "of "
                    :paragraph-4.5 "\"Process and Grow RAM\""
                    :paragraph-5 "You may now continue to level 5."}
          :portuguese {:level-title "Nível 4"
                       :paragraph-1 (str "Humano " applicant-name ", ")
                       :paragraph-1.1 "acontece quando uma variável aparece em mais de um padrão de dados. Na consulta a seguir, ?e aparece duas vezes:"
                       :paragraph-2 "[:find ?e ?farm-id\n :where [?e :worker/age 27] \n        [?e :worker/energy-farm-id ?farm-id]]" 
                       :paragraph-3 "As correspondências para a variável ?e devem ser unificadas. Ou seja: devem representar o mesmo valor em todas as cláusulas para satisfazer o conjunto de cláusulas. Um ?e correspondente deve ter :worker/age 27 e um valor para :worker/energy-farm-id que será vinculado a ?farm-id:"
                       :paragraph-4 "Modofique a query para retornar o"
                       :paragraph-4.1 ":book/publication-date " 
                       :paragraph-4.2 "para a entidade com"
                       :paragraph-4.3 ":book/name "             
                       :paragraph-4.4 "de"
                       :paragraph-4.5 "\"Process and Grow RAM\""
                       :paragraph-5 "Você pode seguir para o nível 5."}
          :spanish {:level-title ""
                    :paragraph-1 (str "" applicant-name ", ")
                    :paragraph-1.1 ""
                    :paragraph-2 "[:find ?e ?farm-id\n :where [?e :worker/age 27] \n        [?e :worker/energy-farm-id ?farm-id]]" ;; query cannot be translated
                    :paragraph-3 "?e unify ?e :worker/age 27 :worker/energy-farm-id ?farm-id:" ;; The words remaing here should not be translated
                    :paragraph-4 ""
                    :paragraph-4.1 ":book/publication-date " ;; Do not transalte, query argument
                    :paragraph-4.2 ""
                    :paragraph-4.3 ":book/name "             ;; Do not transalte, query argument
                    :paragraph-4.4 ""
                    :paragraph-4.5 "\"Process and Grow RAM\"";; Do not transalte, query result
                    :paragraph-5 ""}}
