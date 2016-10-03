package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentGtin14 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentGtin14 currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentGtin14.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentGtin14Iterator theAudioDocument = (AudioDocumentGtin14Iterator)findAncestorWithClass(this, AudioDocumentGtin14Iterator.class);
			pageContext.getOut().print(theAudioDocument.getGtin14());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for gtin14 tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for gtin14 tag ");
		}
		return SKIP_BODY;
	}
}

