package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefCoden extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefCoden currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefCoden.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefCodenIterator theBrief = (BriefCodenIterator)findAncestorWithClass(this, BriefCodenIterator.class);
			pageContext.getOut().print(theBrief.getCoden());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for coden tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for coden tag ");
		}
		return SKIP_BODY;
	}
}

