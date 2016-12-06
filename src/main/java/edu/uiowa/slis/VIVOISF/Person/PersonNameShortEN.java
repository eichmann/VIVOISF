package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNameShortEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNameShortEN currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNameShortEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNameShortENIterator thePerson = (PersonNameShortENIterator)findAncestorWithClass(this, PersonNameShortENIterator.class);
			pageContext.getOut().print(thePerson.getNameShortEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nameShortEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nameShortEN tag ");
		}
		return SKIP_BODY;
	}
}

