package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourcePages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourcePages currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourcePages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourcePagesIterator theReferenceSource = (ReferenceSourcePagesIterator)findAncestorWithClass(this, ReferenceSourcePagesIterator.class);
			pageContext.getOut().print(theReferenceSource.getPages());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for pages tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for pages tag ");
		}
		return SKIP_BODY;
	}
}

