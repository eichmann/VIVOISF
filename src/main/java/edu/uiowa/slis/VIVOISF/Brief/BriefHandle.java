package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefHandleIterator theBrief = (BriefHandleIterator)findAncestorWithClass(this, BriefHandleIterator.class);
			pageContext.getOut().print(theBrief.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for handle tag ");
		}
		return SKIP_BODY;
	}
}

