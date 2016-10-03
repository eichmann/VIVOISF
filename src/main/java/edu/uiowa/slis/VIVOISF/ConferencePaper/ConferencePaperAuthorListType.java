package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperAuthorListIterator theConferencePaperAuthorListIterator = (ConferencePaperAuthorListIterator)findAncestorWithClass(this, ConferencePaperAuthorListIterator.class);
			pageContext.getOut().print(theConferencePaperAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for authorList tag ");
		}
		return SKIP_BODY;
	}
}

