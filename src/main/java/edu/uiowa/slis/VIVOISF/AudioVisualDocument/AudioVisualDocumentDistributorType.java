package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentDistributorIterator theAudioVisualDocumentDistributorIterator = (AudioVisualDocumentDistributorIterator)findAncestorWithClass(this, AudioVisualDocumentDistributorIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for distributor tag ");
		}
		return SKIP_BODY;
	}
}

