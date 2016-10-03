package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentContributorListIterator theAudioDocumentContributorListIterator = (AudioDocumentContributorListIterator)findAncestorWithClass(this, AudioDocumentContributorListIterator.class);
			pageContext.getOut().print(theAudioDocumentContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

