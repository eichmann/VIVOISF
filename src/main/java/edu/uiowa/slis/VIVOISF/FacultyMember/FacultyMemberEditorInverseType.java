package edu.uiowa.slis.VIVOISF.FacultyMember;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FacultyMemberEditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FacultyMemberEditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(FacultyMemberEditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FacultyMemberEditorInverseIterator theFacultyMemberEditorInverseIterator = (FacultyMemberEditorInverseIterator)findAncestorWithClass(this, FacultyMemberEditorInverseIterator.class);
			pageContext.getOut().print(theFacultyMemberEditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing FacultyMember for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing FacultyMember for editor tag ");
		}
		return SKIP_BODY;
	}
}

