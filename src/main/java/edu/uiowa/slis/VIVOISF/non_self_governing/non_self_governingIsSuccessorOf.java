package edu.uiowa.slis.VIVOISF.non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class non_self_governingIsSuccessorOf extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static non_self_governingIsSuccessorOf currentInstance = null;
	private static final Log log = LogFactory.getLog(non_self_governingIsSuccessorOf.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			non_self_governingIsSuccessorOfIterator thenon_self_governingIsSuccessorOfIterator = (non_self_governingIsSuccessorOfIterator)findAncestorWithClass(this, non_self_governingIsSuccessorOfIterator.class);
			pageContext.getOut().print(thenon_self_governingIsSuccessorOfIterator.getIsSuccessorOf());
		} catch (Exception e) {
			log.error("Can't find enclosing non_self_governing for isSuccessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing non_self_governing for isSuccessorOf tag ");
		}
		return SKIP_BODY;
	}
}

