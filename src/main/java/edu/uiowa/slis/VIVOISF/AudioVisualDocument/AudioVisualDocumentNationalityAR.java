package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNationalityAR extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNationalityAR currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNationalityAR.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNationalityARIterator theAudioVisualDocument = (AudioVisualDocumentNationalityARIterator)findAncestorWithClass(this, AudioVisualDocumentNationalityARIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNationalityAR());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nationalityAR tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nationalityAR tag ");
		}
		return SKIP_BODY;
	}
}

