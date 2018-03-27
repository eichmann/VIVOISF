package edu.uiowa.slis.VIVOISF.DatatypeProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class DatatypePropertyExampleAnnot extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static DatatypePropertyExampleAnnot currentInstance = null;
	private static final Log log = LogFactory.getLog(DatatypePropertyExampleAnnot.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			DatatypePropertyExampleAnnotIterator theDatatypeProperty = (DatatypePropertyExampleAnnotIterator)findAncestorWithClass(this, DatatypePropertyExampleAnnotIterator.class);
			pageContext.getOut().print(theDatatypeProperty.getExampleAnnot());
		} catch (Exception e) {
			log.error("Can't find enclosing DatatypeProperty for exampleAnnot tag ", e);
			throw new JspTagException("Error: Can't find enclosing DatatypeProperty for exampleAnnot tag ");
		}
		return SKIP_BODY;
	}
}

