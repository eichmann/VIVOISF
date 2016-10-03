package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperOwner extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperOwner currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperOwner.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperOwnerIterator theConferencePaperOwnerIterator = (ConferencePaperOwnerIterator)findAncestorWithClass(this, ConferencePaperOwnerIterator.class);
			pageContext.getOut().print(theConferencePaperOwnerIterator.getOwner());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for owner tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for owner tag ");
		}
		return SKIP_BODY;
	}
}

