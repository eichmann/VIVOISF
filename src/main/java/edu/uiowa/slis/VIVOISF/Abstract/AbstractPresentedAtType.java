package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractPresentedAtType extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractPresentedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractPresentedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractPresentedAtIterator theAbstractPresentedAtIterator = (AbstractPresentedAtIterator)findAncestorWithClass(this, AbstractPresentedAtIterator.class);
			pageContext.getOut().print(theAbstractPresentedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

