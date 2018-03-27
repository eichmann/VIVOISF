package edu.uiowa.slis.VIVOISF.FunctionalProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FunctionalPropertyExampleAnnot extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FunctionalPropertyExampleAnnot currentInstance = null;
	private static final Log log = LogFactory.getLog(FunctionalPropertyExampleAnnot.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FunctionalPropertyExampleAnnotIterator theFunctionalProperty = (FunctionalPropertyExampleAnnotIterator)findAncestorWithClass(this, FunctionalPropertyExampleAnnotIterator.class);
			pageContext.getOut().print(theFunctionalProperty.getExampleAnnot());
		} catch (Exception e) {
			log.error("Can't find enclosing FunctionalProperty for exampleAnnot tag ", e);
			throw new JspTagException("Error: Can't find enclosing FunctionalProperty for exampleAnnot tag ");
		}
		return SKIP_BODY;
	}
}

