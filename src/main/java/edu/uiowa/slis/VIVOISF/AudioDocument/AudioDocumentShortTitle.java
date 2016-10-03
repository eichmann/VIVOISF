package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentShortTitle extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentShortTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentShortTitle.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentShortTitleIterator theAudioDocument = (AudioDocumentShortTitleIterator)findAncestorWithClass(this, AudioDocumentShortTitleIterator.class);
			pageContext.getOut().print(theAudioDocument.getShortTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for shortTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for shortTitle tag ");
		}
		return SKIP_BODY;
	}
}

