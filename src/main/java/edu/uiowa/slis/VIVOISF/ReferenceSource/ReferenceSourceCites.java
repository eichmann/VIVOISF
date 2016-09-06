package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceCites extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceCites currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceCites.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceCitesIterator theReferenceSourceCitesIterator = (ReferenceSourceCitesIterator)findAncestorWithClass(this, ReferenceSourceCitesIterator.class);
			pageContext.getOut().print(theReferenceSourceCitesIterator.getCites());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for cites tag ");
		}
		return SKIP_BODY;
	}
}

