package edu.uiowa.slis.VIVOISF.self_governing;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class self_governingIsSuccessorOfType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static self_governingIsSuccessorOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(self_governingIsSuccessorOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			self_governingIsSuccessorOfIterator theself_governingIsSuccessorOfIterator = (self_governingIsSuccessorOfIterator)findAncestorWithClass(this, self_governingIsSuccessorOfIterator.class);
			pageContext.getOut().print(theself_governingIsSuccessorOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing self_governing for isSuccessorOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing self_governing for isSuccessorOf tag ");
		}
		return SKIP_BODY;
	}
}

