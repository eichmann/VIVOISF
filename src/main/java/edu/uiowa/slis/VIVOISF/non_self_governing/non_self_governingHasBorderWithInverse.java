package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingHasBorderWithInverse extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingHasBorderWithInverse currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingHasBorderWithInverse.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingHasBorderWithInverseIterator thenon_self_governingHasBorderWithInverseIterator = (non_self_governingHasBorderWithInverseIterator)findAncestorWithClass(this, non_self_governingHasBorderWithInverseIterator.class);
			pageContext.getOut().print(thenon_self_governingHasBorderWithInverseIterator.getHasBorderWithInverse());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for hasBorderWith tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for hasBorderWith tag ");
		}
		return SKIP_BODY;
	}
}

