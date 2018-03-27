package edu.uiowa.slis.VIVOISF.FunctionalProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FunctionalPropertyTheType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static FunctionalPropertyTheType currentInstance = null;
	private static final Log log = LogFactory.getLog(FunctionalPropertyTheType.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			FunctionalPropertyTheTypeIterator theFunctionalProperty = (FunctionalPropertyTheTypeIterator)findAncestorWithClass(this, FunctionalPropertyTheTypeIterator.class);
			pageContext.getOut().print(theFunctionalProperty.getTheType());
		} catch (Exception e) {
			log.error("Can't find enclosing FunctionalProperty for theType tag ", e);
			throw new JspTagException("Error: Can't find enclosing FunctionalProperty for theType tag ");
		}
		return SKIP_BODY;
	}
}

