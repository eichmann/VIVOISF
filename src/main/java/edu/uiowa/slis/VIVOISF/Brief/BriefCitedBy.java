package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefCitedByIterator theBriefCitedByIterator = (BriefCitedByIterator)findAncestorWithClass(this, BriefCitedByIterator.class);
			pageContext.getOut().print(theBriefCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

