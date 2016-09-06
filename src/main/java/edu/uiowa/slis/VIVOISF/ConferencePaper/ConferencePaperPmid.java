package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperPmidIterator theConferencePaper = (ConferencePaperPmidIterator)findAncestorWithClass(this, ConferencePaperPmidIterator.class);
			pageContext.getOut().print(theConferencePaper.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for pmid tag ");
		}
		return SKIP_BODY;
	}
}

