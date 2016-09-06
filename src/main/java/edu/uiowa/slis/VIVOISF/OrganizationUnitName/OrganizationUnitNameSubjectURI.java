package edu.uiowa.slis.VIVOISF.OrganizationUnitName;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizationUnitNameSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizationUnitNameSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizationUnitNameSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OrganizationUnitName theOrganizationUnitName = (OrganizationUnitName)findAncestorWithClass(this, OrganizationUnitName.class);
			if (!theOrganizationUnitName.commitNeeded) {
				pageContext.getOut().print(theOrganizationUnitName.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizationUnitName for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizationUnitName for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			OrganizationUnitName theOrganizationUnitName = (OrganizationUnitName)findAncestorWithClass(this, OrganizationUnitName.class);
			return theOrganizationUnitName.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing OrganizationUnitName for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizationUnitName for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			OrganizationUnitName theOrganizationUnitName = (OrganizationUnitName)findAncestorWithClass(this, OrganizationUnitName.class);
			theOrganizationUnitName.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizationUnitName for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizationUnitName for subjectURI tag ");
		}
	}
}

