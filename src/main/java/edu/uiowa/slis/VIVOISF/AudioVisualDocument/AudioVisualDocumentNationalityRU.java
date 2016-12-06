package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNationalityRU extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNationalityRU currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNationalityRU.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNationalityRUIterator theAudioVisualDocument = (AudioVisualDocumentNationalityRUIterator)findAncestorWithClass(this, AudioVisualDocumentNationalityRUIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNationalityRU());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nationalityRU tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nationalityRU tag ");
		}
		return SKIP_BODY;
	}
}

