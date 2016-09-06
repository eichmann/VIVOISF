package edu.uiowa.slis.VIVOISF.Letter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LetterSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LetterSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(LetterSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Letter theLetter = (Letter)findAncestorWithClass(this, Letter.class);
			if (!theLetter.commitNeeded) {
				pageContext.getOut().print(theLetter.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Letter theLetter = (Letter)findAncestorWithClass(this, Letter.class);
			return theLetter.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Letter for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Letter theLetter = (Letter)findAncestorWithClass(this, Letter.class);
			theLetter.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Letter for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Letter for subjectURI tag ");
		}
	}
}

