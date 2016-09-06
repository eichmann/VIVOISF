package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentInformationResourceSupportedByIterator theAudioDocumentInformationResourceSupportedByIterator = (AudioDocumentInformationResourceSupportedByIterator)findAncestorWithClass(this, AudioDocumentInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theAudioDocumentInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

