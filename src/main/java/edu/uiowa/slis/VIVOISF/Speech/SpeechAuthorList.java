package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechAuthorListIterator theSpeechAuthorListIterator = (SpeechAuthorListIterator)findAncestorWithClass(this, SpeechAuthorListIterator.class);
			pageContext.getOut().print(theSpeechAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for authorList tag ");
		}
		return SKIP_BODY;
	}
}

