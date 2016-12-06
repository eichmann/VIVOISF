package edu.uiowa.slis.VIVOISF.Person;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PersonUrl extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PersonUrl currentInstance = null;
	private static final Log log = LogFactory.getLog(PersonUrl.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			PersonUrlIterator thePerson = (PersonUrlIterator)findAncestorWithClass(this, PersonUrlIterator.class);
			pageContext.getOut().print(thePerson.getUrl());
		} catch (Exception e) {
			log.error("Can't find enclosing Person for url tag ", e);
			throw new JspTagException("Error: Can't find enclosing Person for url tag ");
		}
		return SKIP_BODY;
	}
}

