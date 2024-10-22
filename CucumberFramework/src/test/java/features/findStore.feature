Feature: Buy a product on N11

Scenario: Shops are seached and products are added to the cart

Given User is on n11 landing page
When "kulaklık" word is searhed
And Results are sorted by the number of comments
And Free shipping option is applied.
And Products are added to the cart
Then User goes to cart
And  User goes to payment step



