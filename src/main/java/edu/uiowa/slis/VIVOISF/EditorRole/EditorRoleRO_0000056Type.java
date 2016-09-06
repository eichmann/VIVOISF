package edu.uiowa.slis.VIVOISF.EditorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorRoleRO_0000056Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorRoleRO_0000056Type currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorRoleRO_0000056Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorRoleRO_0000056Iterator theEditorRoleRO_0000056Iterator = (EditorRoleRO_0000056Iterator)findAncestorWithClass(this, EditorRoleRO_0000056Iterator.class);
			pageContext.getOut().print(theEditorRoleRO_0000056Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorRole for RO_0000056 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorRole for RO_0000056 tag ");
		}
		return SKIP_BODY;
	}
}

