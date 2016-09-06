package edu.uiowa.slis.VIVOISF.Voice;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class VoiceSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static VoiceSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(VoiceSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Voice theVoice = (Voice)findAncestorWithClass(this, Voice.class);
			if (!theVoice.commitNeeded) {
				pageContext.getOut().print(theVoice.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Voice for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Voice for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Voice theVoice = (Voice)findAncestorWithClass(this, Voice.class);
			return theVoice.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Voice for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Voice for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Voice theVoice = (Voice)findAncestorWithClass(this, Voice.class);
			theVoice.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Voice for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Voice for subjectURI tag ");
		}
	}
}

