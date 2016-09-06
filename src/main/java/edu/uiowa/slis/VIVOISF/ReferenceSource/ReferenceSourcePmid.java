package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourcePmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourcePmid currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourcePmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourcePmidIterator theReferenceSource = (ReferenceSourcePmidIterator)findAncestorWithClass(this, ReferenceSourcePmidIterator.class);
			pageContext.getOut().print(theReferenceSource.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for pmid tag ");
		}
		return SKIP_BODY;
	}
}

