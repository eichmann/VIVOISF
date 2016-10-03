package edu.uiowa.slis.VIVOISF.Center;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class CenterEditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static CenterEditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(CenterEditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			CenterEditorInverseIterator theCenterEditorInverseIterator = (CenterEditorInverseIterator)findAncestorWithClass(this, CenterEditorInverseIterator.class);
			pageContext.getOut().print(theCenterEditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Center for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Center for editor tag ");
		}
		return SKIP_BODY;
	}
}

