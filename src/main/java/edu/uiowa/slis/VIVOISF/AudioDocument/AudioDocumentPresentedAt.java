package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentPresentedAtIterator theAudioDocumentPresentedAtIterator = (AudioDocumentPresentedAtIterator)findAncestorWithClass(this, AudioDocumentPresentedAtIterator.class);
			pageContext.getOut().print(theAudioDocumentPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

