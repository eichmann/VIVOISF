package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameListFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameListFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameListFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameListFRIterator theConferencePaper = (ConferencePaperNameListFRIterator)findAncestorWithClass(this, ConferencePaperNameListFRIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameListFR());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameListFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameListFR tag ");
		}
		return SKIP_BODY;
	}
}

