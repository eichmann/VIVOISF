package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperHasEmail extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperHasEmail currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperHasEmail.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperHasEmailIterator theConferencePaperHasEmailIterator = (ConferencePaperHasEmailIterator)findAncestorWithClass(this, ConferencePaperHasEmailIterator.class);
			pageContext.getOut().print(theConferencePaperHasEmailIterator.getHasEmail());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

