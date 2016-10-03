package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNumber extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNumber currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNumber.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNumberIterator theConferencePaper = (ConferencePaperNumberIterator)findAncestorWithClass(this, ConferencePaperNumberIterator.class);
			pageContext.getOut().print(theConferencePaper.getNumber());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for number tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for number tag ");
		}
		return SKIP_BODY;
	}
}

