package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNationalityES extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNationalityES currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNationalityES.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNationalityESIterator theAudioVisualDocument = (AudioVisualDocumentNationalityESIterator)findAncestorWithClass(this, AudioVisualDocumentNationalityESIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNationalityES());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nationalityES tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nationalityES tag ");
		}
		return SKIP_BODY;
	}
}

