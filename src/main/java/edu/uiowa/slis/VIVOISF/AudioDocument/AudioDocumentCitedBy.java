package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentCitedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentCitedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentCitedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentCitedByIterator theAudioDocumentCitedByIterator = (AudioDocumentCitedByIterator)findAncestorWithClass(this, AudioDocumentCitedByIterator.class);
			pageContext.getOut().print(theAudioDocumentCitedByIterator.getCitedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for citedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for citedBy tag ");
		}
		return SKIP_BODY;
	}
}

