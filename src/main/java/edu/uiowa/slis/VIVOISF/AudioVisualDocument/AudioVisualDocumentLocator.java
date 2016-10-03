package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentLocatorIterator theAudioVisualDocument = (AudioVisualDocumentLocatorIterator)findAncestorWithClass(this, AudioVisualDocumentLocatorIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for locator tag ");
		}
		return SKIP_BODY;
	}
}

