package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractPresentedAt extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractPresentedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractPresentedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			AbstractPresentedAtIterator theAbstractPresentedAtIterator = (AbstractPresentedAtIterator)findAncestorWithClass(this, AbstractPresentedAtIterator.class);
			pageContext.getOut().print(theAbstractPresentedAtIterator.getPresentedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for presentedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for presentedAt tag ");
		}
		return SKIP_BODY;
	}
}

