package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentHasTitleType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentHasTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentHasTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentHasTitleIterator theAudioVisualDocumentHasTitleIterator = (AudioVisualDocumentHasTitleIterator)findAncestorWithClass(this, AudioVisualDocumentHasTitleIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentHasTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for hasTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for hasTitle tag ");
		}
		return SKIP_BODY;
	}
}

