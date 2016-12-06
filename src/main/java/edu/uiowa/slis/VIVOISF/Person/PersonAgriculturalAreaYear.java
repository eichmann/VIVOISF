package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonAgriculturalAreaYear extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonAgriculturalAreaYear currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonAgriculturalAreaYear.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonAgriculturalAreaYearIterator thePerson = (PersonAgriculturalAreaYearIterator)findAncestorWithClass(this, PersonAgriculturalAreaYearIterator.class);
			pageContext.getOut().print(thePerson.getAgriculturalAreaYear());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for agriculturalAreaYear tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for agriculturalAreaYear tag ");
		}
		return SKIP_BODY;
	}
}

