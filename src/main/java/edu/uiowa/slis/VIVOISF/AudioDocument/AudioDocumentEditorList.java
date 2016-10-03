package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentEditorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentEditorList currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentEditorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentEditorListIterator theAudioDocumentEditorListIterator = (AudioDocumentEditorListIterator)findAncestorWithClass(this, AudioDocumentEditorListIterator.class);
			pageContext.getOut().print(theAudioDocumentEditorListIterator.getEditorList());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for editorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for editorList tag ");
		}
		return SKIP_BODY;
	}
}

