package edu.uiowa.slis.VIVOISF.FunctionalProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FunctionalPropertyIAO_0000116 extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FunctionalPropertyIAO_0000116 currentInstance = null;
	private static final Log log = LogFactory.getLog(FunctionalPropertyIAO_0000116.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FunctionalPropertyIAO_0000116Iterator theFunctionalProperty = (FunctionalPropertyIAO_0000116Iterator)findAncestorWithClass(this, FunctionalPropertyIAO_0000116Iterator.class);
			pageContext.getOut().print(theFunctionalProperty.getIAO_0000116());
		} catch (Exception e) {
			log.error("Can't find enclosing FunctionalProperty for IAO_0000116 tag ", e);
			throw new JspTagException("Error: Can't find enclosing FunctionalProperty for IAO_0000116 tag ");
		}
		return SKIP_BODY;
	}
}

