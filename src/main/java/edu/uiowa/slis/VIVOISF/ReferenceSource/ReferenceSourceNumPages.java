package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceNumPagesIterator theReferenceSource = (ReferenceSourceNumPagesIterator)findAncestorWithClass(this, ReferenceSourceNumPagesIterator.class);
			pageContext.getOut().print(theReferenceSource.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for numPages tag ");
		}
		return SKIP_BODY;
	}
}

