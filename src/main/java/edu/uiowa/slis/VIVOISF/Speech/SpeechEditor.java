package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechEditorIterator theSpeechEditorIterator = (SpeechEditorIterator)findAncestorWithClass(this, SpeechEditorIterator.class);
			pageContext.getOut().print(theSpeechEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for editor tag ");
		}
		return SKIP_BODY;
	}
}

