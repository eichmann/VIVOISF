package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			SpeechContributorListIterator theSpeechContributorListIterator = (SpeechContributorListIterator)findAncestorWithClass(this, SpeechContributorListIterator.class);
			pageContext.getOut().print(theSpeechContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

