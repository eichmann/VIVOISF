package edu.uiowa.slis.VIVOISF.Editorship;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class EditorshipRO_0002353 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static EditorshipRO_0002353 currentInstance = null;
	private static final Log log = LogFactory.getLog(EditorshipRO_0002353.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			EditorshipRO_0002353Iterator theEditorshipRO_0002353Iterator = (EditorshipRO_0002353Iterator)findAncestorWithClass(this, EditorshipRO_0002353Iterator.class);
			pageContext.getOut().print(theEditorshipRO_0002353Iterator.getRO_0002353());
		} catch (Exception e) {
			log.error("Can't find enclosing Editorship for RO_0002353 tag ", e);
			throw new JspTagException("Error: Can't find enclosing Editorship for RO_0002353 tag ");
		}
		return SKIP_BODY;
	}
}

