package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentAuthorList extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentAuthorList currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentAuthorList.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentAuthorListIterator theAudioVisualDocumentAuthorListIterator = (AudioVisualDocumentAuthorListIterator)findAncestorWithClass(this, AudioVisualDocumentAuthorListIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentAuthorListIterator.getAuthorList());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for authorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for authorList tag ");
		}
		return SKIP_BODY;
	}
}

