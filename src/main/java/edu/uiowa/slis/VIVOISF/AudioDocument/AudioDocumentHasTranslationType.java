package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentHasTranslationType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentHasTranslationType currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentHasTranslationType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AudioDocumentHasTranslationIterator theAudioDocumentHasTranslationIterator = (AudioDocumentHasTranslationIterator)findAncestorWithClass(this, AudioDocumentHasTranslationIterator.class);
			pageContext.getOut().print(theAudioDocumentHasTranslationIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for hasTranslation tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for hasTranslation tag ");
		}
		return SKIP_BODY;
	}
}

