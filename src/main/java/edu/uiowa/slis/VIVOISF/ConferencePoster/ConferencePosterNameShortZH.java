package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNameShortZHIterator theConferencePoster = (ConferencePosterNameShortZHIterator)findAncestorWithClass(this, ConferencePosterNameShortZHIterator.class);
			pageContext.getOut().print(theConferencePoster.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

