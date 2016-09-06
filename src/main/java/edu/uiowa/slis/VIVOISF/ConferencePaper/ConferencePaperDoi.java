package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperDoiIterator theConferencePaper = (ConferencePaperDoiIterator)findAncestorWithClass(this, ConferencePaperDoiIterator.class);
			pageContext.getOut().print(theConferencePaper.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for doi tag ");
		}
		return SKIP_BODY;
	}
}

