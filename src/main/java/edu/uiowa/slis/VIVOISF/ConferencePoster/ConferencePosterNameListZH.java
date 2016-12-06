package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNameListZHIterator theConferencePoster = (ConferencePosterNameListZHIterator)findAncestorWithClass(this, ConferencePosterNameListZHIterator.class);
			pageContext.getOut().print(theConferencePoster.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

