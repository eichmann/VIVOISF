package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceUri extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceUri currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceUri.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceUriIterator theReferenceSource = (ReferenceSourceUriIterator)findAncestorWithClass(this, ReferenceSourceUriIterator.class);
			pageContext.getOut().print(theReferenceSource.getUri());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for uri tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for uri tag ");
		}
		return SKIP_BODY;
	}
}

