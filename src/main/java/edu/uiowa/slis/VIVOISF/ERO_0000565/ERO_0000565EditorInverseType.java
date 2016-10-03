package edu.uiowa.slis.VIVOISF.ERO_0000565;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ERO_0000565EditorInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ERO_0000565EditorInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(ERO_0000565EditorInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ERO_0000565EditorInverseIterator theERO_0000565EditorInverseIterator = (ERO_0000565EditorInverseIterator)findAncestorWithClass(this, ERO_0000565EditorInverseIterator.class);
			pageContext.getOut().print(theERO_0000565EditorInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing ERO_0000565 for editor tag ", e);
			throw new JspTagException("Error: Can't find enclosing ERO_0000565 for editor tag ");
		}
		return SKIP_BODY;
	}
}

