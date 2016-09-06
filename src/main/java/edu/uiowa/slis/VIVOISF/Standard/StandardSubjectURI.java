package edu.uiowa.slis.VIVOISF.Standard;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class StandardSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static StandardSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(StandardSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Standard theStandard = (Standard)findAncestorWithClass(this, Standard.class);
			if (!theStandard.commitNeeded) {
				pageContext.getOut().print(theStandard.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Standard theStandard = (Standard)findAncestorWithClass(this, Standard.class);
			return theStandard.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Standard for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Standard theStandard = (Standard)findAncestorWithClass(this, Standard.class);
			theStandard.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Standard for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Standard for subjectURI tag ");
		}
	}
}

