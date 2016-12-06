package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameListAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameListAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameListAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameListARIterator theConferencePaper = (ConferencePaperNameListARIterator)findAncestorWithClass(this, ConferencePaperNameListARIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameListAR());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameListAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameListAR tag ");
		}
		return SKIP_BODY;
	}
}

