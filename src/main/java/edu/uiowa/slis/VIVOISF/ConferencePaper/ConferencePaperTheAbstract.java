package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperTheAbstract extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperTheAbstract currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperTheAbstract.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperTheAbstractIterator theConferencePaper = (ConferencePaperTheAbstractIterator)findAncestorWithClass(this, ConferencePaperTheAbstractIterator.class);
			pageContext.getOut().print(theConferencePaper.getTheAbstract());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for theAbstract tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for theAbstract tag ");
		}
		return SKIP_BODY;
	}
}

