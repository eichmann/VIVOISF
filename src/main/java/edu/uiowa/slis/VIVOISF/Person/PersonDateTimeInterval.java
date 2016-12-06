package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonDateTimeInterval extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonDateTimeInterval currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonDateTimeInterval.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			PersonDateTimeIntervalIterator thePersonDateTimeIntervalIterator = (PersonDateTimeIntervalIterator)findAncestorWithClass(this, PersonDateTimeIntervalIterator.class);
			pageContext.getOut().print(thePersonDateTimeIntervalIterator.getDateTimeInterval());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for dateTimeInterval tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for dateTimeInterval tag ");
		}
		return SKIP_BODY;
	}
}

