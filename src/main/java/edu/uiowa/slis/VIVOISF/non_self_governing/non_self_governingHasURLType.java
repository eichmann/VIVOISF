package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingHasURLType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingHasURLType currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingHasURLType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingHasURLIterator thenon_self_governingHasURLIterator = (non_self_governingHasURLIterator)findAncestorWithClass(this, non_self_governingHasURLIterator.class);
			pageContext.getOut().print(thenon_self_governingHasURLIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for hasURL tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for hasURL tag ");
		}
		return SKIP_BODY;
	}
}

