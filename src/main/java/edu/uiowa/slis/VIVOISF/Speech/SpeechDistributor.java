package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechDistributor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechDistributor currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechDistributor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechDistributorIterator theSpeechDistributorIterator = (SpeechDistributorIterator)findAncestorWithClass(this, SpeechDistributorIterator.class);
			pageContext.getOut().print(theSpeechDistributorIterator.getDistributor());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for distributor tag ");
		}
		return SKIP_BODY;
	}
}
