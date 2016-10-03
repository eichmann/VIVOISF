package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentReviewOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentReviewOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentReviewOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentReviewOfIterator theAudioDocumentReviewOfIterator = (AudioDocumentReviewOfIterator)findAncestorWithClass(this, AudioDocumentReviewOfIterator.class);
			pageContext.getOut().print(theAudioDocumentReviewOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for reviewOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for reviewOf tag ");
		}
		return SKIP_BODY;
	}
}

