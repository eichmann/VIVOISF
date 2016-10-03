package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentShortDescription extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentShortDescription currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentShortDescription.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentShortDescriptionIterator theAudioDocument = (AudioDocumentShortDescriptionIterator)findAncestorWithClass(this, AudioDocumentShortDescriptionIterator.class);
			pageContext.getOut().print(theAudioDocument.getShortDescription());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for shortDescription tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for shortDescription tag ");
		}
		return SKIP_BODY;
	}
}

