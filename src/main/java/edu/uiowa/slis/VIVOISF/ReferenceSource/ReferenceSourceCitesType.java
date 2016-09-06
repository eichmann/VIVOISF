package edu.uiowa.slis.VIVOISF.ReferenceSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ReferenceSourceCitesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ReferenceSourceCitesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ReferenceSourceCitesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ReferenceSourceCitesIterator theReferenceSourceCitesIterator = (ReferenceSourceCitesIterator)findAncestorWithClass(this, ReferenceSourceCitesIterator.class);
			pageContext.getOut().print(theReferenceSourceCitesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ReferenceSource for cites tag ", e);
			throw new JspTagException("Error: Can't find enclosing ReferenceSource for cites tag ");
		}
		return SKIP_BODY;
	}
}

