package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentPageEnd extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentPageEnd currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentPageEnd.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentPageEndIterator theAudioDocument = (AudioDocumentPageEndIterator)findAncestorWithClass(this, AudioDocumentPageEndIterator.class);
			pageContext.getOut().print(theAudioDocument.getPageEnd());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for pageEnd tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for pageEnd tag ");
		}
		return SKIP_BODY;
	}
}

