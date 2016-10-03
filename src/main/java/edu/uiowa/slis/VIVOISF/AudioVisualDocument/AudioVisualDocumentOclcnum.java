package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentOclcnumIterator theAudioVisualDocument = (AudioVisualDocumentOclcnumIterator)findAncestorWithClass(this, AudioVisualDocumentOclcnumIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

