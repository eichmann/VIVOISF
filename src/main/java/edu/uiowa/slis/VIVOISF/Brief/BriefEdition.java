package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefEditionIterator theBrief = (BriefEditionIterator)findAncestorWithClass(this, BriefEditionIterator.class);
			pageContext.getOut().print(theBrief.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for edition tag ");
		}
		return SKIP_BODY;
	}
}

