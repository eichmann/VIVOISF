package edu.uiowa.slis.VIVOISF.EditorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorRoleSubjectURI extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorRoleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorRoleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EditorRole theEditorRole = (EditorRole)findAncestorWithClass(this, EditorRole.class);
			if (!theEditorRole.commitNeeded) {
				pageContext.getOut().print(theEditorRole.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EditorRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorRole for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			EditorRole theEditorRole = (EditorRole)findAncestorWithClass(this, EditorRole.class);
			return theEditorRole.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing EditorRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorRole for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			EditorRole theEditorRole = (EditorRole)findAncestorWithClass(this, EditorRole.class);
			theEditorRole.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing EditorRole for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorRole for subjectURI tag ");
		}
	}
}

