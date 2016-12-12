package edu.uiowa.slis.VIVOISF.Non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Non_self_governingIsAdministeredByType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Non_self_governingIsAdministeredByType currentInstance = null;
	private static final Log log = LogFactory.getLog(Non_self_governingIsAdministeredByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Non_self_governingIsAdministeredByIterator theNon_self_governingIsAdministeredByIterator = (Non_self_governingIsAdministeredByIterator)findAncestorWithClass(this, Non_self_governingIsAdministeredByIterator.class);
			pageContext.getOut().print(theNon_self_governingIsAdministeredByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Non_self_governing for isAdministeredBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Non_self_governing for isAdministeredBy tag ");
		}
		return SKIP_BODY;
	}
}

