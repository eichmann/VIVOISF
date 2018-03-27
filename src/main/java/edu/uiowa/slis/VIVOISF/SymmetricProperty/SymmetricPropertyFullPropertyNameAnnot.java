package edu.uiowa.slis.VIVOISF.SymmetricProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SymmetricPropertyFullPropertyNameAnnot extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static SymmetricPropertyFullPropertyNameAnnot currentInstance = null;
	private static final Log log = LogFactory.getLog(SymmetricPropertyFullPropertyNameAnnot.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			SymmetricPropertyFullPropertyNameAnnotIterator theSymmetricProperty = (SymmetricPropertyFullPropertyNameAnnotIterator)findAncestorWithClass(this, SymmetricPropertyFullPropertyNameAnnotIterator.class);
			pageContext.getOut().print(theSymmetricProperty.getFullPropertyNameAnnot());
		} catch (Exception e) {
			log.error("Can't find enclosing SymmetricProperty for fullPropertyNameAnnot tag ", e);
			throw new JspTagException("Error: Can't find enclosing SymmetricProperty for fullPropertyNameAnnot tag ");
		}
		return SKIP_BODY;
	}
}

