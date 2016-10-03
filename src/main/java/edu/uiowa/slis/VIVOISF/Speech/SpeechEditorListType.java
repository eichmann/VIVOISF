package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechEditorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechEditorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechEditorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechEditorListIterator theSpeechEditorListIterator = (SpeechEditorListIterator)findAncestorWithClass(this, SpeechEditorListIterator.class);
			pageContext.getOut().print(theSpeechEditorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for editorList tag ");
		}
		return SKIP_BODY;
	}
}

