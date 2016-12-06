package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameShortAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameShortAR currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameShortAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameShortARIterator theConferencePaper = (ConferencePaperNameShortARIterator)findAncestorWithClass(this, ConferencePaperNameShortARIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameShortAR());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameShortAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameShortAR tag ");
		}
		return SKIP_BODY;
	}
}

