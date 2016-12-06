package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameListRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameListRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameListRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameListRUIterator theConferencePaper = (ConferencePaperNameListRUIterator)findAncestorWithClass(this, ConferencePaperNameListRUIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameListRU());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameListRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameListRU tag ");
		}
		return SKIP_BODY;
	}
}

