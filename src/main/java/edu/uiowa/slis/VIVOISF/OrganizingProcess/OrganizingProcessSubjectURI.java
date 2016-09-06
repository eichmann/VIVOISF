package edu.uiowa.slis.VIVOISF.OrganizingProcess;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizingProcessSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizingProcessSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizingProcessSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OrganizingProcess theOrganizingProcess = (OrganizingProcess)findAncestorWithClass(this, OrganizingProcess.class);
			if (!theOrganizingProcess.commitNeeded) {
				pageContext.getOut().print(theOrganizingProcess.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizingProcess for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizingProcess for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			OrganizingProcess theOrganizingProcess = (OrganizingProcess)findAncestorWithClass(this, OrganizingProcess.class);
			return theOrganizingProcess.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing OrganizingProcess for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizingProcess for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			OrganizingProcess theOrganizingProcess = (OrganizingProcess)findAncestorWithClass(this, OrganizingProcess.class);
			theOrganizingProcess.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizingProcess for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizingProcess for subjectURI tag ");
		}
	}
}

