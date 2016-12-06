package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameShortIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameShortIT currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameShortIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameShortITIterator theConferencePaper = (ConferencePaperNameShortITIterator)findAncestorWithClass(this, ConferencePaperNameShortITIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameShortIT());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameShortIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameShortIT tag ");
		}
		return SKIP_BODY;
	}
}

