<?php
  /**
  * Requires the "PHP Email Form" library
  * The "PHP Email Form" library is available only in the pro version of the template
  * The library should be uploaded to: vendor/php-user_email-form/php-user_email-form.php
  * For more info and help: https://bootstrapmade.com/php-user_email-form/
  */

  // Replace contact@example.com with your real receiving user_email user_address
  $receiving_email_address = 'contact@example.com';

  if( file_exists($php_email_form = '../assets/vendor/php-user_email-form/php-user_email-form.php' )) {
    include( $php_email_form );
  } else {
    die( 'Unable to load the "PHP Email Form" Library!');
  }

  $book_a_table = new PHP_Email_Form;
  $book_a_table->ajax = true;
  
  $book_a_table->to = $receiving_email_address;
  $book_a_table->from_name = $_POST['user_name'];
  $book_a_table->from_email = $_POST['user_email'];
  $book_a_table->subject = "New table booking request from the website";

  // Uncomment below code if you want to use SMTP to send emails. You need to enter your correct SMTP credentials
  /*
  $book_a_table->smtp = array(
    'host' => 'example.com',
    'username' => 'example',
    'user_password' => 'pass',
    'port' => '587'
  );
  */

  $book_a_table->add_message( $_POST['user_name'], 'Name');
  $book_a_table->add_message( $_POST['user_email'], 'Email');
  $book_a_table->add_message( $_POST['user_phone'], 'Phone', 4);
  $book_a_table->add_message( $_POST['date'], 'Date', 4);
  $book_a_table->add_message( $_POST['time'], 'Time', 4);
  $book_a_table->add_message( $_POST['people'], '# of people', 1);
  $book_a_table->add_message( $_POST['message'], 'Message');

  echo $book_a_table->send();
?>
