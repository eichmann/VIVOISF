package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterEanucc13 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterEanucc13 currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterEanucc13.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterEanucc13Iterator theLetter = (LetterEanucc13Iterator)findAncestorWithClass(this, LetterEanucc13Iterator.class);
			pageContext.getOut().print(theLetter.getEanucc13());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for eanucc13 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for eanucc13 tag ");
		}
		return SKIP_BODY;
	}
}

