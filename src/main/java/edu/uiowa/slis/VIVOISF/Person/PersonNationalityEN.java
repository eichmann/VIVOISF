package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNationalityEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNationalityEN currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNationalityEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNationalityENIterator thePerson = (PersonNationalityENIterator)findAncestorWithClass(this, PersonNationalityENIterator.class);
			pageContext.getOut().print(thePerson.getNationalityEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nationalityEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nationalityEN tag ");
		}
		return SKIP_BODY;
	}
}

