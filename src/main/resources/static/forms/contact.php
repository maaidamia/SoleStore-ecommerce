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

  $contact = new PHP_Email_Form;
  $contact->ajax = true;
  
  $contact->to = $receiving_email_address;
  $contact->from_name = $_POST['user_name'];
  $contact->from_email = $_POST['user_email'];
  $contact->subject = $_POST['subject'];

  // Uncomment below code if you want to use SMTP to send emails. You need to enter your correct SMTP credentials
  /*
  $contact->smtp = array(
    'host' => 'example.com',
    'username' => 'example',
    'user_password' => 'pass',
    'port' => '587'
  );
  */

  $contact->add_message( $_POST['user_name'], 'From');
  $contact->add_message( $_POST['user_email'], 'Email');
  $contact->add_message( $_POST['message'], 'Message', 10);

  echo $contact->send();
?>
