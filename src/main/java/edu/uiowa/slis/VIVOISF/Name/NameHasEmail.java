package edu.uiowa.slis.VIVOISF.Name;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class NameHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static NameHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(NameHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			NameHasEmailIterator theNameHasEmailIterator = (NameHasEmailIterator)findAncestorWithClass(this, NameHasEmailIterator.class);
			pageContext.getOut().print(theNameHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing Name for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing Name for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

