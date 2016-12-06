package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentHasTelephoneType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentHasTelephoneType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentHasTelephoneType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentHasTelephoneIterator theAudioVisualDocumentHasTelephoneIterator = (AudioVisualDocumentHasTelephoneIterator)findAncestorWithClass(this, AudioVisualDocumentHasTelephoneIterator.class);
			pageContext.getOut().print(theAudioVisualDocumentHasTelephoneIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for hasTelephone tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for hasTelephone tag ");
		}
		return SKIP_BODY;
	}
}

