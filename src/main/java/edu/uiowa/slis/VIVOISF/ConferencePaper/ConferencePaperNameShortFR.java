package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameShortFR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameShortFR currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameShortFR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameShortFRIterator theConferencePaper = (ConferencePaperNameShortFRIterator)findAncestorWithClass(this, ConferencePaperNameShortFRIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameShortFR());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameShortFR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameShortFR tag ");
		}
		return SKIP_BODY;
	}
}

