package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameListZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameListZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameListZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameListZHIterator theConferencePaper = (ConferencePaperNameListZHIterator)findAncestorWithClass(this, ConferencePaperNameListZHIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameListZH());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameListZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameListZH tag ");
		}
		return SKIP_BODY;
	}
}

