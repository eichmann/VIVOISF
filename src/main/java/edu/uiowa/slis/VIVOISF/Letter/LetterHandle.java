package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterHandle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterHandle currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterHandle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterHandleIterator theLetter = (LetterHandleIterator)findAncestorWithClass(this, LetterHandleIterator.class);
			pageContext.getOut().print(theLetter.getHandle());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for handle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for handle tag ");
		}
		return SKIP_BODY;
	}
}

