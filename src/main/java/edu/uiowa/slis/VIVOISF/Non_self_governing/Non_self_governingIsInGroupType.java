package edu.uiowa.slis.VIVOISF.Non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Non_self_governingIsInGroupType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Non_self_governingIsInGroupType currentInstance = null;
	private static final Log log = LogFactory.getLog(Non_self_governingIsInGroupType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Non_self_governingIsInGroupIterator theNon_self_governingIsInGroupIterator = (Non_self_governingIsInGroupIterator)findAncestorWithClass(this, Non_self_governingIsInGroupIterator.class);
			pageContext.getOut().print(theNon_self_governingIsInGroupIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Non_self_governing for isInGroup tag ", e);
			throw new JspTagException("Error: Can't find enclosing Non_self_governing for isInGroup tag ");
		}
		return SKIP_BODY;
	}
}

