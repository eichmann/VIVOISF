package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentIssuerType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentIssuerType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentIssuerType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentIssuerIterator theAudioDocumentIssuerIterator = (AudioDocumentIssuerIterator)findAncestorWithClass(this, AudioDocumentIssuerIterator.class);
			pageContext.getOut().print(theAudioDocumentIssuerIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for issuer tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for issuer tag ");
		}
		return SKIP_BODY;
	}
}

