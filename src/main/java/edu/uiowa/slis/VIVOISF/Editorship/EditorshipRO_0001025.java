package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipRO_0001025 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipRO_0001025 currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipRO_0001025.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorshipRO_0001025Iterator theEditorshipRO_0001025Iterator = (EditorshipRO_0001025Iterator)findAncestorWithClass(this, EditorshipRO_0001025Iterator.class);
			pageContext.getOut().print(theEditorshipRO_0001025Iterator.getRO_0001025());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for RO_0001025 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for RO_0001025 tag ");
		}
		return SKIP_BODY;
	}
}

