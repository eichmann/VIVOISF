package edu.uiowa.slis.VIVOISF.Sound;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SoundSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SoundSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(SoundSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Sound theSound = (Sound)findAncestorWithClass(this, Sound.class);
			if (!theSound.commitNeeded) {
				pageContext.getOut().print(theSound.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Sound for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sound for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Sound theSound = (Sound)findAncestorWithClass(this, Sound.class);
			return theSound.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Sound for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sound for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Sound theSound = (Sound)findAncestorWithClass(this, Sound.class);
			theSound.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Sound for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Sound for subjectURI tag ");
		}
	}
}

