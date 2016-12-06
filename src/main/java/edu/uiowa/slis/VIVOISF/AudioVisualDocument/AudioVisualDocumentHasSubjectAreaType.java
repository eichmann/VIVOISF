package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentHasSubjectAreaType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentHasSubjectAreaType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentHasSubjectAreaType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentHasSubjectAreaIterator theAudioVisualDocumentHasSubjectAreaIterator = (AudioVisualDocumentHasSubjectAreaIterator)findAncestorWithClass(this, AudioVisualDocumentHasSubjectAreaIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentHasSubjectAreaIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for hasSubjectArea tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for hasSubjectArea tag ");
		}
		return SKIP_BODY;
	}
}

