package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentUpc extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentUpc currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentUpc.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentUpcIterator theAudioDocument = (AudioDocumentUpcIterator)findAncestorWithClass(this, AudioDocumentUpcIterator.class);
			pageContext.getOut().print(theAudioDocument.getUpc());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for upc tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for upc tag ");
		}
		return SKIP_BODY;
	}
}

