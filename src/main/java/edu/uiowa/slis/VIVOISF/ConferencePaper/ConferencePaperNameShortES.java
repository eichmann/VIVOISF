package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperNameShortES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperNameShortES currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperNameShortES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperNameShortESIterator theConferencePaper = (ConferencePaperNameShortESIterator)findAncestorWithClass(this, ConferencePaperNameShortESIterator.class);
			pageContext.getOut().print(theConferencePaper.getNameShortES());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for nameShortES tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for nameShortES tag ");
		}
		return SKIP_BODY;
	}
}

