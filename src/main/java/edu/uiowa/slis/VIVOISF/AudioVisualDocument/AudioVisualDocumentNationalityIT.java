package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNationalityIT extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNationalityIT currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNationalityIT.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNationalityITIterator theAudioVisualDocument = (AudioVisualDocumentNationalityITIterator)findAncestorWithClass(this, AudioVisualDocumentNationalityITIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNationalityIT());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nationalityIT tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nationalityIT tag ");
		}
		return SKIP_BODY;
	}
}

