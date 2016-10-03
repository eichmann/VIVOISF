package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourcePageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourcePageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourcePageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourcePageEndIterator theReferenceSource = (ReferenceSourcePageEndIterator)findAncestorWithClass(this, ReferenceSourcePageEndIterator.class);
			pageContext.getOut().print(theReferenceSource.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

