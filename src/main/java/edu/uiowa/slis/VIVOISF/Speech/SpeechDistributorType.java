package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechDistributorIterator theSpeechDistributorIterator = (SpeechDistributorIterator)findAncestorWithClass(this, SpeechDistributorIterator.class);
			pageContext.getOut().print(theSpeechDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for distributor tag ");
		}
		return SKIP_BODY;
	}
}

