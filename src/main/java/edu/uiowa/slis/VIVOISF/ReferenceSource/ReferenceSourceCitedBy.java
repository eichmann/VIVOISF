package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceCitedByIterator theReferenceSourceCitedByIterator = (ReferenceSourceCitedByIterator)findAncestorWithClass(this, ReferenceSourceCitedByIterator.class);
			pageContext.getOut().print(theReferenceSourceCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

