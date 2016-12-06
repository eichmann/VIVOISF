package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingHasNameType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingHasNameType currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingHasNameType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingHasNameIterator thenon_self_governingHasNameIterator = (non_self_governingHasNameIterator)findAncestorWithClass(this, non_self_governingHasNameIterator.class);
			pageContext.getOut().print(thenon_self_governingHasNameIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for hasName tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for hasName tag ");
		}
		return SKIP_BODY;
	}
}

