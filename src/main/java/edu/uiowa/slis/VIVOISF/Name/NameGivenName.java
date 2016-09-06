package edu.uiowa.slis.VIVOISF.Name;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NameGivenName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NameGivenName currentInstance = null;
	private static final Log log = LogFactory.getLog(NameGivenName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NameGivenNameIterator theName = (NameGivenNameIterator)findAncestorWithClass(this, NameGivenNameIterator.class);
			pageContext.getOut().print(theName.getGivenName());
		} catch (Exception e) {
			log.error("Can't find enclosing Name for givenName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Name for givenName tag ");
		}
		return SKIP_BODY;
	}
}

