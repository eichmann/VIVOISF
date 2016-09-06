package edu.uiowa.slis.VIVOISF.InvestigatorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InvestigatorRoleSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InvestigatorRoleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(InvestigatorRoleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			InvestigatorRole theInvestigatorRole = (InvestigatorRole)findAncestorWithClass(this, InvestigatorRole.class);
			if (!theInvestigatorRole.commitNeeded) {
				pageContext.getOut().print(theInvestigatorRole.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing InvestigatorRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing InvestigatorRole for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			InvestigatorRole theInvestigatorRole = (InvestigatorRole)findAncestorWithClass(this, InvestigatorRole.class);
			return theInvestigatorRole.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing InvestigatorRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing InvestigatorRole for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			InvestigatorRole theInvestigatorRole = (InvestigatorRole)findAncestorWithClass(this, InvestigatorRole.class);
			theInvestigatorRole.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing InvestigatorRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing InvestigatorRole for subjectURI tag ");
		}
	}
}

