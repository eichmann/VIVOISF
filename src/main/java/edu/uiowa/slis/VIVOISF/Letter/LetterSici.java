package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterSici extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterSici currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterSici.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterSiciIterator theLetter = (LetterSiciIterator)findAncestorWithClass(this, LetterSiciIterator.class);
			pageContext.getOut().print(theLetter.getSici());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for sici tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for sici tag ");
		}
		return SKIP_BODY;
	}
}

