package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingIsAdministeredBy extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingIsAdministeredBy currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingIsAdministeredBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingIsAdministeredByIterator thenon_self_governingIsAdministeredByIterator = (non_self_governingIsAdministeredByIterator)findAncestorWithClass(this, non_self_governingIsAdministeredByIterator.class);
			pageContext.getOut().print(thenon_self_governingIsAdministeredByIterator.getIsAdministeredBy());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for isAdministeredBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for isAdministeredBy tag ");
		}
		return SKIP_BODY;
	}
}

