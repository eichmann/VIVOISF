package edu.uiowa.slis.VIVOISF.InverseFunctionalProperty;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class InverseFunctionalPropertyTheType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static InverseFunctionalPropertyTheType currentInstance = null;
	private static final Log log = LogFactory.getLog(InverseFunctionalPropertyTheType.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			InverseFunctionalPropertyTheTypeIterator theInverseFunctionalProperty = (InverseFunctionalPropertyTheTypeIterator)findAncestorWithClass(this, InverseFunctionalPropertyTheTypeIterator.class);
			pageContext.getOut().print(theInverseFunctionalProperty.getTheType());
		} catch (Exception e) {
			log.error("Can't find enclosing InverseFunctionalProperty for theType tag ", e);
			throw new JspTagException("Error: Can't find enclosing InverseFunctionalProperty for theType tag ");
		}
		return SKIP_BODY;
	}
}

