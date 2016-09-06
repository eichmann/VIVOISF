package edu.uiowa.slis.VIVOISF.Patent;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PatentSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PatentSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PatentSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Patent thePatent = (Patent)findAncestorWithClass(this, Patent.class);
			if (!thePatent.commitNeeded) {
				pageContext.getOut().print(thePatent.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Patent thePatent = (Patent)findAncestorWithClass(this, Patent.class);
			return thePatent.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Patent for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Patent thePatent = (Patent)findAncestorWithClass(this, Patent.class);
			thePatent.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Patent for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Patent for subjectURI tag ");
		}
	}
}

