package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterERO_0000045 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterERO_0000045 currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterERO_0000045.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterERO_0000045Iterator theLetter = (LetterERO_0000045Iterator)findAncestorWithClass(this, LetterERO_0000045Iterator.class);
			pageContext.getOut().print(theLetter.getERO_0000045());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for ERO_0000045 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for ERO_0000045 tag ");
		}
		return SKIP_BODY;
	}
}

