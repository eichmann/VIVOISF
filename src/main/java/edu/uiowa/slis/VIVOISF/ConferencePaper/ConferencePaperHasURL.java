package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperHasURL extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperHasURL currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperHasURL.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperHasURLIterator theConferencePaperHasURLIterator = (ConferencePaperHasURLIterator)findAncestorWithClass(this, ConferencePaperHasURLIterator.class);
			pageContext.getOut().print(theConferencePaperHasURLIterator.getHasURL());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

