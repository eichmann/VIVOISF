package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterAuthorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterAuthorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterAuthorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			LetterAuthorListIterator theLetterAuthorListIterator = (LetterAuthorListIterator)findAncestorWithClass(this, LetterAuthorListIterator.class);
			pageContext.getOut().print(theLetterAuthorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for authorList tag ");
		}
		return SKIP_BODY;
	}
}
