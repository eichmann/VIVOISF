package edu.uiowa.slis.VIVOISF.AudioDocument;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AudioDocumentLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AudioDocumentLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(AudioDocumentLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AudioDocument theAudioDocument = (AudioDocument)findAncestorWithClass(this, AudioDocument.class);
			if (!theAudioDocument.commitNeeded) {
				pageContext.getOut().print(theAudioDocument.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			AudioDocument theAudioDocument = (AudioDocument)findAncestorWithClass(this, AudioDocument.class);
			return theAudioDocument.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing AudioDocument for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			AudioDocument theAudioDocument = (AudioDocument)findAncestorWithClass(this, AudioDocument.class);
			theAudioDocument.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing AudioDocument for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing AudioDocument for label tag ");
		}
	}
}

