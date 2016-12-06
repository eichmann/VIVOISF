package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonNameListEN extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonNameListEN currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonNameListEN.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonNameListENIterator thePerson = (PersonNameListENIterator)findAncestorWithClass(this, PersonNameListENIterator.class);
			pageContext.getOut().print(thePerson.getNameListEN());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for nameListEN tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for nameListEN tag ");
		}
		return SKIP_BODY;
	}
}

