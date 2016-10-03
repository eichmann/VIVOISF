package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentEditorListIterator theAudioVisualDocumentEditorListIterator = (AudioVisualDocumentEditorListIterator)findAncestorWithClass(this, AudioVisualDocumentEditorListIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for editorList tag ");
		}
		return SKIP_BODY;
	}
}

