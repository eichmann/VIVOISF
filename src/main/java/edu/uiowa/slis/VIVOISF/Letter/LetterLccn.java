package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterLccn extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterLccn currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterLccn.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterLccnIterator theLetter = (LetterLccnIterator)findAncestorWithClass(this, LetterLccnIterator.class);
			pageContext.getOut().print(theLetter.getLccn());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for lccn tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for lccn tag ");
		}
		return SKIP_BODY;
	}
}

