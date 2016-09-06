package edu.uiowa.slis.VIVOISF.OrganizationName;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationNameSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationNameSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationNameSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationName theOrganizationName = (OrganizationName)findAncestorWithClass(this, OrganizationName.class);
			if (!theOrganizationName.commitNeeded) {
				pageContext.getOut().print(theOrganizationName.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizationName for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizationName for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			OrganizationName theOrganizationName = (OrganizationName)findAncestorWithClass(this, OrganizationName.class);
			return theOrganizationName.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing OrganizationName for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizationName for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			OrganizationName theOrganizationName = (OrganizationName)findAncestorWithClass(this, OrganizationName.class);
			theOrganizationName.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizationName for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizationName for subjectURI tag ");
		}
	}
}

