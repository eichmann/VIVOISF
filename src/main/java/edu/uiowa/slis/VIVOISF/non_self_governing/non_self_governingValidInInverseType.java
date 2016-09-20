package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingValidInInverseType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingValidInInverseType currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingValidInInverseType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingValidInInverseIterator thenon_self_governingValidInInverseIterator = (non_self_governingValidInInverseIterator)findAncestorWithClass(this, non_self_governingValidInInverseIterator.class);
			pageContext.getOut().print(thenon_self_governingValidInInverseIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for validIn tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for validIn tag ");
		}
		return SKIP_BODY;
	}
}

