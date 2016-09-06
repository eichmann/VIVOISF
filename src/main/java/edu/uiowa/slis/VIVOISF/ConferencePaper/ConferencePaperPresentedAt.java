package edu.uiowa.slis.VIVOISF.ConferencePaper;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ConferencePaperPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ConferencePaperPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(ConferencePaperPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ConferencePaperPresentedAtIterator theConferencePaperPresentedAtIterator = (ConferencePaperPresentedAtIterator)findAncestorWithClass(this, ConferencePaperPresentedAtIterator.class);
			pageContext.getOut().print(theConferencePaperPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing ConferencePaper for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing ConferencePaper for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

