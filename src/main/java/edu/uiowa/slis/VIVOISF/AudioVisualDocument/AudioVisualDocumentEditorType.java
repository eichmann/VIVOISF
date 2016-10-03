package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentEditorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentEditorType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentEditorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentEditorIterator theAudioVisualDocumentEditorIterator = (AudioVisualDocumentEditorIterator)findAncestorWithClass(this, AudioVisualDocumentEditorIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentEditorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for editor tag ");
		}
		return SKIP_BODY;
	}
}

