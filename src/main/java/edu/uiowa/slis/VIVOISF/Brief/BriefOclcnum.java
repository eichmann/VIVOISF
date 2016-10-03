package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefOclcnumIterator theBrief = (BriefOclcnumIterator)findAncestorWithClass(this, BriefOclcnumIterator.class);
			pageContext.getOut().print(theBrief.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

