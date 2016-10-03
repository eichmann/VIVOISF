package edu.uiowa.slis.VIVOISF.Brief;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BriefArgued extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static BriefArgued currentInstance = null;
	private static final Log log = LogFactory.getLog(BriefArgued.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			BriefArguedIterator theBrief = (BriefArguedIterator)findAncestorWithClass(this, BriefArguedIterator.class);
			pageContext.getOut().print(theBrief.getArgued());
		} catch (Exception e) {
			log.error("Can't find enclosing Brief for argued tag ", e);
			throw new JspTagException("Error: Can't find enclosing Brief for argued tag ");
		}
		return SKIP_BODY;
	}
}

