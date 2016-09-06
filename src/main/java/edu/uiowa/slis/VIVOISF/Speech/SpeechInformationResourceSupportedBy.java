package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechInformationResourceSupportedBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechInformationResourceSupportedBy currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechInformationResourceSupportedBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechInformationResourceSupportedByIterator theSpeechInformationResourceSupportedByIterator = (SpeechInformationResourceSupportedByIterator)findAncestorWithClass(this, SpeechInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theSpeechInformationResourceSupportedByIterator.getInformationResourceSupportedBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

