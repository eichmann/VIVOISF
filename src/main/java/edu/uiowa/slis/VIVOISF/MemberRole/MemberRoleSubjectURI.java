package edu.uiowa.slis.VIVOISF.MemberRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MemberRoleSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static MemberRoleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(MemberRoleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			MemberRole theMemberRole = (MemberRole)findAncestorWithClass(this, MemberRole.class);
			if (!theMemberRole.commitNeeded) {
				pageContext.getOut().print(theMemberRole.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing MemberRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing MemberRole for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			MemberRole theMemberRole = (MemberRole)findAncestorWithClass(this, MemberRole.class);
			return theMemberRole.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing MemberRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing MemberRole for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			MemberRole theMemberRole = (MemberRole)findAncestorWithClass(this, MemberRole.class);
			theMemberRole.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing MemberRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing MemberRole for subjectURI tag ");
		}
	}
}

