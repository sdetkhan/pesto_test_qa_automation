# Functional Test Cases for E-commerce Website

## User Registration:

### Test Case: New User Registration

**Precondition:** User is not registered.

**Steps:**
1. Navigate to the registration page.
2. Fill in valid user details.
3. Click the "Register" button.

**Expected Result:** User should be registered successfully, and a confirmation message should be displayed.

### Test Case: Existing User Registration

**Precondition:** User is already registered.

**Steps:**
1. Navigate to the registration page.
2. Fill in the same email address as an existing user.
3. Click the "Register" button.

**Expected Result:** An error message should be displayed, indicating that the email address is already registered.

## Product Search:

### Test Case: Basic Product Search

**Precondition:** User is logged in.

**Steps:**
1. Enter a search query in the search bar.
2. Click the "Search" button.

**Expected Result:** A list of products matching the search query should be displayed.

### Test Case: Advanced Product Search

**Precondition:** User is logged in.

**Steps:**
1. Navigate to the advanced search options.
2. Set multiple search criteria (e.g., category, price range, brand).
3. Click the "Search" button.

**Expected Result:** Products matching the specified criteria should be displayed.

## Adding Items to the Cart:

### Test Case: Add Single Item to Cart

**Precondition:** User is logged in and viewing a product.

**Steps:**
1. Click the "Add to Cart" button for a product.

**Expected Result:** The product should be added to the cart, and the cart icon should update to reflect the change.

### Test Case: Add Multiple Items to Cart

**Precondition:** User is logged in and viewing multiple products.

**Steps:**
1. Click the "Add to Cart" button for multiple products.

**Expected Result:** All selected products should be added to the cart, and the cart icon should update accordingly.

## Checkout Process:

### Test Case: Proceed to Checkout

**Precondition:** User has items in the cart.

**Steps:**
1. Click the "Checkout" button in the cart.

**Expected Result:** User should be directed to the checkout process, including entering shipping and payment details.

### Test Case: Checkout Process Validation

**Precondition:** User has items in the cart.

**Steps:**
1. Proceed to the checkout process.
2. Fill in invalid or incomplete information in the shipping and payment details.
3. Attempt to submit the order.

**Expected Result:** An error message should be displayed, and the user should not be able to complete the checkout until valid information is provided.

## Order Management:

### Test Case: View Order History

**Precondition:** User has completed at least one order.

**Steps:**
1. Navigate to the order history section.

**Expected Result:** A list of previous orders, including order details, should be displayed.

### Test Case: Order Status Tracking

**Precondition:** User has a recent order.

**Steps:**
1. Navigate to the order status tracking section.
2. Enter the order number and email used for the order.
3. Click the "Track Order" button.

**Expected Result:** The current status and shipping details of the order should be displayed.

These functional test cases cover the key features of an e-commerce website, ensuring that user registration, product search, cart management, checkout, and order management functions as expected. Additional test cases may be needed for edge cases and specific business rules.
