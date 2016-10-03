package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourcePageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourcePageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourcePageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourcePageStartIterator theReferenceSource = (ReferenceSourcePageStartIterator)findAncestorWithClass(this, ReferenceSourcePageStartIterator.class);
			pageContext.getOut().print(theReferenceSource.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

