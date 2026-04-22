We are continuing development on an existing bus booking system.

Before making any changes:

1. Read and understand the entire codebase structure
2. Do NOT duplicate files or logic
3. Keep code simple, modular, and readable

Project Stack:

* Frontend: React (Vite + Tailwind)
* Backend: Node.js + Express
* Database: PostgreSQL

Architecture Rules:

* Controllers must stay thin
* Business logic must go into /services
* Use clean and minimal code (avoid unnecessary abstractions)

Core Features to Implement:

1. Authentication:

* Allow guest booking (no login required)
* Allow optional user accounts
* Phone number must follow Ugandan format (07XXXXXXXX)

2. Routes & Trips:

* Admin can create/update/delete routes
* Trips are assigned to routes with date, time, and price
* Users can only book:

  * Same-day trips (if time not passed)
  * Or up to 2 days ahead
  * No past bookings

3. Seat System:

* Seats must be dynamic based on bus type
* Default bus has 67 seats
* Seat layout should be configurable (JSON-based grid)

4. Seat Booking Logic (CRITICAL):

* Prevent double booking
* Implement seat hold system:

  * When a user selects a seat → create a hold for 5 minutes
  * If payment not completed → release seat
* Use a "seat_holds" table

5. Booking:

* Generate booking code format: BUS-YYYY-XXXX
* Store:

  * phone number
  * seat number
  * trip
  * route
  * amount
* Booking status:

  * pending
  * paid
  * cancelled

6. Payment Integration:

* Integrate Flutterwave mobile money (MTN & Airtel)
* When user clicks pay:

  * initiate payment request
  * send mobile money prompt
* Use webhook to confirm payment
* NEVER trust frontend for payment confirmation

7. SMS Notifications:

* After successful payment:

  * Send SMS with:

    * booking code
    * route
    * seat number
    * departure time

8. Notifications System:

* Store notifications in database
* Display on:

  * Home page
  * User dashboard

9. Admin Panel:

* Dashboard should show:

  * total bookings
  * total revenue today
  * trips today
  * recent bookings
* Admin can:

  * manage routes
  * manage trips
  * view bookings
* Staff users can only manage assigned routes

10. Background Jobs:

* Expire seat holds automatically
* Mark past trips as inactive after departure
* Reset seat availability after trip ends

Frontend Requirements:

* Clean UI based on provided design
* Seat selection UI must visually match bus layout
* Use color indicators for seat status
* Keep navigation simple and minimal

Constraints:

* Do NOT overcomplicate code
* Avoid unnecessary libraries
* Follow existing folder structure
* Ensure code is easy to edit and debug

Task:
Start by setting up the backend structure:

* Create models
* Create routes
* Implement seat hold logic
* Implement booking flow

Then proceed to frontend step-by-step.

Always explain changes briefly before applying them.
