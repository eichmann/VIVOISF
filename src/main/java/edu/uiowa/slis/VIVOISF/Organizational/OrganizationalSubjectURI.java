package edu.uiowa.slis.VIVOISF.Organizational;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationalSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationalSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationalSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Organizational theOrganizational = (Organizational)findAncestorWithClass(this, Organizational.class);
			if (!theOrganizational.commitNeeded) {
				pageContext.getOut().print(theOrganizational.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Organizational for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organizational for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Organizational theOrganizational = (Organizational)findAncestorWithClass(this, Organizational.class);
			return theOrganizational.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Organizational for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organizational for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Organizational theOrganizational = (Organizational)findAncestorWithClass(this, Organizational.class);
			theOrganizational.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Organizational for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Organizational for subjectURI tag ");
		}
	}
}

