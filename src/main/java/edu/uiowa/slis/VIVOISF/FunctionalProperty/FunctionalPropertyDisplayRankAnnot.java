package edu.uiowa.slis.VIVOISF.FunctionalProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FunctionalPropertyDisplayRankAnnot extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FunctionalPropertyDisplayRankAnnot currentInstance = null;
	private static final Log log = LogFactory.getLog(FunctionalPropertyDisplayRankAnnot.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FunctionalPropertyDisplayRankAnnotIterator theFunctionalProperty = (FunctionalPropertyDisplayRankAnnotIterator)findAncestorWithClass(this, FunctionalPropertyDisplayRankAnnotIterator.class);
			pageContext.getOut().print(theFunctionalProperty.getDisplayRankAnnot());
		} catch (Exception e) {
			log.error("Can't find enclosing FunctionalProperty for displayRankAnnot tag ", e);
			throw new JspTagException("Error: Can't find enclosing FunctionalProperty for displayRankAnnot tag ");
		}
		return SKIP_BODY;
	}
}

