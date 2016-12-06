package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNameListESIterator theConferencePoster = (ConferencePosterNameListESIterator)findAncestorWithClass(this, ConferencePosterNameListESIterator.class);
			pageContext.getOut().print(theConferencePoster.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

