package edu.uiowa.slis.VIVOISF.Identification;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IdentificationSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static IdentificationSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(IdentificationSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Identification theIdentification = (Identification)findAncestorWithClass(this, Identification.class);
			if (!theIdentification.commitNeeded) {
				pageContext.getOut().print(theIdentification.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Identification for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Identification for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Identification theIdentification = (Identification)findAncestorWithClass(this, Identification.class);
			return theIdentification.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Identification for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Identification for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Identification theIdentification = (Identification)findAncestorWithClass(this, Identification.class);
			theIdentification.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Identification for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Identification for subjectURI tag ");
		}
	}
}

