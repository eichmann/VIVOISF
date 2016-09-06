package edu.uiowa.slis.VIVOISF.OrganizerRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OrganizerRoleSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OrganizerRoleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(OrganizerRoleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OrganizerRole theOrganizerRole = (OrganizerRole)findAncestorWithClass(this, OrganizerRole.class);
			if (!theOrganizerRole.commitNeeded) {
				pageContext.getOut().print(theOrganizerRole.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizerRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizerRole for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			OrganizerRole theOrganizerRole = (OrganizerRole)findAncestorWithClass(this, OrganizerRole.class);
			return theOrganizerRole.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing OrganizerRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizerRole for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			OrganizerRole theOrganizerRole = (OrganizerRole)findAncestorWithClass(this, OrganizerRole.class);
			theOrganizerRole.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing OrganizerRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OrganizerRole for subjectURI tag ");
		}
	}
}

