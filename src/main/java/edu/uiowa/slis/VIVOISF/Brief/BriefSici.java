package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefSici currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefSiciIterator theBrief = (BriefSiciIterator)findAncestorWithClass(this, BriefSiciIterator.class);
			pageContext.getOut().print(theBrief.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for sici tag ");
		}
		return SKIP_BODY;
	}
}

