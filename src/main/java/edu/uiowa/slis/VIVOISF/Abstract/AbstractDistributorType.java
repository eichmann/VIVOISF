package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractDistributorType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractDistributorType currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractDistributorType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractDistributorIterator theAbstractDistributorIterator = (AbstractDistributorIterator)findAncestorWithClass(this, AbstractDistributorIterator.class);
			pageContext.getOut().print(theAbstractDistributorIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for distributor tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for distributor tag ");
		}
		return SKIP_BODY;
	}
}

