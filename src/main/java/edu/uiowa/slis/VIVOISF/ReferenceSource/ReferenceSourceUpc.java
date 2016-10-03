package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceUpcIterator theReferenceSource = (ReferenceSourceUpcIterator)findAncestorWithClass(this, ReferenceSourceUpcIterator.class);
			pageContext.getOut().print(theReferenceSource.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for upc tag ");
		}
		return SKIP_BODY;
	}
}

