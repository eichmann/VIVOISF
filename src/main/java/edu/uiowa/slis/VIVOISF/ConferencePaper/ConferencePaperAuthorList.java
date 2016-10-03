package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperAuthorListIterator theConferencePaperAuthorListIterator = (ConferencePaperAuthorListIterator)findAncestorWithClass(this, ConferencePaperAuthorListIterator.class);
			pageContext.getOut().print(theConferencePaperAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for authorList tag ");
		}
		return SKIP_BODY;
	}
}

