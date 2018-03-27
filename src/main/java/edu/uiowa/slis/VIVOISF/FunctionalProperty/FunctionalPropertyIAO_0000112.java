package edu.uiowa.slis.VIVOISF.FunctionalProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FunctionalPropertyIAO_0000112 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FunctionalPropertyIAO_0000112 currentInstance = null;
	private static final Log log = LogFactory.getLog(FunctionalPropertyIAO_0000112.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FunctionalPropertyIAO_0000112Iterator theFunctionalProperty = (FunctionalPropertyIAO_0000112Iterator)findAncestorWithClass(this, FunctionalPropertyIAO_0000112Iterator.class);
			pageContext.getOut().print(theFunctionalProperty.getIAO_0000112());
		} catch (Exception e) {
			log.error("Can't find enclosing FunctionalProperty for IAO_0000112 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FunctionalProperty for IAO_0000112 tag ");
		}
		return SKIP_BODY;
	}
}

