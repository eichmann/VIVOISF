package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentNationalityZH extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentNationalityZH currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentNationalityZH.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocumentNationalityZHIterator theAudioVisualDocument = (AudioVisualDocumentNationalityZHIterator)findAncestorWithClass(this, AudioVisualDocumentNationalityZHIterator.class);
			pageContext.getOut().print(theAudioVisualDocument.getNationalityZH());
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for nationalityZH tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for nationalityZH tag ");
		}
		return SKIP_BODY;
	}
}

