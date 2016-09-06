package edu.uiowa.slis.VIVOISF.PresenterRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class PresenterRoleSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static PresenterRoleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(PresenterRoleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			PresenterRole thePresenterRole = (PresenterRole)findAncestorWithClass(this, PresenterRole.class);
			if (!thePresenterRole.commitNeeded) {
				pageContext.getOut().print(thePresenterRole.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing PresenterRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PresenterRole for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			PresenterRole thePresenterRole = (PresenterRole)findAncestorWithClass(this, PresenterRole.class);
			return thePresenterRole.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing PresenterRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PresenterRole for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			PresenterRole thePresenterRole = (PresenterRole)findAncestorWithClass(this, PresenterRole.class);
			thePresenterRole.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing PresenterRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing PresenterRole for subjectURI tag ");
		}
	}
}

