package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardContent extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardContent currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardContent.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			StandardContentIterator theStandard = (StandardContentIterator)findAncestorWithClass(this, StandardContentIterator.class);
			pageContext.getOut().print(theStandard.getContent());
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for content tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for content tag ");
		}
		return SKIP_BODY;
	}
}

