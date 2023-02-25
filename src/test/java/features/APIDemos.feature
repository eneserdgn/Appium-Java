@APIDemos
Feature: API Demos

  @App @ActionBar @ActionBarTabs
  Scenario: Action Bar Tabs Page
    Given clear cache without delete
    Given user is on the Home Page
    When taps "App" on Categories
    When taps "Action Bar" on Categories
    When taps "Action Bar Tabs" on Categories
    Then should see Toogle Tab Passive on Action Bar Tabs Page
    #When taps Add New Tab button on Action Bar Tabs Page
    #Then should see added Tab on Action Bar Tabs Page
    #When taps Add New Tab button on Action Bar Tabs Page
    #Then should see added Tab on Action Bar Tabs Page
    #When taps Add New Tab button on Action Bar Tabs Page
    #Then should see added Tab on Action Bar Tabs Page
    #When taps Remove Last Tab button on Action Bar Tabs Page
    #Then should see deleted Tab on Action Bar Tabs Page
    #When taps Remove All Tab button on Action Bar Tabs Page
    #Then should see deleted All Tabs on Action Bar Tabs Page

  @App @Activity @CustomTitle
  Scenario Outline: Custom Title Page
    Given clear cache without delete
    Given user is on the Custom Title Page
    Then should see TextBox "<textBox>" on Custom Title Page
    Then should see NavigationBar "<navigationBar>" on Custom Title Page
    When sendkey Textbox "<changeTextBox>" on Custom Title Page
    When taps Change Left button on Custom Title Page
    Then should see TextBox "<changeTextBox>" on Custom Title Page
    When sendkey NavigationBar "<changNavigationBar>" on Custom Title Page
    When taps Change Right button on Custom Title Page
    Then should see NavigationBar "<changNavigationBar>" on Custom Title Page
    Examples:
      | textBox      | navigationBar         | changeTextBox | changNavigationBar |
      | Left is best | Right is always right | Change Left   | Change Right       |

  @App @AlertDialogs @ListDialog
  Scenario Outline: List Dialog Page
    Given clear cache without delete
    Given user is on the Alert Dialog Page
    When taps List Dialog on Alert Dialog Page
    When taps List Element "<name>" on List Dialog Page
    Then should see Alert Order "<order>" on List Dialog Page
    Then should see Alert Name "<name>" on List Dialog Page
    Examples:
      | order | name          |
      | 0     | Command one   |
      | 1     | Command two   |
      | 2     | Command three |
      | 3     | Command four  |

  @App @DeviceAdmin @EnableAdmin
  Scenario: Enable Admin Page
    Given clear cache without delete
    Given user is on the Enable Admin Page
    When taps Enable Admin Checkbox on Enable Admin Page
    When taps Activate Button on Enable Admin Page
    When taps Risk Checkbox on Enable Admin Page
    When taps Okay button on Enable Admin Page
    Then should see title "General" on Enable Admin Page
    Then should see checked Enabled Admin Checkbox on Enable Admin Page

  @App @Fragment @ContextMenu
  Scenario: Context Menu Page
    Given clear cache without delete
    Given user is on the Context Menu Page
    When long press Button on Context Menu Page
    Then should see Menu "Menu A" on Context Menu Page
    Then should see Menu "Menu B" on Context Menu Page

  @App @Fragment @HideAndShow
  Scenario: Hide and Show Page
    Given clear cache without delete
    Given user is on the Hide and Show Page
    Then should see First Button on Hide and Show Page
    Then should see First Hide TextBox "Initial text." on Hide and Show Page
    Then should see Second Button on Hide and Show Page
    Then should see Second Hide TextBox "Initial text." on Hide and Show Page
    When taps Second Button on Hide and Show Page
    Then should see Second Button "SHOW" on Hide and Show Page
    Then shouldnt see Second Hide Textbox on Hide and Show Page
    When taps Second Button on Hide and Show Page
    Then should see Second Button "HİDE" on Hide and Show Page
    Then should see Second Hide TextBox "Initial text." on Hide and Show Page

  @App @Notification @IncomingMessage
  Scenario: Incoming Message Page
    Given clear cache without delete
    Given user is on the Incoming Message Page
    When taps Show Notification button on Incoming Message Page
    Then should see the Notification
    When taps Notification
    Then should see Notification Detail Page
    Then should see Notification Detail Same on Notification Detail Page

    #Uygulama yüklenirken usbden yüklemeye izin ver adımı çıktığı için manuel müdahale gerekiyor?
  @Views @Tabs @Scrollable @Hatali
  Scenario Outline: Scrollable Page
    Given reinstall app
    Given user is on the Scrollable Page
    Then should see Last Tab "<lastTab>" on Scrollable Page
    When taps last Tab on Scrollable Page
    Then should see Information "<information>" on Scrollable Page
    Examples:
      | lastTab | information                     |
      | TAB 30  | Content for tab with tag Tab 30 |