package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameListIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameListIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameListIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameListITIterator theConferencePaper = (ConferencePaperNameListITIterator)findAncestorWithClass(this, ConferencePaperNameListITIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameListIT());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameListIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameListIT tag ");
		}
		return SKIP_BODY;
	}
}

