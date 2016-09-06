package edu.uiowa.slis.VIVOISF.Name;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NameMiddleName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NameMiddleName currentInstance = null;
	private static final Log log = LogFactory.getLog(NameMiddleName.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			NameMiddleNameIterator theName = (NameMiddleNameIterator)findAncestorWithClass(this, NameMiddleNameIterator.class);
			pageContext.getOut().print(theName.getMiddleName());
		} catch (Exception e) {
			log.error("Can't find enclosing Name for middleName tag ", e);
			throw new JspTagException("Error: Can't find enclosing Name for middleName tag ");
		}
		return SKIP_BODY;
	}
}

