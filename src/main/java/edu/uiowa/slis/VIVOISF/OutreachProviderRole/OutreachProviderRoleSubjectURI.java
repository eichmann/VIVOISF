package edu.uiowa.slis.VIVOISF.OutreachProviderRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OutreachProviderRoleSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OutreachProviderRoleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(OutreachProviderRoleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			OutreachProviderRole theOutreachProviderRole = (OutreachProviderRole)findAncestorWithClass(this, OutreachProviderRole.class);
			if (!theOutreachProviderRole.commitNeeded) {
				pageContext.getOut().print(theOutreachProviderRole.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing OutreachProviderRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OutreachProviderRole for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			OutreachProviderRole theOutreachProviderRole = (OutreachProviderRole)findAncestorWithClass(this, OutreachProviderRole.class);
			return theOutreachProviderRole.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing OutreachProviderRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OutreachProviderRole for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			OutreachProviderRole theOutreachProviderRole = (OutreachProviderRole)findAncestorWithClass(this, OutreachProviderRole.class);
			theOutreachProviderRole.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing OutreachProviderRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing OutreachProviderRole for subjectURI tag ");
		}
	}
}

