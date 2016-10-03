package edu.uiowa.slis.VIVOISF.OBI_0000272;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class OBI_0000272Editor extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static OBI_0000272Editor currentInstance = null;
	private static final Log log = LogFactory.getLog(OBI_0000272Editor.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			OBI_0000272EditorIterator theOBI_0000272EditorIterator = (OBI_0000272EditorIterator)findAncestorWithClass(this, OBI_0000272EditorIterator.class);
			pageContext.getOut().print(theOBI_0000272EditorIterator.getEditor());
		} catch (Exception e) {
			log.error("Can't find enclosing OBI_0000272 for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing OBI_0000272 for editor tag ");
		}
		return SKIP_BODY;
	}
}

