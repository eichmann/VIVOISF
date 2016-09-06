package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceStatus extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceStatus currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceStatus.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceStatusIterator theReferenceSourceStatusIterator = (ReferenceSourceStatusIterator)findAncestorWithClass(this, ReferenceSourceStatusIterator.class);
			pageContext.getOut().print(theReferenceSourceStatusIterator.getStatus());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for status tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for status tag ");
		}
		return SKIP_BODY;
	}
}

