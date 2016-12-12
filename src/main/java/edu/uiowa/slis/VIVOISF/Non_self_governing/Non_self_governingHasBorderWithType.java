package edu.uiowa.slis.VIVOISF.Non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Non_self_governingHasBorderWithType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Non_self_governingHasBorderWithType currentInstance = null;
	private static final Log log = LogFactory.getLog(Non_self_governingHasBorderWithType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Non_self_governingHasBorderWithIterator theNon_self_governingHasBorderWithIterator = (Non_self_governingHasBorderWithIterator)findAncestorWithClass(this, Non_self_governingHasBorderWithIterator.class);
			pageContext.getOut().print(theNon_self_governingHasBorderWithIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Non_self_governing for hasBorderWith tag ", e);
			throw new JspTagException("Error: Can't find enclosing Non_self_governing for hasBorderWith tag ");
		}
		return SKIP_BODY;
	}
}

