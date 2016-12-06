package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameListES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameListES currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameListES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameListESIterator theConferencePaper = (ConferencePaperNameListESIterator)findAncestorWithClass(this, ConferencePaperNameListESIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameListES());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameListES tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameListES tag ");
		}
		return SKIP_BODY;
	}
}

