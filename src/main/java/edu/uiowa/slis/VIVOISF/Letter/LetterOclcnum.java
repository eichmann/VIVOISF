package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			LetterOclcnumIterator theLetter = (LetterOclcnumIterator)findAncestorWithClass(this, LetterOclcnumIterator.class);
			pageContext.getOut().print(theLetter.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

