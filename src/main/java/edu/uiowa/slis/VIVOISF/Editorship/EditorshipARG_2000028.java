package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipARG_2000028 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipARG_2000028 currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipARG_2000028.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorshipARG_2000028Iterator theEditorshipARG_2000028Iterator = (EditorshipARG_2000028Iterator)findAncestorWithClass(this, EditorshipARG_2000028Iterator.class);
			pageContext.getOut().print(theEditorshipARG_2000028Iterator.getARG_2000028());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for ARG_2000028 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for ARG_2000028 tag ");
		}
		return SKIP_BODY;
	}
}

