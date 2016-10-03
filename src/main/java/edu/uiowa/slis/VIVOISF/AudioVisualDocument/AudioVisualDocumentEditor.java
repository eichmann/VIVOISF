package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentEditorIterator theAudioVisualDocumentEditorIterator = (AudioVisualDocumentEditorIterator)findAncestorWithClass(this, AudioVisualDocumentEditorIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for editor tag ");
		}
		return SKIP_BODY;
	}
}

