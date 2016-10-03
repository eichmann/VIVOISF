package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentEditor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentEditor currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentEditor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentEditorIterator theAudioDocumentEditorIterator = (AudioDocumentEditorIterator)findAncestorWithClass(this, AudioDocumentEditorIterator.class);
			pageContext.getOut().print(theAudioDocumentEditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for editor tag ");
		}
		return SKIP_BODY;
	}
}

