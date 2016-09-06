package edu.uiowa.slis.VIVOISF.EditorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorRoleRoleContributesTo extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorRoleRoleContributesTo currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorRoleRoleContributesTo.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorRoleRoleContributesToIterator theEditorRoleRoleContributesToIterator = (EditorRoleRoleContributesToIterator)findAncestorWithClass(this, EditorRoleRoleContributesToIterator.class);
			pageContext.getOut().print(theEditorRoleRoleContributesToIterator.getRoleContributesTo());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorRole for roleContributesTo tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorRole for roleContributesTo tag ");
		}
		return SKIP_BODY;
	}
}

