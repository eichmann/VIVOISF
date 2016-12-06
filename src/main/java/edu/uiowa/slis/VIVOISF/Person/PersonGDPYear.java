package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonGDPYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonGDPYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonGDPYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonGDPYearIterator thePerson = (PersonGDPYearIterator)findAncestorWithClass(this, PersonGDPYearIterator.class);
			pageContext.getOut().print(thePerson.getGDPYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for GDPYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for GDPYear tag ");
		}
		return SKIP_BODY;
	}
}

