package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			StandardAuthorListIterator theStandardAuthorListIterator = (StandardAuthorListIterator)findAncestorWithClass(this, StandardAuthorListIterator.class);
			pageContext.getOut().print(theStandardAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for authorList tag ");
		}
		return SKIP_BODY;
	}
}

