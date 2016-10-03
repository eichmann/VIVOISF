package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperSici currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperSiciIterator theConferencePaper = (ConferencePaperSiciIterator)findAncestorWithClass(this, ConferencePaperSiciIterator.class);
			pageContext.getOut().print(theConferencePaper.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for sici tag ");
		}
		return SKIP_BODY;
	}
}

