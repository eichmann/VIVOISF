package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNationalityARIterator thePerson = (PersonNationalityARIterator)findAncestorWithClass(this, PersonNationalityARIterator.class);
			pageContext.getOut().print(thePerson.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

