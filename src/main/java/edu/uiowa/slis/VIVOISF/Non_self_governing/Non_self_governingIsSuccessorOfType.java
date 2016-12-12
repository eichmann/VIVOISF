package edu.uiowa.slis.VIVOISF.Non_self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class Non_self_governingIsSuccessorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static Non_self_governingIsSuccessorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(Non_self_governingIsSuccessorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			Non_self_governingIsSuccessorOfIterator theNon_self_governingIsSuccessorOfIterator = (Non_self_governingIsSuccessorOfIterator)findAncestorWithClass(this, Non_self_governingIsSuccessorOfIterator.class);
			pageContext.getOut().print(theNon_self_governingIsSuccessorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Non_self_governing for isSuccessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Non_self_governing for isSuccessorOf tag ");
		}
		return SKIP_BODY;
	}
}

