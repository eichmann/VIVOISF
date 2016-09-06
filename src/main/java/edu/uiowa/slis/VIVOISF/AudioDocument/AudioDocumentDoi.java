package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentDoi extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentDoi currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentDoi.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentDoiIterator theAudioDocument = (AudioDocumentDoiIterator)findAncestorWithClass(this, AudioDocumentDoiIterator.class);
			pageContext.getOut().print(theAudioDocument.getDoi());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for doi tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for doi tag ");
		}
		return SKIP_BODY;
	}
}

