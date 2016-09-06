package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentPmid extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentPmid currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentPmid.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentPmidIterator theAudioDocument = (AudioDocumentPmidIterator)findAncestorWithClass(this, AudioDocumentPmidIterator.class);
			pageContext.getOut().print(theAudioDocument.getPmid());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for pmid tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for pmid tag ");
		}
		return SKIP_BODY;
	}
}

