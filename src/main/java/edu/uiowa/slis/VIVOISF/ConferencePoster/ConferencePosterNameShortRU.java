package edu.uiowa.slis.VIVOISF.ConferencePoster;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePosterNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePosterNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePosterNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePosterNameShortRUIterator theConferencePoster = (ConferencePosterNameShortRUIterator)findAncestorWithClass(this, ConferencePosterNameShortRUIterator.class);
			pageContext.getOut().print(theConferencePoster.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePoster for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePoster for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

