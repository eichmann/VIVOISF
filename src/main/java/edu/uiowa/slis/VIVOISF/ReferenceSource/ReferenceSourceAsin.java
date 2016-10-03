package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceAsin extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceAsin currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceAsin.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceAsinIterator theReferenceSource = (ReferenceSourceAsinIterator)findAncestorWithClass(this, ReferenceSourceAsinIterator.class);
			pageContext.getOut().print(theReferenceSource.getAsin());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for asin tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for asin tag ");
		}
		return SKIP_BODY;
	}
}

