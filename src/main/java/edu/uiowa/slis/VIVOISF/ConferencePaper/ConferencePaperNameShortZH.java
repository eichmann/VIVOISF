package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameShortZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameShortZH currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameShortZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameShortZHIterator theConferencePaper = (ConferencePaperNameShortZHIterator)findAncestorWithClass(this, ConferencePaperNameShortZHIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameShortZH());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameShortZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameShortZH tag ");
		}
		return SKIP_BODY;
	}
}

