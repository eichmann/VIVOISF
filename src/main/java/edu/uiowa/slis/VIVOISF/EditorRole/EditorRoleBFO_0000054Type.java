package edu.uiowa.slis.VIVOISF.EditorRole;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorRoleBFO_0000054Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorRoleBFO_0000054Type currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorRoleBFO_0000054Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorRoleBFO_0000054Iterator theEditorRoleBFO_0000054Iterator = (EditorRoleBFO_0000054Iterator)findAncestorWithClass(this, EditorRoleBFO_0000054Iterator.class);
			pageContext.getOut().print(theEditorRoleBFO_0000054Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing EditorRole for BFO_0000054 tag ", e);
			throw new JspTagException("Error: Can't find enclosing EditorRole for BFO_0000054 tag ");
		}
		return SKIP_BODY;
	}
}

