package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentInformationResourceSupportedByIterator theAudioVisualDocumentInformationResourceSupportedByIterator = (AudioVisualDocumentInformationResourceSupportedByIterator)findAncestorWithClass(this, AudioVisualDocumentInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

