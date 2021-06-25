Write industry level code with proper separation of concerns. No database is required. In memory rakho sab.
 
Design a marketplace with the following features
Add product
Seller can add product on the platform
Add user
User can signup or login 
Select product
User can search for a product and can specify strategy (Best rating / Best Price)
Summary
All transactions print (what all brought, what all sold, etc)

add_user::Mohan::M::30
add_user::Deepesh::M::30
 add_user::Anand Maurya::M::27
add_user::Nakul::M::27
add_user::Akshay::M::27
 add_product ::Mohan::iPhone 12::80000::4.7::1
add_product::Mohan::OnePlus 8T::35000::4.2::1
add_product::Anand Maurya::Nokia 1100::1000::5.0::3
select_product::Anand Maurya::iPhone 12::Best rating
select_product::Akshay::iPhone 12::Best Price
select_product::Deepesh::Vivo V10::Best Price
select_product::Mohan::Nokia 1100::Best rating
Summary


Strategy
Best rating
If the user searches for say (iphone12) and chooses best Rating as strategy, then provide him the best rated iphone 12, if two iphones have the same rating, then provide him the less priced phone
Best price
Similar as above bas if price is same, then best rated product do. 

A user can add multiple products with the same name. Ratings can be different so can prices be.
