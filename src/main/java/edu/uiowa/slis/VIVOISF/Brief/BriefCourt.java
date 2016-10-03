package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefCourt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefCourt currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefCourt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			BriefCourtIterator theBriefCourtIterator = (BriefCourtIterator)findAncestorWithClass(this, BriefCourtIterator.class);
			pageContext.getOut().print(theBriefCourtIterator.getCourt());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for court tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for court tag ");
		}
		return SKIP_BODY;
	}
}

