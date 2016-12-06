package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNationalityFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNationalityFR currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNationalityFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNationalityFRIterator thePerson = (PersonNationalityFRIterator)findAncestorWithClass(this, PersonNationalityFRIterator.class);
			pageContext.getOut().print(thePerson.getNationalityFR());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nationalityFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nationalityFR tag ");
		}
		return SKIP_BODY;
	}
}

