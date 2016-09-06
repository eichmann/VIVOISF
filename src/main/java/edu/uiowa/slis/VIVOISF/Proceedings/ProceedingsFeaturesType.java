package edu.uiowa.slis.VIVOISF.Proceedings;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ProceedingsFeaturesType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static ProceedingsFeaturesType currentInstance = null;
	private static final Log log = LogFactory.getLog(ProceedingsFeaturesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ProceedingsFeaturesIterator theProceedingsFeaturesIterator = (ProceedingsFeaturesIterator)findAncestorWithClass(this, ProceedingsFeaturesIterator.class);
			pageContext.getOut().print(theProceedingsFeaturesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Proceedings for features tag ", e);
			throw new JspTagException("Error: Can't find enclosing Proceedings for features tag ");
		}
		return SKIP_BODY;
	}
}

