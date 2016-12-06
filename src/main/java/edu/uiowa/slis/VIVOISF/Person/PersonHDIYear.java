package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonHDIYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonHDIYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonHDIYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonHDIYearIterator thePerson = (PersonHDIYearIterator)findAncestorWithClass(this, PersonHDIYearIterator.class);
			pageContext.getOut().print(thePerson.getHDIYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for HDIYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for HDIYear tag ");
		}
		return SKIP_BODY;
	}
}

