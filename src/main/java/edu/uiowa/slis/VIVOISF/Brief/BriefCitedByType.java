package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefCitedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefCitedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefCitedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefCitedByIterator theBriefCitedByIterator = (BriefCitedByIterator)findAncestorWithClass(this, BriefCitedByIterator.class);
			pageContext.getOut().print(theBriefCitedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

