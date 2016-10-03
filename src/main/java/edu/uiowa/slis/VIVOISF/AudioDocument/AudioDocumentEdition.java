package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentEditionIterator theAudioDocument = (AudioDocumentEditionIterator)findAncestorWithClass(this, AudioDocumentEditionIterator.class);
			pageContext.getOut().print(theAudioDocument.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for edition tag ");
		}
		return SKIP_BODY;
	}
}

