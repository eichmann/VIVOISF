package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNameListRUIterator theConferencePoster = (ConferencePosterNameListRUIterator)findAncestorWithClass(this, ConferencePosterNameListRUIterator.class);
			pageContext.getOut().print(theConferencePoster.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

