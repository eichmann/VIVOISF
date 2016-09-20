package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingIsAdministeredByInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingIsAdministeredByInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingIsAdministeredByInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingIsAdministeredByInverseIterator theself_governingIsAdministeredByInverseIterator = (self_governingIsAdministeredByInverseIterator)findAncestorWithClass(this, self_governingIsAdministeredByInverseIterator.class);
			pageContext.getOut().print(theself_governingIsAdministeredByInverseIterator.getIsAdministeredByInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for isAdministeredBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for isAdministeredBy tag ");
		}
		return SKIP_BODY;
	}
}

