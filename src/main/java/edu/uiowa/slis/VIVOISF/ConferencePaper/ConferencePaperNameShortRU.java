package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameShortRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameShortRU currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameShortRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameShortRUIterator theConferencePaper = (ConferencePaperNameShortRUIterator)findAncestorWithClass(this, ConferencePaperNameShortRUIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameShortRU());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameShortRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameShortRU tag ");
		}
		return SKIP_BODY;
	}
}

