package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingRelates extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingRelates currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingRelates.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingRelatesIterator thenon_self_governingRelatesIterator = (non_self_governingRelatesIterator)findAncestorWithClass(this, non_self_governingRelatesIterator.class);
			pageContext.getOut().print(thenon_self_governingRelatesIterator.getRelates());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for relates tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for relates tag ");
		}
		return SKIP_BODY;
	}
}

