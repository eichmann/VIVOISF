package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterPresentedAtIterator theLetterPresentedAtIterator = (LetterPresentedAtIterator)findAncestorWithClass(this, LetterPresentedAtIterator.class);
			pageContext.getOut().print(theLetterPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

