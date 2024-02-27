# User Registration:

## Test Case: Minimum Length of Password

**Precondition:** User is not registered.

**Steps:**
1. Navigate to the registration page.
2. Set a password with the minimum required length.
3. Click the "Register" button.

**Expected Result:** The system should accept the password, and the user should be registered successfully.

## Test Case: Maximum Length of Password

**Precondition:** User is not registered.

**Steps:**
1. Navigate to the registration page.
2. Set a password with the maximum allowed length.
3. Click the "Register" button.

**Expected Result:** The system should accept the password, and the user should be registered successfully.

# Product Search:

## Test Case: Search with Minimum Length Query

**Precondition:** User is logged in.

**Steps:**
1. Enter a search query with the minimum allowed characters.
2. Click the "Search" button.

**Expected Result:** The system should return relevant results, even for the minimum-length query.

## Test Case: Search with Maximum Length Query

**Precondition:** User is logged in.

**Steps:**
1. Enter a search query with the maximum allowed characters.
2. Click the "Search" button.

**Expected Result:** The system should accept the query, and the search results should be accurate.

# Cart Management:

## Test Case: Maximum Number of Items in Cart

**Precondition:** User is logged in and has the maximum allowed number of items in the cart.

**Steps:**
1. Attempt to add one more item to the cart.

**Expected Result:** The system should not allow adding more items to the cart, and an appropriate message should be displayed.

## Test Case: Minimum Quantity of Items

**Precondition:** User is logged in and has items in the cart.

**Steps:**
1. Attempt to set the quantity of an item in the cart to zero.

**Expected Result:** The system should not allow a quantity of zero and should display an error message.

# Checkout Process:

## Test Case: Maximum Shipping Address Length

**Precondition:** User is at the checkout page.

**Steps:**
1. Enter a shipping address with the maximum allowed characters.
2. Proceed to submit the order.

**Expected Result:** The system should accept the address, and the order should be successfully processed.

## Test Case: Maximum Quantity of Items in a Single Order

**Precondition:** User has added the maximum allowed number of items to the cart.

**Steps:**
1. Proceed to checkout with all items in the cart.

**Expected Result:** The system should successfully process the order with the maximum number of items.

# Order Management:

## Test Case: Viewing First Order in Order History

**Precondition:** User has completed at least one order.

**Steps:**
1. Navigate to the order history section.
2. Select the first order in the list.

**Expected Result:** The system should correctly display the details of the first order.

## Test Case: Viewing Last Order in Order History

**Precondition:** User has completed at least one order.

**Steps:**
1. Navigate to the order history section.
2. Select the last order in the list.

**Expected Result:** The system should correctly display the details of the last order.
