package edu.uiowa.slis.VIVOISF.Abstract;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class AbstractEdition extends edu.uiowa.slis.VIVOISF.TagLibSupport {
	static AbstractEdition currentInstance = null;
	private static final Log log = LogFactory.getLog(AbstractEdition.class);

	// non-functional property

	public int doStartTag() throws JspException {
		try {
			AbstractEditionIterator theAbstract = (AbstractEditionIterator)findAncestorWithClass(this, AbstractEditionIterator.class);
			pageContext.getOut().print(theAbstract.getEdition());
		} catch (Exception e) {
			log.error("Can't find enclosing Abstract for edition tag ", e);
			throw new JspTagException("Error: Can't find enclosing Abstract for edition tag ");
		}
		return SKIP_BODY;
	}
}

