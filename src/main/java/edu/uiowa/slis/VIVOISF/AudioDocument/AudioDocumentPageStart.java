package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentPageStart extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentPageStart currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentPageStart.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentPageStartIterator theAudioDocument = (AudioDocumentPageStartIterator)findAncestorWithClass(this, AudioDocumentPageStartIterator.class);
			pageContext.getOut().print(theAudioDocument.getPageStart());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for pageStart tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for pageStart tag ");
		}
		return SKIP_BODY;
	}
}

