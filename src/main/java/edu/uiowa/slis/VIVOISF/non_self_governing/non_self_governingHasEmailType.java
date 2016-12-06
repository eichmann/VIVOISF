package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingHasEmailType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingHasEmailType currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingHasEmailType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingHasEmailIterator thenon_self_governingHasEmailIterator = (non_self_governingHasEmailIterator)findAncestorWithClass(this, non_self_governingHasEmailIterator.class);
			pageContext.getOut().print(thenon_self_governingHasEmailIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for hasEmail tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for hasEmail tag ");
		}
		return SKIP_BODY;
	}
}

