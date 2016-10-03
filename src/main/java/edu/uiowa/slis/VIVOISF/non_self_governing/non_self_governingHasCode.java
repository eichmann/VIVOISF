package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingHasCode extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingHasCode currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingHasCode.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			non_self_governingHasCodeIterator thenon_self_governing = (non_self_governingHasCodeIterator)findAncestorWithClass(this, non_self_governingHasCodeIterator.class);
			pageContext.getOut().print(thenon_self_governing.getHasCode());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for hasCode tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for hasCode tag ");
		}
		return SKIP_BODY;
	}
}

