package edu.uiowa.slis.VIVOISF.EditorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorRoleRO_0000052 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorRoleRO_0000052 currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorRoleRO_0000052.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorRoleRO_0000052Iterator theEditorRoleRO_0000052Iterator = (EditorRoleRO_0000052Iterator)findAncestorWithClass(this, EditorRoleRO_0000052Iterator.class);
			pageContext.getOut().print(theEditorRoleRO_0000052Iterator.getRO_0000052());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorRole for RO_0000052 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorRole for RO_0000052 tag ");
		}
		return SKIP_BODY;
	}
}

