package edu.uiowa.slis.VIVOISF.AdviseeRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AdviseeRoleSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AdviseeRoleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(AdviseeRoleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			AdviseeRole theAdviseeRole = (AdviseeRole)findAncestorWithClass(this, AdviseeRole.class);
			if (!theAdviseeRole.commitNeeded) {
				pageContext.getOut().print(theAdviseeRole.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing AdviseeRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdviseeRole for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			AdviseeRole theAdviseeRole = (AdviseeRole)findAncestorWithClass(this, AdviseeRole.class);
			return theAdviseeRole.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing AdviseeRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdviseeRole for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			AdviseeRole theAdviseeRole = (AdviseeRole)findAncestorWithClass(this, AdviseeRole.class);
			theAdviseeRole.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing AdviseeRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing AdviseeRole for subjectURI tag ");
		}
	}
}

