package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechInformationResourceSupportedByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechInformationResourceSupportedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechInformationResourceSupportedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechInformationResourceSupportedByIterator theSpeechInformationResourceSupportedByIterator = (SpeechInformationResourceSupportedByIterator)findAncestorWithClass(this, SpeechInformationResourceSupportedByIterator.class);
			pageContext.getOut().print(theSpeechInformationResourceSupportedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for informationResourceSupportedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for informationResourceSupportedBy tag ");
		}
		return SKIP_BODY;
	}
}

