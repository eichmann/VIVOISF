package edu.uiowa.slis.VIVOISF.other;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class otherSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static otherSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(otherSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			other theother = (other)findAncestorWithClass(this, other.class);
			if (!theother.commitNeeded) {
				pageContext.getOut().print(theother.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing other for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			other theother = (other)findAncestorWithClass(this, other.class);
			return theother.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing other for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			other theother = (other)findAncestorWithClass(this, other.class);
			theother.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing other for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing other for subjectURI tag ");
		}
	}
}

