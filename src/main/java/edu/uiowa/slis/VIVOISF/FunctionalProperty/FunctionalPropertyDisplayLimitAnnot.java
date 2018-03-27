package edu.uiowa.slis.VIVOISF.FunctionalProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FunctionalPropertyDisplayLimitAnnot extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FunctionalPropertyDisplayLimitAnnot currentInstance = null;
	private static final Log log = LogFactory.getLog(FunctionalPropertyDisplayLimitAnnot.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FunctionalPropertyDisplayLimitAnnotIterator theFunctionalProperty = (FunctionalPropertyDisplayLimitAnnotIterator)findAncestorWithClass(this, FunctionalPropertyDisplayLimitAnnotIterator.class);
			pageContext.getOut().print(theFunctionalProperty.getDisplayLimitAnnot());
		} catch (Exception e) {
			log.error("Can't find enclosing FunctionalProperty for displayLimitAnnot tag ", e);
			throw new JspTagException("Error: Can't find enclosing FunctionalProperty for displayLimitAnnot tag ");
		}
		return SKIP_BODY;
	}
}

