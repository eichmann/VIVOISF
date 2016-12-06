package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipBFO_0000050Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipBFO_0000050Type currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipBFO_0000050Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorshipBFO_0000050Iterator theEditorshipBFO_0000050Iterator = (EditorshipBFO_0000050Iterator)findAncestorWithClass(this, EditorshipBFO_0000050Iterator.class);
			pageContext.getOut().print(theEditorshipBFO_0000050Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for BFO_0000050 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for BFO_0000050 tag ");
		}
		return SKIP_BODY;
	}
}

