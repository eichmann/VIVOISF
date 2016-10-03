package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentNumPages extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentNumPages currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentNumPages.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentNumPagesIterator theAudioDocument = (AudioDocumentNumPagesIterator)findAncestorWithClass(this, AudioDocumentNumPagesIterator.class);
			pageContext.getOut().print(theAudioDocument.getNumPages());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for numPages tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for numPages tag ");
		}
		return SKIP_BODY;
	}
}

