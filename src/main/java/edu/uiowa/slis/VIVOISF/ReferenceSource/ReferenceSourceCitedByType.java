package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceCitedByIterator theReferenceSourceCitedByIterator = (ReferenceSourceCitedByIterator)findAncestorWithClass(this, ReferenceSourceCitedByIterator.class);
			pageContext.getOut().print(theReferenceSourceCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

