package edu.uiowa.slis.VIVOISF.EditorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorRoleLabel extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorRoleLabel currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorRoleLabel.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			EditorRole theEditorRole = (EditorRole)findAncestorWithClass(this, EditorRole.class);
			if (!theEditorRole.commitNeeded) {
				pageContext.getOut().print(theEditorRole.getLabel());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing EditorRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorRole for label tag ");
		}
		return SKIP_BODY;
	}

	public String getLabel() throws JspTagException {
		try {
			EditorRole theEditorRole = (EditorRole)findAncestorWithClass(this, EditorRole.class);
			return theEditorRole.getLabel();
		} catch (Exception e) {
			log.error(" Can't find enclosing EditorRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorRole for label tag ");
		}
	}

	public void setLabel(String label) throws JspTagException {
		try {
			EditorRole theEditorRole = (EditorRole)findAncestorWithClass(this, EditorRole.class);
			theEditorRole.setLabel(label);
		} catch (Exception e) {
			log.error("Can't find enclosing EditorRole for label tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorRole for label tag ");
		}
	}
}

