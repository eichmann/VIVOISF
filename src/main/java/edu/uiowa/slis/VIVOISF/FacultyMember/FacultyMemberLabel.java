package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			FacultyMember theFacultyMember = (FacultyMember)findAncestorWithClass(this, FacultyMember.class);
			if (!theFacultyMember.commitNeeded) {
				pageContext.getOut().print(theFacultyMember.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			FacultyMember theFacultyMember = (FacultyMember)findAncestorWithClass(this, FacultyMember.class);
			return theFacultyMember.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing FacultyMember for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			FacultyMember theFacultyMember = (FacultyMember)findAncestorWithClass(this, FacultyMember.class);
			theFacultyMember.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for label tag ");
		}
	}
}

