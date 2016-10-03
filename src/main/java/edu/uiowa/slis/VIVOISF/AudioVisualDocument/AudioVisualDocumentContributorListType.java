package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentContributorListType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentContributorListType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentContributorListType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentContributorListIterator theAudioVisualDocumentContributorListIterator = (AudioVisualDocumentContributorListIterator)findAncestorWithClass(this, AudioVisualDocumentContributorListIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentContributorListIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for contributorList tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for contributorList tag ");
		}
		return SKIP_BODY;
	}
}

