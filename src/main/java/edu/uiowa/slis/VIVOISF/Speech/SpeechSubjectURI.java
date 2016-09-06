package edu.uiowa.slis.VIVOISF.Speech;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpeechSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SpeechSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(SpeechSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Speech theSpeech = (Speech)findAncestorWithClass(this, Speech.class);
			if (!theSpeech.commitNeeded) {
				pageContext.getOut().print(theSpeech.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Speech theSpeech = (Speech)findAncestorWithClass(this, Speech.class);
			return theSpeech.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Speech for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Speech theSpeech = (Speech)findAncestorWithClass(this, Speech.class);
			theSpeech.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Speech for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Speech for subjectURI tag ");
		}
	}
}

