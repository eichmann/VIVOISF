package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocument theAudioDocument = (AudioDocument)findAncestorWithClass(this, AudioDocument.class);
			if (!theAudioDocument.commitNeeded) {
				pageContext.getOut().print(theAudioDocument.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			AudioDocument theAudioDocument = (AudioDocument)findAncestorWithClass(this, AudioDocument.class);
			return theAudioDocument.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing AudioDocument for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			AudioDocument theAudioDocument = (AudioDocument)findAncestorWithClass(this, AudioDocument.class);
			theAudioDocument.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for subjectURI tag ");
		}
	}
}

