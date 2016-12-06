package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperHasName extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperHasName currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperHasName.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperHasNameIterator theConferencePaperHasNameIterator = (ConferencePaperHasNameIterator)findAncestorWithClass(this, ConferencePaperHasNameIterator.class);
			pageContext.getOut().print(theConferencePaperHasNameIterator.getHasName());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for hasName tag ");
		}
		return SKIP_BODY;
	}
}

