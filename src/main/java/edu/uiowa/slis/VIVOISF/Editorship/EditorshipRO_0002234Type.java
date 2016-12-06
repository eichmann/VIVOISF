package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipRO_0002234Type extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipRO_0002234Type currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipRO_0002234Type.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorshipRO_0002234Iterator theEditorshipRO_0002234Iterator = (EditorshipRO_0002234Iterator)findAncestorWithClass(this, EditorshipRO_0002234Iterator.class);
			pageContext.getOut().print(theEditorshipRO_0002234Iterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for RO_0002234 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for RO_0002234 tag ");
		}
		return SKIP_BODY;
	}
}

