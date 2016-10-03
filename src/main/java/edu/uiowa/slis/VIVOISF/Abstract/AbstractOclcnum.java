package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractOclcnum extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractOclcnum currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractOclcnum.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractOclcnumIterator theAbstract = (AbstractOclcnumIterator)findAncestorWithClass(this, AbstractOclcnumIterator.class);
			pageContext.getOut().print(theAbstract.getOclcnum());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for oclcnum tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for oclcnum tag ");
		}
		return SKIP_BODY;
	}
}

