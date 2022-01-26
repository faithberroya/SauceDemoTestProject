# SauceDemoTestProject
How to run:
1. Create Maven Project
2. Paste the dependencies in pom.xml
3. From src/main/java create two packages: commons and pageobjects
	- commons: for data
	- pageobjects: for web elements
4. For data, import the following:
	- XSSFSheet ExcelWSheet
	- XSSFWorkbook ExcelWBook
	- XSSFCell Cell
	- XSSFRow Row
	- DataTable
	- Resources
	- TestManager
	- These will enable to get data from ExcelWSheet & ExcelWBook, and do iterations
5. For pageobjects, it is best to create separate public classes for each page. But for simplification, I simply put the basic web elements in one class.
6. To list all web elements, first we must structure the elements. I prefer structuring them either per page, per menu or per position.
7. I prefer identifying the elements via xpath. To do this, we can either write our own, or simply hover to the element, right click, Inspect, right click, Copy XPath, Ctrl + F, past XPath (for checking).
8. After writing the web elements in a structured manner, with XPath identifier, it's time to list the methods.
9. In some cases, like the login, we need the data from the testDataHandler and so we must also import it to all the pages that needs input of data.
10. We use public static void <method>(<testDataHandler: when needed only>){
	<webElementName>.<action>;
11. It is important to list all possible methods as we can also reuse it.
12. After listing all elements and methods, we can now move on creating the scenarios.
13. From src/test/java, we can start creating our individual scenarios. For the scenarios we have to import all our pages for webelements, and data. This will be our executable java file to run for each testing.
14. To write, we have to call the class and method used for a particular functionality in a chronological way: Main page > Item page > Cart > Checkout Page > CheckOut Overview > Checkout Last Page. We can also do negative scenarios like cancel or remove if we need to.
