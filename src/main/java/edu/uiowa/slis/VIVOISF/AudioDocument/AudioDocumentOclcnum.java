package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentOclcnumIterator theAudioDocument = (AudioDocumentOclcnumIterator)findAncestorWithClass(this, AudioDocumentOclcnumIterator.class);
			pageContext.getOut().print(theAudioDocument.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

