package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipRO_0001015Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipRO_0001015Type currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipRO_0001015Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorshipRO_0001015Iterator theEditorshipRO_0001015Iterator = (EditorshipRO_0001015Iterator)findAncestorWithClass(this, EditorshipRO_0001015Iterator.class);
			pageContext.getOut().print(theEditorshipRO_0001015Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for RO_0001015 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for RO_0001015 tag ");
		}
		return SKIP_BODY;
	}
}

