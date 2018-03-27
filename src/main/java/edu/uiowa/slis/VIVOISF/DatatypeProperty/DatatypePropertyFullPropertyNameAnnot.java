package edu.uiowa.slis.VIVOISF.DatatypeProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatatypePropertyFullPropertyNameAnnot extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatatypePropertyFullPropertyNameAnnot currentInstance = null;
	private static final Log log = LogFactory.getLog(DatatypePropertyFullPropertyNameAnnot.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatatypePropertyFullPropertyNameAnnotIterator theDatatypeProperty = (DatatypePropertyFullPropertyNameAnnotIterator)findAncestorWithClass(this, DatatypePropertyFullPropertyNameAnnotIterator.class);
			pageContext.getOut().print(theDatatypeProperty.getFullPropertyNameAnnot());
		} catch (Exception e) {
			log.error("Can't find enclosing DatatypeProperty for fullPropertyNameAnnot tag ", e);
			throw new JspTagException("Error: Can't find enclosing DatatypeProperty for fullPropertyNameAnnot tag ");
		}
		return SKIP_BODY;
	}
}

