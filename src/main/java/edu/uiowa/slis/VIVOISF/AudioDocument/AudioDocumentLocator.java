package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentLocator extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentLocator currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentLocator.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentLocatorIterator theAudioDocument = (AudioDocumentLocatorIterator)findAncestorWithClass(this, AudioDocumentLocatorIterator.class);
			pageContext.getOut().print(theAudioDocument.getLocator());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for locator tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for locator tag ");
		}
		return SKIP_BODY;
	}
}

