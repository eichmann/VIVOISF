package edu.uiowa.slis.VIVOISF.AudioVisualDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioVisualDocumentSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioVisualDocumentSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioVisualDocumentSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AudioVisualDocument theAudioVisualDocument = (AudioVisualDocument)findAncestorWithClass(this, AudioVisualDocument.class);
			if (!theAudioVisualDocument.commitNeeded) {
				pageContext.getOut().print(theAudioVisualDocument.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			AudioVisualDocument theAudioVisualDocument = (AudioVisualDocument)findAncestorWithClass(this, AudioVisualDocument.class);
			return theAudioVisualDocument.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing AudioVisualDocument for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			AudioVisualDocument theAudioVisualDocument = (AudioVisualDocument)findAncestorWithClass(this, AudioVisualDocument.class);
			theAudioVisualDocument.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing AudioVisualDocument for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioVisualDocument for subjectURI tag ");
		}
	}
}

