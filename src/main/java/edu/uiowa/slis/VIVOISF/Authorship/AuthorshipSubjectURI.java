package edu.uiowa.slis.VIVOISF.Authorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AuthorshipSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AuthorshipSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AuthorshipSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Authorship theAuthorship = (Authorship)findAncestorWithClass(this, Authorship.class);
			if (!theAuthorship.commitNeeded) {
				pageContext.getOut().print(theAuthorship.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Authorship theAuthorship = (Authorship)findAncestorWithClass(this, Authorship.class);
			return theAuthorship.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Authorship for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Authorship theAuthorship = (Authorship)findAncestorWithClass(this, Authorship.class);
			theAuthorship.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Authorship for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Authorship for subjectURI tag ");
		}
	}
}

