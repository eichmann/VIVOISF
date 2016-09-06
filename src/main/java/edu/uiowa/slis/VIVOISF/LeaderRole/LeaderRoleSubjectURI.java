package edu.uiowa.slis.VIVOISF.LeaderRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class LeaderRoleSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static LeaderRoleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(LeaderRoleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			LeaderRole theLeaderRole = (LeaderRole)findAncestorWithClass(this, LeaderRole.class);
			if (!theLeaderRole.commitNeeded) {
				pageContext.getOut().print(theLeaderRole.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing LeaderRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LeaderRole for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			LeaderRole theLeaderRole = (LeaderRole)findAncestorWithClass(this, LeaderRole.class);
			return theLeaderRole.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing LeaderRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LeaderRole for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			LeaderRole theLeaderRole = (LeaderRole)findAncestorWithClass(this, LeaderRole.class);
			theLeaderRole.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing LeaderRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing LeaderRole for subjectURI tag ");
		}
	}
}

